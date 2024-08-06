package com.demisco;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Ali Alavi");
        names.add("Taghi Taghavi");
//        names.remove(0);
        names.remove("Ali Alavi");

        String name = names.get(0);
        System.out.println(name);

    }
}