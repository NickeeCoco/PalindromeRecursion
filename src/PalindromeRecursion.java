
public class PalindromeRecursion {
    public static void main(String[] args) {
        System.out.println(isPalindrome("redivider")); // true
        System.out.println(isPalindrome("kayak")); // true
        System.out.println(isPalindrome("level")); // true
        System.out.println(isPalindrome("Morgane")); // false
        System.out.println(isPalindrome("redivider")); // true
        System.out.println(isPalindrome("Taco cat")); // true
        System.out.println(isPalindrome("The consequences will never be the same")); // false
        System.out.println(isPalindrome("Mr Owl ate my metal worm")); // true
    }

    public static boolean isPalindrome(String string) {

        String stringToCheck = convertString(string);

        int indexFirstLetter = 0;
        int indexLastLetter = stringToCheck.length() - 1;

        return isPalindromeHelper(stringToCheck, indexFirstLetter, indexLastLetter);
    }

    public static boolean isPalindromeHelper(String string, int indexFirstLetter, int indexLastLetter) {
        if(string.charAt(indexFirstLetter) != string.charAt(indexLastLetter)) {
            return false;
        }

        if(indexFirstLetter > indexLastLetter) {
            return true;
        }

        indexFirstLetter++;
        indexLastLetter--;

        return isPalindromeHelper(string, indexFirstLetter, indexLastLetter);
    }

    public static String convertString(String string) {
        String lcStr = string.toLowerCase();

        String[] words = lcStr.split(" "); // separate string into words to remove spaces, store words in an array
        String finalString = ""; // to store the final string

        for (String word: words) {
            finalString += word;
        }
        return finalString;
    }
}
