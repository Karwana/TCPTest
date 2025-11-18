package ServerToClient;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Client {

    int port = 33333;

    public Client() throws IOException {

        Socket socket = new Socket("127.0.0.1", 33333);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String temp;

        while (true) {
            System.out.println("recieved: " + in.readLine());
        }
    }

    void main() {}
}
