package tests;

import character.Nivel;

public class TestNumberFeats {

    public static void main(String[] args) {
        Nivel nivel = new Nivel();

        nivel.setNivel(5);

        System.out.println(nivel.getNivel());
        System.out.println(nivel.numeroFeats(nivel.getNivel()));
    }
}
