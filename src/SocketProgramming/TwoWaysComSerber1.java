package SocketProgramming;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class TwoWaysComSerber1 {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main (String [] args){
        try{

            System.out.println("please Enter your name");
            TwoWaysComSerber1 user1 = new TwoWaysComSerber1();
            Scanner scanner = new Scanner(System.in);
            System.out.println("please enter your user name ");
            String username = scanner.next();
            user1.setName(username);
            // Creating Server Side Socket to accept request
            ServerSocket socket = new ServerSocket(4000);
            System.out.println("Server is ready to accept the message");
            Socket socket1 = socket.accept();
            System.out.println("request accepted for communication");
            InputStream inputStream = socket1.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            // Out Put Stream to send data back to client

            OutputStream outputStream = socket1.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            while (true){
                String message = dataInputStream.readUTF();
                System.out.println(message);

                System.out.print(user1.getName()+": ");
                String reply = scanner.nextLine();
                dataOutputStream.writeUTF(reply);
            }


        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
