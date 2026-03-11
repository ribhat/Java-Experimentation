import com.telusko.demo.app.C;
import com.telusko.demo.app.A; // importing these 2 classes from the package we created

public class DemoPackages {
    public static void main(String[] args) {

        C obj = new C(); // we can now create C class in our demo file even though they are not in the
                         // same folder

        A obj2 = new A();

        System.out.println(obj2.num1); // we can only access num variable if it is public within the A class
    }
}
