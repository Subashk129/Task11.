package javaBasic.Task11;

public class Q5arrayExcetion {
    
        public static void main(String[] args) {
           
        int[] numbers = {1, 2, 3, 4, 5};
    
    try {
        // Access an element at an index beyond the array's bounds
         int value = numbers[6];
        System.out.println("Value at index 6: " + value);
     } catch (ArrayIndexOutOfBoundsException e) {
         // Handling the ArrayIndexOutOfBoundsException
        System.out.println("Error: Array index out of bounds!");
     }
               
        
         String text = "Hello, subash";

    try {
        // Access a character at an index beyond the string's length
        char ch = text.charAt(15);
        System.out.println("Character at index 15: " + ch);
    } catch (StringIndexOutOfBoundsException e) {
        // Handling the StringIndexOutOfBoundsException
        System.out.println("Error: String index out of bounds!");
    }
}

}    

    
