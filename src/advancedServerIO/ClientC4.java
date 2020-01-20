package advancedServerIO;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientC4 {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("127.0.0.1", 999);

        OutputStream outputStream = socket.getOutputStream();
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("end")) {
                break;
            } else {
                writer.write(line);
                writer.write("\n");
            }
        }
        writer.close();

    }
}
