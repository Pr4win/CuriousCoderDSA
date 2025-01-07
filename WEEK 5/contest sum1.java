/*Given an array, print the sum or even values in the array.
  Input: n=5,arr = [2, 3, 5, 6, 8] , Output: 16
EXPLANATION: So here the even values are 2,6,8.So sum of them is 16. */
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        int sum=0;
        System.out.println("Enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]%2==0){
                sum=sum+arr[i];
            }
        }
        System.out.println("INPUT OVER");
        System.out.println(sum);
    }
}
