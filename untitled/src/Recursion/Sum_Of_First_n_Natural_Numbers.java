package Recursion;

public class Sum_Of_First_n_Natural_Numbers {

    public int Sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + Sum(n - 1);
    }

    public static void main(String[] args) {
        int n = 15;
        Sum_Of_First_n_Natural_Numbers obj = new Sum_Of_First_n_Natural_Numbers();
        int result = obj.Sum(n);
        System.out.println(result);
    }
}