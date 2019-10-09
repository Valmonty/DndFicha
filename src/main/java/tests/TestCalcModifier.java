package tests;

import character.Status;
import character.race.Elf;

import java.util.HashMap;

public class TestCalcModifier {

    public static void main(String[] args) {

        Status s = new Status();
        Elf elfo = new Elf(16,14,10,8,8,8);

        HashMap<String, Integer> status = new HashMap<>();
        HashMap<Integer, Integer> statusModifier = new HashMap<>();

        status.put("str", elfo.getStr());
        status.put("dex", elfo.getDex());
        status.put("con", elfo.getCon());
        status.put("inte", elfo.getInte());
        status.put("sab", elfo.getSab());
        status.put("car", elfo.getCar());

        System.out.println(status.get("str"));
        System.out.println(s.calcModifier(status.get("str")));
//        System.out.println(elfo.calcStatus(elfo.getStr()));


    }
}
