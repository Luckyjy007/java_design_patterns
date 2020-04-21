package me.zbl.factory.my;

public class App {

    public static void main(String[] args) {

        NumberFactory factory = NumberFactory.getFactory();
        System.out.println(factory.parse("122.0"));

    }
}
