package Recursion;

public class Palindrome_Number {

    public boolean PalNum(String str, int a, int b) {
        if (a >= b) return true;
        if (str.charAt(a) != str.charAt(b)) return false;
        return PalNum(str, a + 1, b - 1);
    }

    public static void main(String[] args) {
        String str = "madam";
        Palindrome_Number obj = new Palindrome_Number();
        System.out.println(obj.PalNum(str, 0, str.length() - 1));
    }
}
