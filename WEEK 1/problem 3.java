/* given mark of student,print the grade
   GRADE A if mark is greater than or equal to 90
   GRADE B if mark is greater than or equal to 80
   GRADE C if mark is greater than or equal to 60
   GRADE D if mark is greater than or equal to 35
   FAIL if mark is lesser 35    */
// input; 95
// Expected output; GRADE A
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER INPUT");
        Scanner scan = new Scanner(System.in);
        int mark = scan.nextInt();
        if (mark >= 90) {
            System.out.println("GRADE A");
        }else if (mark >= 80) {
            System.out.println("GRADE B");
        }else if (mark >= 60) {
            System.out.println("GRADE C");
        }else if (mark >= 35) {
            System.out.println("GRADE D");
        }else 
            System.out.println("FAIL");
}
}
