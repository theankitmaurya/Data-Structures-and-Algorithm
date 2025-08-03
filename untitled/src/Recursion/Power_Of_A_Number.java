package Recursion;

public class Power_Of_A_Number {

    public int PowerNumber(int a, int b) {
        if (b == 0) {
            return 1;
        }

        return a * PowerNumber(a, b - 1);
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 5;

        Power_Of_A_Number obj = new Power_Of_A_Number();
        System.out.println(obj.PowerNumber(a, b));
    }
}
