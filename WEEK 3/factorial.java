//factorial of a number
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
