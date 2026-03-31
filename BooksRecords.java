package p1;
import java.util.Scanner;
import java.io.*;
import java.util.Scanner;

public class BooksRecords {
    public static void BookData(AvailableBooks[]AB) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        try {

        	FileWriter fw=new FileWriter("Books Record.txt");
            fw.write("-----------Books Record---------");
            fw.close();
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
        	
        	
            System.out.println("Error writing to file.");
        }

        sc.close();
    }
}