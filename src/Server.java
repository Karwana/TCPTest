import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 333333;
    public Server() throws IOException {

        ServerSocket serverSocket = new ServerSocket(333333);
        // lyssna på klienter
        Socket socket = serverSocket.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
    }

    void main() {



    }
}
