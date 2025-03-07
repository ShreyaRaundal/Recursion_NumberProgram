public class DecreasingNumber {
    public static void main(String[] args) {
        int num = 9876; // Change to test different numbers
        System.out.println(isDecreasing(num) ? "Decreasing Number" : "Not Decreasing Number");
    }

    public static boolean isDecreasing(int num) {
        while (num > 9) {
            int d = num % 10;      // Last digit
            int x = (num / 10) % 10; // Second last digit

            if (x <= d) return false; // Not strictly decreasing
            num /= 10; // Remove last digit
        }
        return true; // If all digits are in decreasing order
    }
}
