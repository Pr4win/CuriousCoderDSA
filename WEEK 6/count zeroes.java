// COUNT ZEROES
import java.util.Scanner;
class Main {
    static int countzero(int n){
        if(n%10==n){
            return 0;
            }   
        else if(n%10==0){
            return 1+countzero(n/10);
         }else{
            return countzero(n/10);
          }
    }
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        int count=Main.countzero(n);
        System.out.print(count);
    }
}
