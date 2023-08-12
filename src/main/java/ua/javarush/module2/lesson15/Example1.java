package ua.javarush.module2.lesson15;

public class Example1 {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();
        MyLinkedList<Integer>.Node node = list.new Node();
        node.nextNode = list.new Node();

        list.new Node(list);

        //

        MyLinkedList<Integer>.Node integerNode =
                new MyLinkedList<Integer>().
                        new Node();

        MyLinkedList<Integer>.Node.A a = integerNode.new A();
    }
}


class MyLinkedList<E> {

    private static final int INT_VALUE = 0;

    private String name;

    private void nonStaticListMethod() {
        System.out.println("list method");
//        Node.staticNodeMethod();  does not work with java 8
    }

    private static void staticListMethod() {
        System.out.println("list method");
    }

    class Node {

        private static final int INT_VALUE = 10;

//        static {}  does not work with java 8
//
//        static  int val; does not work with java 8
        E value;
        Node nextNode;

        Node(){}

        Node(MyLinkedList list){}

        {
            name = "" +INT_VALUE;
            nonStaticListMethod();
            nodeMethod();
            staticListMethod();

        }

         class A{

         }

        public void nodeMethod() {
            System.out.println("node method");
            System.out.println(MyLinkedList.INT_VALUE);
        }
// does not work with java 8
//        public static void staticNodeMethod() {
//            System.out.println("node method");
//            System.out.println(INT_VALUE);
//        }
    }

    //...
}
