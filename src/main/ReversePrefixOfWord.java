import java.util.Scanner;

public class ReversePrefixOfWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.nextLine();
        System.out.println("Enter a character to specify the prefix end: ");
        char ch = sc.next().charAt(0);
        String reversed = ReversePrefixOfWord.reversePrefix(s, ch);
        System.out.println("Reversed prefix: " + reversed);
    }

    public static String reversePrefix(String word, char ch) {
        String res = "";
        int index = word.indexOf(ch);

        if (index != -1) {
            for (int i = index; i >= 0; i--) {
                res = res + word.charAt(i);
            }
            for (int i = index + 1; i < word.length(); i++) {
                res = res + word.charAt(i);
            }
        } else {
            // Handle the case when the character is not found in the word.
            res = word;
        }

        return res;
    }
}
