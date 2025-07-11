package Recursion;

public class Sum {

    public static int add(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + add(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = add(5); // or Sum.add(5)
        System.out.println("Sum: " + result); // Output: Sum: 15
    }
}
