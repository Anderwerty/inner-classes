package ua.javarush.module2.lesson15;

public class Example2 {

    public static void main(String[] args) {
        Node node = new Node();
        MyLinkedList2<Object> objectMyLinkedList2 = null;

        ((MyLinkedList2<Object>) null).staticListMethod();
    }
}

class MyLinkedList2<E> {

    private static final int INT_VALUE = 0;
    private String name;

    private void nonStaticListMethod() {
        System.out.println("list method");
    }

    public static void staticListMethod() {
        System.out.println("list method");

        Node.staticNodeMethod();
    }


}

class Node<T> {

    private static final int INT_VALUE = 10;

    T value;
    Node<T> nextNode;


    public void nodeMethod() {
        System.out.println("node method");
    }

    public static void staticNodeMethod() {
        System.out.println("node method");

    }

}


