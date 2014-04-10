package ch.desm.middleware.modules.core.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServer {

	ServerSocket server;
	Socket client;
	
	public SocketServer(int port){

		initialize(port);
	}
	
	private void initialize(int port){
		try {
			server = new ServerSocket(4000);
			client = server.accept();
			
			
			OutputStream outStream = client.getOutputStream();
			PrintWriter out = new PrintWriter(outStream);
			
			InputStream inputStream = client.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader in = new BufferedReader(inputStreamReader);
			
			String inputLine = "";
			while((inputLine = in.readLine()) != null){
				System.out.println(inputLine);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
