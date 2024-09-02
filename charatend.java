import java.util.*;

public class charatend {
    public static void moveAtEnd(String str,char key,String news,int i,int n){
        if(i==str.length()){
            for(int k=1;k<=n;k++){
                news+=key;
            }
            System.out.print("The new string is:- "+news);
            return;
        }
        
        if(str.charAt(i)!=key){
            news+=str.charAt(i);
        }
        else{
            n++;
        }
        moveAtEnd(str, key, news, i+1, n);
    }
    public static void main(String[] args) {
        System.out.print("Enter the string:- ");
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        System.out.print("Enter the charachter you want to move at the end:- ");
        String s=sc.next();
        char key=s.charAt(0);
        moveAtEnd(str, key, "", 0, 0);

    }
}
