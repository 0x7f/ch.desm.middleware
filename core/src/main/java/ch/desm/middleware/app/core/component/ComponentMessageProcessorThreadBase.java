package ch.desm.middleware.app.core.component;

import ch.desm.middleware.app.common.FrequencyLimiter;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sebastian on 08.11.2014.
 */
public abstract class ComponentMessageProcessorThreadBase<T> extends Thread {

    private static Logger LOGGER = Logger.getLogger(ComponentMessageProcessorThreadBase.class);

    private static final float DEFAULT_POLLING_FREQUENCY = 25;

    private Object pendingMessagesLock;
    private List<T> pendingMessages;

    public ComponentMessageProcessorThreadBase() {
        pendingMessages = new ArrayList<T>();
        pendingMessagesLock = new Object();
    }

    public abstract void processPendingMessages();

    public List<T> getMessages(){
        synchronized (pendingMessagesLock){
            List<T> messages = new ArrayList<>(pendingMessages);
            pendingMessages.clear();
            return messages;
        }
    }

    public void addMessages(List<T> messagesList){
        synchronized (pendingMessagesLock) {
            pendingMessages.addAll(messagesList);
        }
    }

    public void addMessage(T message){
        synchronized (pendingMessagesLock){
            pendingMessages.add(message);
        }
    }

    public void run(){
        final FrequencyLimiter frequencyLimiter = new FrequencyLimiter(DEFAULT_POLLING_FREQUENCY);

        while (!interrupted()) {
            final long startMillis = System.currentTimeMillis();

            processPendingMessages();

            try {
                frequencyLimiter.ensureLimit(startMillis);
            } catch (InterruptedException e) {
                LOGGER.log(Level.ERROR, e);
                break;
            }
        }
    }



}
