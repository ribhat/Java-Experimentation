public class DemoExceptionHandling {
    public static void main(String[] args) {
        int i = 4;
        int j = 5;

        int result = 0;
        int nums[] = { 1, 2, 3 };

        try {
            result = i / j;

            // we can also forcibly throw our own error
            if (result == 0) {
                throw new ArithmeticException(); // exceptions are classes, so we need to create a new class
            }

        } catch (Exception e) { // we can generally catch any exception
            System.out.println("Something went wrong: " + e);
        }

        // We can also have multiple catch blocks. we can catch specific types of
        // exceptions we might be expecting. So if a diff error comes, we will still
        // stop execution
        try {
            result = i / 2;
            System.out.println("4th index of nums is: " + nums[4]);

        } catch (ArithmeticException e) {
            System.out.println("Something went wrong: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Something went wrong: " + e);
        } finally { // runs whether an exception occured or not
            System.out.println("This is printed regardless");

            // we can use finally block to do things like close a db connection regardless
            // of an error or not
        }

        System.out.println(result);

    }
}
