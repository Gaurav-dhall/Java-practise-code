public class totpath {
    public static int countPath(int n,int m, int i,int j){
       if(i==n||j==m){
        return 0;
       }
       
        if(i==n-1&&j==m-1){
            return 1;
        }
        
        int downpaths=countPath(n, m, i+1, j);
        int rightpaths=countPath(n, m, i, j+1);
        return downpaths+rightpaths;
    }
    public static void main(String[] args) {
        int n=3;int m=3;
        System.out.println("Total paths are :-"+countPath(3, 3, 0, 0));


    }
}
