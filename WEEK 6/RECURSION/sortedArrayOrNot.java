// ARRAY IS SORTED OR NOT ?
class Main {
    static boolean checkSorted(int n,int a[],int i){
        if(i>=n-1){
            return true;
        }if(a[i]>a[i+1]){
            return false;
        }
        return checkSorted(n,a,i+1);
    }
    public static void main(String[] args) {
        int a []={45,87,40,33,27};
        System.out.print(checkSorted(5,a,0));
    }
}
