public class ControlFlowExample {
    public static void main(String[] args) {
        // control flow
        int number = 11;

        // check if number is even or odd
        if (number % 2 == 0) {
            System.out.println("is even: " + number);
        } else {
            System.out.println("is odd: " + number);
        }

        // using for loop print numbers from one to ten
        // for loop is used when we know exactly the number of times a code should be
        // executed
        for (int count = 1; count <= 10; count++) {
            System.out.println("number: " + count);
        }

        // while loop is used when we do not know exactly how many times a code should
        // be executed
        int i = 1;

        while (i <= 5) {
            System.out.println("while number: " + i);
            i++;
        }

    }
}
