package com.telusko.demo.db;

import com.telusko.demo.app.A;

public class B extends A {
    public void Show() {
        // System.out.println(num); // we cannot access num directly, even though we are
        // extending the parent class
        System.out.println(num1);
        System.out.println(num2); // we can access both num1 and num2 though because they are public / protected
                                  // respectively. Therefore since B is a subclass of A, we can access these
                                  // variables from B
    }
}
