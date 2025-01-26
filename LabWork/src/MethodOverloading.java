public class MethodOverloading {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method to add four integers
    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }
    public static void main(String[] args) {
        MethodOverloading calculate = new MethodOverloading();

        System.out.println("Addition of 2 numbers (15 + 36): " + calculate.add(5, 10));
        System.out.println("Addition of 3 numbers (15 + 10 + 36): " + calculate.add(5, 10, 15));
        System.out.println("Addition of 4 numbers (15 + 10 + 36 + 25): " + calculate.add(5, 10, 15, 20));
    }
}
