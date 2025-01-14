// SUM OF GIGITS IN A NUMBER
import java.util.Scanner;
class Main {
    static int sumOfDigit(int n){
        if(n%10==n){
            return n;
            }else{
            return n%10+sumOfDigit(n/10);
          }
    }
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        int sum=Main.sumOfDigit(n);
        System.out.print(sum);
    }
}
