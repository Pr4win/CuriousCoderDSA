// second largest element
class Main {
    public static void main(String[] args) {
        int a[]={2,4,9,5,7};
        int max=0,max2=-1;
        for(int i=0; i<a.length; i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0; i<a.length; i++){
            if(a[i]>max2 && a[i]!=max){
                max2=a[i];
            }
        }
        System.out.println("second largest element");
        System.out.println(max2);
    }
}
