// BINARY SEARCH
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("ENTER n");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("ENTER x");
        int x=sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER ARRAY ELEMENTS");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int low=0,high=n-1,flag=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(a[mid]==x){
                flag=mid;
                break;
            }else if(a[mid]>x){
                high=mid-1;
            }else if(a[mid]<x){
                low=mid+1;
            }
        }
        if(flag!=0){
            System.out.println("INDEX of x = "+flag);
        }
        else{
            System.out.println("ELEMENT NOT FOUND");
        }
        sc.close();
    }
}
