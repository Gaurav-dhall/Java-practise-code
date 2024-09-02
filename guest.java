import java.util.*;

public class guest {
    
    public static int NoOfWays(int guest){
        if(guest<=1){
            return 1;
        }
        // single
      int singleways=  NoOfWays(guest-1);
        //mingle
       int mingleways=(guest-1)* NoOfWays(guest-2);
       return singleways+mingleways;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System .in);
        System.out.print("Enter the number of guest ");
        int guest= sc.nextInt();
        System.out.print("You can call them by:- "+NoOfWays(guest)+" ways");
    }
}
