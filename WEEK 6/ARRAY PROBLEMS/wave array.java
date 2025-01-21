// wave array
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        int a []={2, 4, 7, 8, 9, 10};
        int n=a.length;
        for(int i=0; i<n-1; i=i+2){
            int temp=a[i];
            a[i]=a[i+1];
            a[i+1]=temp;
        }
        System.out.print(Arrays.toString(a));
    }
}
