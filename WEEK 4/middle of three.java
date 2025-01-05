//middle one among 3 numbers
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();
          if((a<b&&a>c)||(a>b&&a<c)){
            System.out.println("A is the middle");  
          }
          else if((b<a&&b>c)||(b>a&&b<c)){
            System.out.println("B is the middle");  
          }
         else {
            System.out.println("C is the middle");  
          }
    }
}
