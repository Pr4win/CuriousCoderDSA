// INSERTION SORT
class Main {
    public static void main(String[] args) {
        int a []={8,3,9,17,1,10,12};
        int n=7;
        for(int i=1; i<n; i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && key<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
        }
        for(int i=0; i<n; i++){
            System.out.print(a[i]+" ");
        }
    }
}
