// intersection of two array-BRUTE FORCE
class Main {
    public static int intersection(int[] res,int k,int[] a,int[] b){
        int n=a.length;
        int m=b.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(a[i]==b[j]){
                    int flag=1;
                    for(int h=0; h<k; h++){
                        if(a[i]==res[h]){
                            flag=0;
                        }
                    }
                    if(flag==1){
                        res[k]=a[i];
                        k++;
                    }
                }
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,7};
        int [] b = {4,8,9,7};
        int n=a.length;
        int m=b.length;
        int res []=new int[n+m];
        int k=0;
        k=intersection(res,k,a,b);
        for(int i=0; i<k; i++){
            System.out.print(res[i]+" ");
        }
    }
}
