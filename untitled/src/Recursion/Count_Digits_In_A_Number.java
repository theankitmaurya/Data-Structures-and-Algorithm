package Recursion;

public class Count_Digits_In_A_Number {

    public int countDigits(int n) {
        if (n == 0) return 0;

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {

        int num = 100;
        Count_Digits_In_A_Number obj = new Count_Digits_In_A_Number();
        int count = obj.countDigits(num);
        System.out.println(count);
    }
}
