package advancedServerIO;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket s = serverSocket.accept();

        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

        String linex =in.readLine();
//        System.out.println("Clientul a trimis: " + linex);



    }

}
