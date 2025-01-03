//write a program which takes two values x and y.prints x for y numbern of times.
/* Input: 2   
          3
   Output:2
          2
          2  */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER INPUT");
        Scanner scan = new Scanner(System.in);
         int x = scan.nextInt();
         int y = scan.nextInt();
         for(int i=0;i<y;i++) {
             System.out.println(x);
         }
}
}
