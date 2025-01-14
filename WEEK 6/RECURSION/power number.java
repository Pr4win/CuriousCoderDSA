// POWER OF A NUMBER
import java.util.Scanner;
class Main {
    static int powerOfNumber(int a,int b,int i){
        if(i==b){
            return a;
        }
        return a*powerOfNumber(a,b,i+1);
    }
    public static void main(String[] args) {
        System.out.println("ENTER BASE");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("ENTER POWER");
        int b=sc.nextInt();
        System.out.println("YOUR OUTPUT is");
        int power=Main.powerOfNumber(a,b,1);
        System.out.println(power);
    }
}
