public class MethodsExample {
    public static void main(String[] args) {
        // call the print message method
        printMessage();

        // define method to add two numbers
        int sum = addNumbers(7, 7);
        System.out.println("sum of numbers: " + sum);

    }

    // define the print message method
    public static void printMessage() {
        System.out.println("hello there.");
    }

    // difine the summation method
    public static int addNumbers(int a, int b) {
        return a + b;
    }

}
