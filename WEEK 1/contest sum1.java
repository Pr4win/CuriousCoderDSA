//Write a program which takes a value N and prints the sum of N natural numbers. Natural numbers start from 1.
//Explanation: Sum of natural numbers from 1 to N, here N is 5, so 1+2+3+4+5 is 15. Input N = 5; Expected output : 15
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER INPUT");
        Scanner scan = new Scanner(System.in);
         int N = scan.nextInt();
         int sum = 0;
         for(int i=1;i<=N;i++) {
             sum = sum+i;
         }
         System.out.println(sum);
}
}
