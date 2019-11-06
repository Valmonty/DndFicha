package tests;

import character.classe.classes.Barbarian;

public class TestClasse {

    public static void main(String[] args) {

        Barbarian barbarian = new Barbarian(2, 1, 1, false);

        System.out.println(barbarian.getName());
        System.out.println(barbarian.getLevel());
        System.out.println(barbarian.getQuantHD());
    }
}
