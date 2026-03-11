class A extends Thread { // Alternatively, we can implement Runnable interface, so that we can still
                         // extend other classes if we want. This will change the methods we need to use
                         // slightly

    public void run() { // For threads, the method name MUST be run. We can call other methods from the
                        // run method if needed
        for (int i = 0; i < 50; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10); // this will dictacte the amouunt of time between thread runs for more
                                  // controlled interwoveness
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

public class DemoThreads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); // we call start method (defined in the Thread class) which automatically calls
                      // the run method
        obj2.start();

        // now both of these outputs will be interwoven
        // Note: This is not necessarily 1:1 by default. The first thread will run for a
        // few
        // miliseconds, then the second thread will run for a few miliseconds and back
        // and forth. Therefore we may see multiple "Hi" in a row followed by multiple
        // "Hello" in a row, going back and forth

        // by specifying the Thread.sleep(10), we can better control the execution time
        // between threads for more consistent switches between the threads

    }
}
