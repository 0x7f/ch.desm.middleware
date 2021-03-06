package ch.desm.middleware.app.core.server;

import ch.desm.middleware.app.common.DaemonThreadBase;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;

import java.io.File;
import java.net.InetSocketAddress;

/**
 * Created by Sebastian on 21.10.2014.
 */
public class JettyServer extends DaemonThreadBase {

    private InetSocketAddress inetSocketAddress;
    private String projectDir;
    private String targetDir = "artifacts/core_war_exploded";

    public JettyServer(String projectDir){
        this.inetSocketAddress = new InetSocketAddress("0.0.0.0", 80);
        this.projectDir = projectDir;
    }

    private static Logger LOGGER = Logger.getLogger(JettyServer.class);
    private Server server;

    public void run(){

        LOGGER.log(Level.TRACE, "Jetty Webserver is starting ...");

        //int port = Integer.parseInt(System.getProperty("port", port));
        this.server = new Server(inetSocketAddress);

        WebAppContext context = new WebAppContext();
        context.setContextPath("/");
        context.setDescriptor(projectDir + "/target/" + targetDir+"/WEB-INF/web.xml");//location.toExternalForm() + "WEB-INF/web.xml");
        context.setServer(server);
        context.setWar(projectDir + "/target/"+targetDir);//);

        // (Optional) Set the directory the war will extract to.
        // If not set, java.io.tmpdir will be used, which can cause problems
        // if the temp directory gets cleaned periodically.
        // Your build scripts should remove this directory between deployments
        context.setTempDirectory(new File(projectDir + "/target/"+targetDir+"/tmp"));
        server.setHandler(context);
        try {
            // Initialize javax.websocket layer
            //ServerContainer wscontainer = WebSocketServerContainerInitializer.configureContext(context);
            // Add WebSocket endpoint to javax.websocket layer
            //wscontainer.addEndpoint(EndpointWebsocketServer.class);
            server.start();
            server.join();
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Jetty Webserver start failed:" + e);
        }
    }

    public boolean isStarted(){
        if(server != null){
            return server.isStarted();
        }
        return false;
    }
}
