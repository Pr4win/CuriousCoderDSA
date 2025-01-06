////add +5 to array after then count the  number of odd and even numbers in the array
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
        System.out.println("updated array is");
        int even=0,odd=0;
        for(int i=0;i<n;i++){
            a[i]=a[i]+5;
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
            System.out.println(a[i]);
        }
        System.out.println("odd count="+odd);
        System.out.println("even count="+even);
    }
}
