public class Recursionutorial {
    public static void main(String[] args){
        sayHi(10);
    }
    private static void sayHi(int count){
        System.out.println("Hi");

        if(count<=1){
            return;
        }
        sayHi(count-1);
    }
}
