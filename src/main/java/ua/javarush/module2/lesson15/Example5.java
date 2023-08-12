package ua.javarush.module2.lesson15;

public class Example5 {
    public static void main(String[] args) {
        A a = new A(100) {

            public int value = 1000;

            @Override
            public void execute() {
                System.out.println("......");

                System.out.println(value);
                System.out.println(super.value);
            }

            public void method() {
                System.out.println("method");
            }
        };

        System.out.println(a.getClass().getName());
        a.execute();
        System.out.println(a.value);
    }
}

class A {
    protected int value;

    A(int value) {
        this.value = value;
    }


    public void execute() {
        System.out.println(value);
    }
}
