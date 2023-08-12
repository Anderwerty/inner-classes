package ua.javarush.module2.lesson15;

public class Example4 {
    public static void main(String[] args) {
        Integer i1 = 1000;
        Integer i2 = 1000;
        Integer i3 = Integer.valueOf(1000);

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));
    }
}
