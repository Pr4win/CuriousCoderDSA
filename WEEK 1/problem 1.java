// write a program that takes an integer,then a string,then a char from the user and prints them in the screen.
// input; 2 Name y
/* Expected output;  2
                     Name 
                     y                */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER INPUT");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);
        String word = scan.next();
        System.out.println(word);
        char letter = scan.next().charAt(0);
        System.out.println(letter);
}
}

