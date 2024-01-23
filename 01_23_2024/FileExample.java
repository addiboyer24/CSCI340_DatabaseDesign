import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileExample{
    public static void main(String[] args) throws IOException {
        FileReader myReader = new FileReader("FileExample.txt");
        Scanner myScanner = new Scanner(myReader);
        String[] headers = myScanner.nextLine().split(",");

        for (String header: headers){
            System.out.println(header);
        }

        while(myScanner.hasNextLine()){
            String[] data = myScanner.nextLine().split(",");
            String name = data[0];
            int age = Integer.parseInt(data[1]);
            String favoriteColor = data[2];
            Person myPerson = new Person(name, age, favoriteColor);
            System.out.println(myPerson);
        }
    }
}