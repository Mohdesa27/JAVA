import java.util.Scanner;

public class Anygram{//without use of arrays

    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Step 3: Create frequency arrays for both strings (only 26 letters for 'a' to 'z')
        int[] charCountA = new int[26];
        int[] charCountB = new int[26];

        // Step 4: Count the frequency of each character in both strings
        for (int i = 0; i < a.length(); i++) {
            charCountA[a.charAt(i) - 'a']++;
            charCountB[b.charAt(i) - 'a']++;
        }

        // Step 5: Compare the frequency arrays
        for (int i = 0; i < 26; i++) {
            if (charCountA[i] != charCountB[i]) {
                return false;
            }
        }

        return true; // If all counts are the same, the strings are anagrams
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
