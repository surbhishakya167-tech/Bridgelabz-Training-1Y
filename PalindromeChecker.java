class PalindromeChecker {
    String text;

    boolean isPalindrome() {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome())
            System.out.println("The text is a palindrome.");
        else
            System.out.println("The text is not a palindrome.");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker();
        p.text = "Madam";
        p.displayResult();
    }
}
