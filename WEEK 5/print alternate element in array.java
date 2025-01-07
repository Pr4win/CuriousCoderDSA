//print alternate element in array
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        System.out.println("ENTER ARRAY SIZE");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("INPUT OVER");
        for(int i=0;i<n;i=i+2){
            System.out.println(a[i]);
        }
    }
}
