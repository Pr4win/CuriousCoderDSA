// FIBONACCI SERIES (0,1,1,2,3,5,8,13,21,34...)
import java.util.Scanner;
class Main {
    static int fib(int n){
        if(n==1){
            return 1;
        }else if(n==0){
            return 0;
         }else{
            return fib(n-1)+fib(n-2);
          }
    }
    public static void main(String[] args) {
        System.out.println("ENTER nth term");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        int fibo=Main.fib(n);
        System.out.print(fibo);
    }
}
