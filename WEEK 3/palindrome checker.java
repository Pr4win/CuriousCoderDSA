import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int n = scan.nextInt();
       int p=n;
       int sum=0;
       while(n>0){
           int l=n%10;
           sum=sum*10+(l);
           n=n/10;
       }
       if(sum==p){
           System.out.println("It is a PALINDROME");
       }
       else{
           System.out.println("It is not a PALINDROME");
       }
    }
}
