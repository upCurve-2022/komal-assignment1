import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q8{


    public static void main(String args[]) throws IOException {
        q8 x = new q8();
        x.newFile();
    }

    public static void newFile() throws IOException {
        String strPath = "", strName = "";



        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
        System.out.println("Enter the file name:");


        strName = br.readLine();
        System.out.println("Enter the file path:");


        strPath = br.readLine();

        File file1
                = new File(strPath + "" + strName + ".txt");

        // Method createNewFile() method creates blank
        // file.
        file1.createNewFile();
    }

}

