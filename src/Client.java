import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

    int port = 33333;
    public Client() throws IOException {

        Socket socket = new Socket("127.0.0.1", 33333);
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String temp;

        while ((temp = in.readLine()) != null) {
            out.println(temp);
            System.out.println("sent message: " + temp);
        }
    }
    void main() {}
}
