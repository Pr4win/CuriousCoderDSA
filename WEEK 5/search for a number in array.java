// search for a number in array with return function
class Search{
    int linearSearch(){
        int a[]={23,45,37,4,87};
        int n=5,x=4;
        for(int i=0;i<n;i++){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
}
class Main {
    public static void main(String[] args) {
        Search pravin=new Search();
        int ans=pravin.linearSearch();
        System.out.println(ans);
    }
}
