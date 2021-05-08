import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) throws FileNotFoundException {
        ReadThisFile();
    }

    public static void ReadThisFile() throws FileNotFoundException {
        File file = new File("inheritanceAndFiles/Ressources/File.CSV");
        Scanner filScn = new Scanner(new FileInputStream(file));

        filScn.nextLine();

        int count = 0;
        while(filScn.hasNext()){
            String words = filScn.next();
            count++;
        }
        System.out.println("Amount of words in file: " + count);
    }
}
