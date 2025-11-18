package ServerToClient;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    int port = 33333;

    public Server() throws IOException, InterruptedException {

        ServerSocket serverSocket = new ServerSocket(33333);
        // skicka till klient
        Socket socket = serverSocket.accept();
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


        String temp;
        while (true) {
            out.println("Hello from server");
            Thread.sleep(3000);
        }

    }

    void main() {}
}
