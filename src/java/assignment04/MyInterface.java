package java.assignment04;

interface MyInterface {
    void method1();
    void method2();
}

class MyClass implements MyInterface {
    @Override
    public void method1() { }

    @Override
    public void method2() { }

    public void additionalMethod() { }
}

