/* write a program using switch case which takes a value and prints the respective size.
     if size is 29 then it is small
     if size is 30 then it is medium
     if size is 38 then it is large
     if size is 42 then it is xlarge
     if size is not any of the above then invalid    */
// input; 29
// Expected output; small
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER INPUT");
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        switch(size) {
            case 29:
                System.out.println("SMALL");
                break;
            case 30:
                System.out.println("MEDIUM");
                break;
            case 38:
                System.out.println("LARGE");
                break;
            case 42:
                System.out.println("XLARGE");
                break;
            default:
                System.out.println("INVALID");
        }
}
}
