package ru.gb.algoritm;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("5");
        list.add("2");
        list.add("9");
        list.add("0");
        list.add("hello");
        list.add("world");

        list.print();
        list.quickSort();
        list.remove("hello");
        list.addAt("Me", 3);
        list.print();
    }
}
