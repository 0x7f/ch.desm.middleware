package ch.desm.middleware.app;

import org.apache.commons.lang3.SystemUtils;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StartAppMain {

    private static Logger LOGGER = Logger.getLogger(StartAppMain.class);

    public static void main(String[] args){
        final String userDir = System.getProperty("user.dir");
        LOGGER.log(Level.INFO, "initialise middleware...");
        LOGGER.log(Level.INFO, "starting directory: "+ userDir);

        RunAppSingleton main = RunAppSingleton.getSingleton();

        //String host, String port, String websocketContextPath, String serverEndpointContextPath, String jettyPath
        if(args.length >0 && args.length <= 4){
            main.setConfiguration(args[0], args[1], args[2], args[3], args[4]);
        } else {
            main.setConfiguration("192.168.178.20", "8070", "/websocket", "/gui", userDir);
        }

        if(main.isConfigured()){
            LOGGER.log(Level.INFO, "starting middleware...");
            main.start();
        }else{
            LOGGER.log(Level.ERROR, "configuration error: " + Arrays.asList(args));
        }

        LOGGER.log(Level.INFO, "Press any key to close middleware...");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        try {
            br.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

        LOGGER.log(Level.INFO, "shutting down middleware...");
        System.exit(0);
    }
}
