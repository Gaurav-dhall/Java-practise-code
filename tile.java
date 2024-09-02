public class tile {

    public static int NoOfWays(int bredth , int length){

        if(length==bredth){
            return 2;
        }
        if(bredth<length){
            return 1;
        }
        //hprizontal counts
        int horicount=NoOfWays(bredth-1,length);
       //vertical counts
       int verticount=NoOfWays(bredth-length,length);
       return horicount+verticount; 
    }
    public static void main(String[] args) {
        int bredth=5;int length=3;
        //tile length =2 ,bredth=1
       System.out.println("no of ways are:-"+ NoOfWays(bredth, length));
    }
}
