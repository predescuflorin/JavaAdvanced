package advancedServerIO;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1" , 9999 );
        InputStream inputStream = s.getInputStream();
        OutputStream outputStream = s.getOutputStream();

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(outputStream));
        BufferedReader in = new BufferedReader(new InputStreamReader(inputStream));

        Scanner scanner = new Scanner(System.in);
        String linez = scanner.nextLine();
        out.write(linez);
        out.flush();
        outputStream.close();




    }
}

