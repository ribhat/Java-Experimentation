abstract class Computer { // by calling this class abstract, we prevent anyone from making instances of
                          // the computer class (since the methods are not implemented). Instead we want
                          // them to create instances of laptop or desktop, which extend the computer
                          // class
    public abstract void compiler(); // this is not implemented at this level. They will be overrriden by the
                                     // subclasses

}

class Laptop extends Computer {
    public void compiler() {
        System.out.println("compiling");
    }
}

class Desktop extends Computer {
    public void compiler() {
        System.out.println("compiling faster");
    }
}

class Dev {
    public void code(Computer comp) { // This will allow the developer to pass either a laptop or desktop, not
                                      // necessarily one or the other
        System.out.println("coding...");
        comp.compiler();
    }
}

public class DemoAbstractClassAndInterface {
    public static void main(String[] args) {
        Dev dev1 = new Dev();
        Laptop laptop = new Laptop();

        Desktop desk1 = new Desktop();

        Computer comp1 = new Desktop();
        Computer comp2 = new Laptop();

        dev1.code(comp2);
    }
}
