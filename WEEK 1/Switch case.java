//Using switch case
// print days in a week
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER INPUT(1 to 7)");
        Scanner scan=new Scanner(System.in);
        int day = scan.nextInt();
        switch(day){
            case 1:
            System.out.println("Sunday");
            break;
            case 2:
            System.out.println("Monday");
            break;
            case 3:
            System.out.println("Tuesday");
            break;
            case 4: 
            System.out.println("Wednesday");
            break;
            case 5:
            System.out.println("Thursday");
            break;
            case 6:
            System.out.println("Friday");
            break;
            case 7:
            System.out.println("Saturday");
            break;
            default:
            System.out.println("INVALID");
            break;
        }
    }
}
