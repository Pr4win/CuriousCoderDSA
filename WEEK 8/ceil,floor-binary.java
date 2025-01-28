// ceil the floor-Binary search
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int a []={5,6,10,8,9,6,5,5,6};
        int x=7;
        int n=a.length;
        Arrays.sort(a);
        System.out.print("floor,ceil = ");
        System.out.println(floor(a,n,x)+","+ceil(a,n,x));
    }
    static int floor(int[] a,int n,int x){
        int i=0,j=n-1;
        if(a[0]>x){
            return -1;
        }
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==x){
                return x;
            }else if(a[mid]>x){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return a[j];
    }
    static int ceil(int[] a,int n,int x){
        int i=0,j=n-1;
        if(a[n-1]<x){
            return -1;
        }
        while(i<=j){
            int mid=(i+j)/2;
            if(a[mid]==x){
                return x;
            }else if(a[mid]>x){
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return a[i];
    }
}
