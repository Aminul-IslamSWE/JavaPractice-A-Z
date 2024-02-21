package java.assignment1and2.src.Assignment;

public class MyGenericClass<T> {
    private T data;

    public MyGenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        // Creating objects for non-primitive data types using the generic class
        MyGenericClass<String> stringObj = new MyGenericClass<>("Hello, world!");
        MyGenericClass<Integer> integerObj = new MyGenericClass<>(42);
        MyGenericClass<Double> doubleObj = new MyGenericClass<>(3.14);
        MyGenericClass<Boolean> booleanObj = new MyGenericClass<>(true);

        // Printing the data stored in each object
        System.out.println("String object data: " + stringObj.getData());
        System.out.println("Integer object data: " + integerObj.getData());
        System.out.println("Double object data: " + doubleObj.getData());
        System.out.println("Boolean object data: " + booleanObj.getData());
    }
}
