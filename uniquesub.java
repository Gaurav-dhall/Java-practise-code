import java.util.HashSet;

public class uniquesub {
    public static void subsqncs(String str,int i,String newstr,HashSet<String>set){
        if(set.contains(newstr)){
            return;
        }
        else{
            System.out.println(newstr);
            set.add(newstr);
            return;
        }
       
        subsqncs(str, i+1, newstr+str.charAt(i), set);
        subsqncs(str, i+1, newstr, set);
    }
    public static void main(String[] args) {
       String str= "abc";
       System.out.println("Unique subsequences of the dtring str are:- ");
       HashSet <String> set= new HashSet<>();
       subsqncs(str, 0, "", set);
    }
}
