/*  Given two arrays (Get first input for one array and then again get for the other array), find if the product of two array are same. If same, print 1 else print 0. First get n which is the number of elements in both the array(both arrays has same number of elements)
Input: n=5 , arr1 = [4, 1, 3, 9, 3] arr2 = [2, 9, 4, 4, 2]
Output: 0
Explanation: Product of arr1 = 4*1*3*9*3 = 324 
Product of arr2 = 2*9*4*4*2 = 576 So 324 is not equal to 576    */
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int n=sc.nextInt();
        int arr1[]=new int[n];
        int sum1=1;
        System.out.println("Enter array1");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
            sum1=sum1*arr1[i];
        }
        int arr2[]=new int[n];
        int sum2=1;
        System.out.println("Enter array2");
        for(int i=0;i<n;i++){
            arr2[i]=sc.nextInt();
            sum2=sum2*arr2[i];
        }
        if(sum1==sum2){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}
