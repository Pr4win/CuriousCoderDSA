// palindrome array
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER ARRAY SIZE");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("INPUT OVER");
        int flag=1;
        int j=n-1;
        for(int i=0;i<n;i++){
            if(a[i]!=a[j]){
                flag=0;
                break;
            }
            j--;
        }
        if(flag==1){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }
}
