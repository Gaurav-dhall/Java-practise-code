import java.util.*;

public class checkoccur {
    public static int first=-1;
    public static int last=-1;
    public static void checkO(String str,int i,char key){
        if(i==str.length()){
            System.out.println("First occurance is at index "+first);
            System.out.print("Last occurance is at index "+last);
            return;
        }
        if(str.charAt(i)==key){
            if(first==-1){
                first=i;
            }else{
                last=i;
            }
        }
        checkO(str, i+1, key);

    }
    public static void main(String[] args) {
        System.out.print("Enter the string:- ");
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        System.out.print("Enter the charachter whose first and last occurance you want to check:- ");
        String k=sc.next();
        char key=k.charAt(0);
        checkO(str, 0, key);

    }
}
