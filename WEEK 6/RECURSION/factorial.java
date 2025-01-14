// RECURSION (n factorial recursively)
import java.util.Scanner;
public class Main {
    static int fact(int n){
        if(n==1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        int fact=Main.fact(n);
        System.out.println(fact);
        sc.close();
    }
}
