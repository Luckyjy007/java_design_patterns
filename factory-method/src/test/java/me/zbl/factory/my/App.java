package me.zbl.factory.my;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {




        NumberFactory factory = NumberFactory.getFactory();

        System.out.println(factory.parse("122.0"));


    }
}
