//move all negative elements
class Main {
    public static void main(String[] args) {
        int a []={1,-1,3,2,0,-7,-5,11,6};
        int n=a.length;
        int b []=new int [n];
        int j=0;
        for(int i=0; i<n; i++){
            if(a[i]>=0){
                b[j]=a[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            if(a[i]<0){
                b[j]=a[i];
                j++;
            }
        }
        for(int i=0; i<n; i++){
            a[i]=b[i];
            System.out.print(a[i]+" ");
        }
    }
}
