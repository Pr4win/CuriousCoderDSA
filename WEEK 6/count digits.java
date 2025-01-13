// COUNT DIGITS OF A NUMBER
import java.util.Scanner;
class Main {
    static int countDigit(int n){
        if(n%10==n){
            return 1;
            }else{
            return 1+countDigit(n/10);
          }
    }
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        int count=Main.countDigit(n);
        System.out.print(count);
    }
}
