package Recursion;

public class Reverse_a_String {

    public String ReverseStr(String str) {
        if (str.isEmpty()) return str;
        return ReverseStr(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String original = "ankit";
        Reverse_a_String obj = new Reverse_a_String();
        String reversed = obj.ReverseStr(original);
        System.out.println(reversed);
    }
}
