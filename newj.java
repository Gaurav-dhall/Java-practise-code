import java.util.*;

public class newj {
    public static void toh(int n, String src,String hel,String des){
        if(n==0){
            return;
        }
        toh(n-1, src, des, hel);
        System.out.println("Tranfer disk "+n+" from "+src+" to "+des);
        toh(n-1, hel, src, des);
    }
public static void main(String[] args) {
    System.out.print("Enter the number of disks:- ");
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    toh(n,"s","h","d");
}
}
