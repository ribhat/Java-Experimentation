// we run the program in 2 steps
// 1st we compile the program to byte code by running javac Demo.java   When compiling, we need to use the file name
// 2nd we run the program with 'java demo'. When running the file, we use the class name

// class name should be same as file name (but it technically doesnt have to be)
class Demo {
    public static void main(String args[]) {
        // main is the starting point of execution
        // JVM looks for main to start
        // void refers to the fact that the function should return nothing

        // --- INTRO TO PRIMITIVE TYPES AND BASIC FUNCTIONS --- (Uncomment entire code
        // block below to run this section)

        // System.out.println("Hello World"); // We need to use double quotes to print;
        // single quotes wont work

        // int num = 5;
        // double d = 9.6; // double takes more storage than float
        // float f = 8.5f; // in order to store a float, we have to include the 'f' at
        // the end
        // long l = 53443;
        // char c = 'a'; // we use single quotes to represent a char

        // System.out.println(num + d); // if providing 2 number types, it will add them
        // System.out.println(num + " " + d); // by including a string, java treats it
        // as concatentation

        // Show(); // we can call another function from inside main

        // --- OPERATIONS ---

        // int num1 = 9;
        // int num2 = 5;

        // int result = num1 / num2; // this automatically does floor division (ignores
        // remainder and just returns 1)

        // System.out.println(result);

        // boolean result2 = num1 <= num2;

        // System.out.println(result2);

        // // Logical Operators
        // // AND => &&
        // // OR => ||
        // // Negate expression => !(expression) i.e. !(num1 > 0) will return False
        // instead
        // // of True

        // System.out.println(num1 <= num2 || num2 == 5); // returns True since the
        // second arg is true

        // // If-else
        // if (num1 > num2) {
        // System.out.println("Num1 greater than num2");
        // } else if (num1 < num2) {
        // System.out.println("Num1 smaller than num2");
        // } else {
        // System.out.println("Num1 equal to num2");
        // }

        // // we can also use ternary operator for shorthand

        // result = num1 > 0 ? 5 : 10; // if num1 > 0, result = 5, else result = 10
        // System.out.println(result);

        // // we can also use switch statement
        // switch (num1) {
        // case 1:
        // System.out.println("num1 is 1");
        // case 9:
        // System.out.println("num1 is 9");
        // default:
        // System.out.println("nothing"); // prints regardless
        // }

        // --- LOOPS ---
        // int num1 = 1;
        // int num2 = 5;
        // int result = 0;

        // int i = 0;
        // while (i < 3) {
        // System.out.println(i);
        // i++;
        // }
        // i = 0; // reset the value of i
        // do {
        // System.out.println(i);
        // i++;
        // } while (i < 3);

        // for (int c = 0; c < 3; c++) {
        // System.out.println(c);
        // }

    }

    public static void Show() {
        System.out.println("Called from inside 'show'");
    }
}
