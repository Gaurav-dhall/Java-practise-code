import java.util.*;

public class strrev {
    public static void revStr(String str,int i){
        if(i<0){
            return;
        }
        System.out.print(str.charAt(i));
        revStr(str, i-1);

    }
    public static void main(String[] args) {
        String str;
        System.out.print("Enter the string:- ");
        Scanner sc= new Scanner(System.in);

        str=sc.next();
        revStr(str, str.length()-1);



    }
}
