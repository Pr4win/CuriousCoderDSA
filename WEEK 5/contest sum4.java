/* Pitsy needs help with the given task by her teacher. The task is to divide an array into two halves (left and right) containing n/2 elements each and do the sum of the each. half and then multiply both the sum. In case of odd number of elements, include the odd one in the second half.
Example1: arr =[1,2,3,4] Array has 4 elements so half is going to be 2 elements each, First half sum=1+2=3 Second half sum=3+4=7.So now to multiply them=3*7=21
Example2: arr =[5,3,9,12,3] First half sum = 5 + 3 = 8 Second half sum = 9+12+3=24 So now to multiply them=8*24=192
Note: If the length of the array is odd then the right half will contain one element more than the left half.    */
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter array");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("INPUT OVER");
        int sum1=0;
        for(int i=0;i<=n/2-1;i++){
            sum1=sum1+arr[i];
        }
        int sum2=0;
        for(int i=n/2;i<n;i++){
            sum2=sum2+arr[i];
        }
        System.out.println(sum1*sum2);
    }
}
