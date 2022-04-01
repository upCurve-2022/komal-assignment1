import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class q9 {
    public static void main(String args[]) throws IOException {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String name=sc.nextLine();
        FileOutputStream fos=new FileOutputStream(name, true);
        System.out.print("Enter file content: ");
        String str=sc.nextLine()+"\n";
        byte[] b= str.getBytes();
        fos.write(b);
        fos.close();
        System.out.println("file saved.");

    }
}
