package SocketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main (String [] args){
        try
        {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server Socket is created and ready to accept the request");
            Socket socket = serverSocket.accept();
            System.out.println("Request Accepted and Socket is created");
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            String message = dataInputStream.readUTF();
            System.out.println(message);

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
