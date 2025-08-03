package Recursion;

public class Factorial_Of_A_Number {

    public int Factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return Factorial(n)*Factorial(n-1);
    }

    public static void main(String[] args) {
        Factorial_Of_A_Number obj = new Factorial_Of_A_Number();
        System.out.println(obj.Factorial(5));
    }
}