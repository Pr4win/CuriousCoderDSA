//smallest element in array
class Main{
    public static void main(String[] args){
        int a[]={345,387,67,988,876};
        int n=5, small=a[0];
        for(int i=0;i<n;i++){
           if(small>a[i]){
               small=a[i];
           }
        }
        System.out.println("smallest number in the array is "+small);
    }
}
