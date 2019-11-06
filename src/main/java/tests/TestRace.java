package tests;

import character.race.races.Elf;

public class TestRace {

    public static void main(String[] args) {

        Elf elf = new Elf(16, 14, 10, 12, 13, 11);

        System.out.println(elf.getModDex());
        System.out.println(elf.getModCon());
        System.out.println(elf.getImmunities());
        System.out.println(elf.getSpeed());
        System.out.println(elf.getFavoredClass());
    }
}
