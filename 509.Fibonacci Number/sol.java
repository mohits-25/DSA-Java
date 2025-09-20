import java.util.Scanner;

class Solution {
    public int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (int count = 2; count <= n; count++) {
            int temp = b;
            b = b + a;
            a = temp;
        }
        return b; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        
        Solution sol = new Solution();
        int result = sol.fib(n); 
        System.out.println("Fibonacci number at position " + n + " is: " + result);
        
        sc.close();
    }
}