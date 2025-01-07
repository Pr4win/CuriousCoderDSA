//min&max element product of two arrays
class Main {
    public static void main(String[] args) {
        int a1[] ={5,7,9,3,6,2};
        int a2[] ={1,2,6,1,9};
        int n1=6,max=0;
        for(int i=0; i<n1; i++){
            if(max<a1[i]){
                max=a1[i];
            }
        }
        int n2=5,min=a2[0];
        for(int i=0; i<n2; i++){
            if(min>a2[i]){
                min=a2[i];
            }
        }
        System.out.println(max*min);
    }
}
