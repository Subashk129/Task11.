package javaBasic.Task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Q8implimentation {
    
    public static void main(String[] args) {
        // file path
        String filePath = "guvi.txt";
        
        try {
            File file = new File(filePath);

            Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()){
            String data = scanner.nextLine();
            System.out.println(data);
        }
        
        scanner.close();
    } catch (FileNotFoundException e) {

        System.out.println("Error: File not found.Please make sure the file exixts.");
    }
           
        }
    }
