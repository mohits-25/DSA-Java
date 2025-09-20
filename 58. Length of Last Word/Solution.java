import java.util.*;

public class Solution{
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                length++;
            } else {
                if (length > 0)
                    return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String S = sc.nextLine();
        Solution ob = new Solution();
        int result = ob.lengthOfLastWord(S);
        System.out.println("Length of last word: " + result);
    }
}
