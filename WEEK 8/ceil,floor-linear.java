// ceil the floor-linear search
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
        for(int i=n-1; i>=0; i--){
            if(a[i]<=x){
                return a[i];
            }
        }
        return -1;
    }
    static int ceil(int[] a,int n,int x){
        for(int i=0; i<=n; i++){
            if(a[i]>=x){
                return a[i];
            }
        }
        return -1;
    }
}
