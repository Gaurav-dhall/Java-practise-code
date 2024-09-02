public class perm {
    public static void printperm(String str, String newstr){
        if(str.length()==0){
            System.out.println(newstr);
            return;
        }
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newst=str.substring(0, i)+str.substring(i+1);
            printperm(newst, newstr+curr);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        System.out.println("All possible permutations of the string are:- ");
        printperm(str, "");
    }
}
