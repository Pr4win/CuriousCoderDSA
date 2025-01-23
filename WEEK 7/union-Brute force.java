// union of two array-BRUTE FORCE
class Main {
    public static int union(int[] res,int k,int[] a){
        int n=a.length;
        for(int i=0; i<n; i++){
            int flag=1;
            for(int j=0; j<k; j++){
                if(a[i]==res[j]){
                    flag=0;
                    break;
                }
            }
            if(flag==1){
                res[k]=a[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int [] a = {3,4,5,6,6,7,7,7,8};
        int [] b = {4,5,5,8,9,9,10,19, 20};
        int n=a.length;
        int m=b.length;
        int res []=new int[n+m];
        int k=0;
        k=union(res,k,a);
        k=union(res,k,b);
        for(int i=0; i<k; i++){
            System.out.print(res[i]+" ");
        }
    }
}
