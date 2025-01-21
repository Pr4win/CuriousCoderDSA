//remove duplicates from sorted array
class Main {
    public static void main(String[] args) {
        int a []={2,4,4,4,4,6,6,7,8,9,9,10,10};
        int n=a.length;
        int j=0,i=0;
        while(i<n-1){
            if(a[i]<a[i+1]){
                a[j]=a[i];
                j++;
                i++;
            }else{
                i++;
            }
        }
        a[j]=a[n-1];
        j++;
        for(i=0; i<j; i++){
            System.out.print(a[i]+" ");
        }
    }
}
