public class backed{

    public static void perm(String str,String out){
        if(str.length()==0){
            System.out.println(out);
            return;
        }


        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            
            String newst=str.substring(0, i)+str.substring(i+1);
            perm(newst, out+curr);
        }
    }
    public static void main(String[] args) {
        String str= "abc";
        System.out.print("All possible outcomes are as follows ");
        perm(str, "");
    }
}