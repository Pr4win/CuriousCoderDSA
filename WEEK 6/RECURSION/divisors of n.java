// DIVISORS OF n
import java.util.Scanner;
class Main {
    static void divisors(int n,int i){
        if(i>n){
            return ;
        }if(n%i==0){
            System.out.print(i+" ");
        }
        divisors(n,i+1);
    }
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        Main.divisors(n,1);
    }
}
