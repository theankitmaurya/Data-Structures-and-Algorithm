package Recursion;

public class Print_Numbers_From_One_To_N {

//    For printing from 1 to N
    public void printNumbersFromOnetoN(int a, int n) {
        if (a > n) {
            return;
        }

        System.out.println(a);
        printNumbersFromOnetoN(a + 1, n);
    }

//    For printing from N to 1
    public void printNumbersFromNtoOne(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbersFromNtoOne(n - 1);
    }

    public static void main(String[] args) {

        int a = 1;
        int n = 10;

        Print_Numbers_From_One_To_N p = new Print_Numbers_From_One_To_N();
        System.out.println("Printing numbers from 1 to n");
        p.printNumbersFromOnetoN(a, n);

        System.out.println("Printing numbers from n to 1");
        p.printNumbersFromNtoOne(n);
    }
}