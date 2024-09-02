public class checkStriIncr {
    public static boolean striIncr (int [] arr,int i ){
        if(i==arr.length-1){
            return true;

        }
        if(arr[i]<arr[i+1]){
            striIncr(arr, i+1);
        }
       return false;
      
        
    } 
    public static void main(String[] args) {
        int arr[]={1,2,4,4,5};
        boolean result=striIncr(arr, 0);
        if(result==true){
            System.out.println("Array is strictly ");
        }
        else{
            System.out.println("Array is not strictly increasing");
        }

    }
}
