//write a program to take x and print multiples of x till 1000
/* Input: 100
   Output:100 200 300 400 500 600 700 800 900 1000  */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER INPUT");
        Scanner scan = new Scanner(System.in);
         int x = scan.nextInt();
         for(int i=x;i<=1000;i=i+100) {
             System.out.println(i);
         }
}
}
