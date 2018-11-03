import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Message {
    String text;
    PrintWriter out;
    public Message(String t) {
        text = t;
    }
    public void send(Socket socket) throws Exception {
        out = new PrintWriter(socket.getOutputStream());
        out.println(text);
    }
}
