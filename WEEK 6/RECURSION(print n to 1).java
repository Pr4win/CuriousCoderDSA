// RECURSION (print n to 1,recursively)
import java.util.Scanner;
public class Main {
    static void printn(int n){
        if(n==0){
            return ;
        }else{
            System.out.print(n+" ");
            printn(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        Main.printn(n);
    }
}
