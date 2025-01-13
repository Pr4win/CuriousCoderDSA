// sum of n numbers(1 to n)
import java.util.Scanner;
class Main {
    static int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n+sum(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        int sum=Main.sum(n);
        System.out.print(sum);
    }
}
