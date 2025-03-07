public class MysteryNumber {
    public static void main(String[] args) {
        int num = 121; // Change this to test other numbers
        System.out.println(isMystery(num) ? "Mystery Number" : "Not a Mystery Number");
    }

    public static boolean isMystery(int num) {
        for (int i = 1; i <= num / 2; i++) { // Checking possible numbers
            int rev = reverse(i);
            if (i + rev == num) return true; // If sum matches, it's a mystery number
        }
        return false;
    }

    public static int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
