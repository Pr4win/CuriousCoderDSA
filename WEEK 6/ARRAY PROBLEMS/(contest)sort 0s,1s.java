//  Given an array arr consisting of only 0's and 1's in random order. Modify the array to segregate 0s onto the left side and 1s onto the right side of the array.
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a []=new int [n];
        System.out.println("ENTER array");
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int left=0,mid=0,right=a.length-1;
        int i=0;
        while(mid<=right){
            if(a[mid]==0){
                mid++;
            }else{
                int temp=a[mid];
                a[mid]=a[right];
                a[right]=temp;
                right--;
            }
        }
        for(i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
