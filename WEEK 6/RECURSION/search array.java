// search index of the element in the array
class Main {
    static int searchArray(int n,int a[],int i,int target){
        if(i>=n){
            return -1;
        }else if(a[i]==target){
            return i;
        }else{
            return searchArray(n,a,i+1,target);
         }
    }
    public static void main(String[] args) {
        int a []={45,87,40,33,27};
        int target=Main.searchArray(5,a,0,27);
        System.out.print(target);
    }
}
