package Tasks.Modul_11.Chat_Server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Client implements Runnable{

    Socket socket;
    Scanner in;
    PrintStream out;
    ChatServer server;

    DateFormat df = new SimpleDateFormat("HH:mm:ss");
    Date date;

    public Client(Socket socket, ChatServer server) {
        this.socket = socket;
        this.server = server;
        new Thread(this).start();
    }

    void receive(String message) {
        date = new Date();
        out.println(df.format(date) + ": " +message);
    }

    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            in = new Scanner(is);
            out = new PrintStream(os);

            out.println("Welcome to chat!");
            String input = in.nextLine();
            while (!input.equals("bye")) {
                server.sendAll(input);
                input = in.nextLine();
            }
            socket.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
