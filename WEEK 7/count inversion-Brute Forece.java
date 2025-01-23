// COUNT INVERSION-BRUTE FORCE APPROACH
class Main {
    public static void main(String[] args) {
        int a []={2,4,1,3,5};
        int n=5,count=0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
