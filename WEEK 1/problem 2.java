// write a program to check whether a triangle can be formed with the given values for the angles.
// input; 45 45 45
// Expected output; Triangle cannot be formed
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER INPUT");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a+b+c == 180) {
            System.out.println("Triangle can be formed");
        }else {
            System.out.println("Triangle cannot be formed");
        }
}
}

