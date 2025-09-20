class Solution {
    public static boolean isPalindrome(int x) {
        int num = x;
        int reverse = 0;
        if (x < 0) {
            return false;
        }
        while (x > 0) {
            int lastdigit = x % 10;
            reverse = reverse * 10 + lastdigit;
            x = x / 10;
        }
        return reverse == num;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean ans = isPalindrome(x);
        System.out.println(ans);

    }
}
