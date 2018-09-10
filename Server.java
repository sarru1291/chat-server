import java.io.*;
import java.net.*;
import java.util.*;

public class Server {

    public static void main(String... arg) throws IOException {

        ServerSocket serverSocket = new ServerSocket(5000);
        Socket socket = serverSocket.accept();
        PrintStream ps = new PrintStream(System.out);
        ps.println("\n Connection established!!\n");
        Scanner sc = new Scanner(soc.getInputStream());
        Scanner sc1 = new Scanner(System.in);
        PrintStream ps1 = new PrintStream(soc.getOutputStream());
        String str = "";
        while (true) {
            str = sc.nextLine();
            ps.println("client>> " + str);

            ps.print("server>> ");
            String str1 = sc1.nextLine();
            ps1.println(str1);

        }
    }
}