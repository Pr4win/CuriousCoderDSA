// Leaders in an array
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        int a []={16,17,4,3,5,2};
        int n=a.length;
        ArrayList<Integer> b=new ArrayList<>();
        int max=a[n-1];
        b.add(max);
        for(int i=n-2; i>=0; i--){
           if(a[i]>=max){
               max=a[i];
               b.add(0,max);
           }
        }
        for(int i=0; i<b.size(); i++){
            System.out.print(b.get(i)+" ");
        }
    }
}
