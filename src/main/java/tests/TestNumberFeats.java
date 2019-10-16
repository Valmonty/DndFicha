package tests;

import character.Level;

public class TestNumberFeats {

    public static void main(String[] args) {
        Level nivel = new Level();

        nivel.setLevel(5);

        System.out.println(nivel.getLevel());
        System.out.println(nivel.numeroFeats(nivel.getLevel()));
    }
}
