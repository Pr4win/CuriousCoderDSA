// print 1 to n recursively
import java.util.Scanner;
public class Main {
    static void reversen(int n){
        if(n==0){
            return ;
        }else{
            reversen(n-1);
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        Main.reversen(n);
    }
}
