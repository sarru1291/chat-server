import java.io.*;
import java.net.*;
import java.util.*;

public class client {

    public static void main(String... s) throws IOException {

        Socket soc = new Socket("192.168.43.82", 5000);
        String str = "";
        PrintStream ps = new PrintStream(soc.getOutputStream());
        PrintStream ps1 = new PrintStream(System.out);
        Scanner sc = new Scanner(soc.getInputStream());
        Scanner sc1 = new Scanner(System.in);
        ps1.print("Press CTRL+C to exit !!!\n");
        while (true) {
            ps1.print("client>> ");
            str = sc1.nextLine();
            ps.println(str);
            String str1 = sc.nextLine();

            ps1.println("server>> " + str1);

        }
    }
}