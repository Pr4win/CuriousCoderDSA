//Find n-th term of series 1,3,6,10,15,21...
import java.util.Scanner;
class Main{
    public static void main(String[] args){
          System.out.println("ENTER N"); 
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int sum=0;
          for(int i=1;i<=n;i++){
            sum=sum+i;
          }
          System.out.println(sum);    
    }
}
