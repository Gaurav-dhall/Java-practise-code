import java.util.*;

public class dupli {
    public static boolean[] arr=new boolean[26];

    public static void removeDupli(String str,int i,String news){
        if(i==str.length()){
            System.out.print(news);
            return;
        }
            if(arr[str.charAt(i)-'a']==true){
                removeDupli(str, i+1, news);

            }else{
                news+=str.charAt(i);
                arr[str.charAt(i)-'a']=true;
                removeDupli(str, i+1, news);
            }
    }
    public static void main(String[] args) {
        System.out.print("Enter the string:- ");
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.print("New string after removal of duplicate charachter is ");
        removeDupli(str,0, "");
        
    }
}
