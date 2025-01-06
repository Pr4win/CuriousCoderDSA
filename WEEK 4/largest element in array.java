//Largest element in array
class Main{
    public static void main(String[] args){
        int a[]={345,387,67,988,876};
        int n=5, large=0;
        for(int i=0;i<n;i++){
           if(large<a[i]){
               large=a[i];
           }
        }
        System.out.println("largest number in the array is "+large);
    }
}
