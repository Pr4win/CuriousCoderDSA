//write a program to get firstname and lastname and n as input and print fullname that ios firstname+lastname for n times.
/* Input: Nandy Raja 4
   Output: NandyRaja NandyRaja NandyRaja NandyRaja  */
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER INPUT");
        Scanner scan = new Scanner(System.in);
         String x = scan.nextLine();
         String y = scan.nextLine();
         int z = scan.nextInt();
         String k = x+y;
         for(int i=0;i<z;i++) {
             System.out.println(k);
         }
}
}
