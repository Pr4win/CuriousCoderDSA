//  Array duplicates-BRUTE FORCE
import java.util.ArrayList;
import java.util.List;
class Main {
    public static void main(String[] args) {
        int a []={2,3,1,2,3};
        int n=a.length;
        List<Integer> res=new ArrayList<>();
        int k=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]==a[j]){
                    int flag=1;
                    for(int h=0; h<k; h++){
                        if(a[i]==res.get(h)){
                            flag=0;
                        }
                    }
                    if(flag==1){
                        res.add(a[i]);
                        k++;
                    }
                }
            }
        }
        for(int i=0; i<res.size(); i++){
            System.out.print(res.get(i)+" ");
        }
    }
}
