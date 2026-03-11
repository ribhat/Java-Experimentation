import java.security.Key;

class Keyboard {
    // these are instance variables that belong to each object

    // we make these variables private for encapsulation (no one should be able to
    // access these variables directly from outside the class)
    // we can create getters/setters to interact with these variables from outside
    // the class
    private int keys;
    private String color;
    final int const_keys = 100; // this is how you define constants

    // we can manually create a constructor
    public Keyboard() {
        keys = 10;
        color = "white";
    }

    public void setKeys(int keys) {
        this.keys = keys; // we use the 'this' keyword to reference the instance variable 'keys', rather
                          // than the local variable 'keys' that is defined only within this function
    }

    public void setColor(String c) {
        color = c;
    }

    public int getKeys() {
        return keys;
    }

    public String getColor() {
        return color;
    }

    public void pressed() {
        System.out.println("Signal sent");
    }

    public void throwIt() {
        System.out.println("got hit from regular keyboard");
    }

    // this is called compile time polymorphism. The code knows which version of the
    // method to call at compile time itself based on how it is called (with param
    // or not)
    public void throwIt(int k) {
        System.out.println("got hit from regular keyboard");
    }

}

class AdvancedKeyboard extends Keyboard // tihs inherits all non private methods/variables from the keyboard class
{
    public void hitNum() {
        System.out.println("sent number");
    }

    // we can override methods from parent class. This is runtime polymorpism as we
    // dont know which method will be called till runtime
    public void throwIt() {
        System.out.println("got hit from advanced keyboard");
    }
}

// Note: We cannot do multiple inheritance (class A cannot inherit from both B
// and C)
// However, we can do multi-level inheritance (class A inherits from Class B
// which inherits from class C)

public class DemoOOPS {
    public static void main(String[] args) {

        int num;
        num = 8;

        Keyboard obj;
        obj = new Keyboard(); // this is the constructor

        obj.pressed();
        obj.throwIt();
        obj.setKeys(4);

        Keyboard obj2 = new Keyboard();

        AdvancedKeyboard obj3 = new AdvancedKeyboard();
        // this object can use both advanced keyboard methods as well as regular
        // keyboard methods
        obj3.hitNum();
        obj3.pressed();

        // Polymorphism
        Keyboard poly_obj = new AdvancedKeyboard();
        poly_obj.throwIt(); // calls the throw it method from the advanced keyboard class

    }

}
