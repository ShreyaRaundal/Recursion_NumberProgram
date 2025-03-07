public class BouncyNumber {
    public static void main(String[] args){
        int num=12354;
        System.out.println(isBouncy(num)?"Bouncy Number":"Not Bouncy NUmber");
    }
    public static boolean isBouncy(int num){
        boolean inc=false,dec=false;

        while (num>9) {
            int d=num%10;
            int x=(num/10)%10;

            if(x<d)inc=true;
            if(x>d)dec=true;

            if(inc&&dec)return true;
            num/=10;
            
        }
        return false;
    }
}
