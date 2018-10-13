package client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Server {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    
    public boolean startConnection(String host, int port) {
        try {
            this.clientSocket = new Socket(host, port);
            this.out = new PrintWriter(this.clientSocket.getOutputStream(), true);
            this.in = new BufferedReader(new InputStreamReader(this.clientSocket.getInputStream()));
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String sendMessage(String msg) {
        try {
            this.out.println(msg);
            return in.readLine();
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
    public boolean stopConnection() {
        try {
            this.clientSocket.shutdownInput();
            this.clientSocket.shutdownOutput();
            this.clientSocket.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}