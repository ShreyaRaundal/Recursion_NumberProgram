public class IncreasingNumber {
    public static void main(String[] args){
        int num=1234;
        System.out.println(isIncreasing(num)?"Increasing Number":"Not Increasing Number");
    }
    public static boolean isIncreasing(int num){
        while (num > 9) {
            int d = num % 10;      // Last digit
            int x = (num / 10) % 10; // Second last digit

            if (x >= d) return false; // Not increasing
            num /= 10; // Remove last digit
        }
        return true; 

    }
}
