public class sub {
    public static void sbsqncs(String str,int i,String newstr){
        if(i==str.length()){
            System.out.println(newstr);
            return;
        }
        sbsqncs(str, i+1, newstr+str.charAt(i));
        sbsqncs(str, i+1, newstr);
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Subsequences of the string abc are:- ");
        sbsqncs(str, 0, "");
    }
}

