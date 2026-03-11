package com.telusko.demo.app;

public class A {
    int num;
    public int num1; // if this variable is not public, it gets a default access modifier that is
                     // accessible only within the same package. To make it accessible outside this
                     // package, we need to label it as public

    protected int num2; // using protected, we allow this variable to be accesible within the same
                        // package AND within subclasses
}
