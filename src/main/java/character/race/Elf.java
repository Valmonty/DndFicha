package character.race;

import character.Status;

public class Elf extends Status {

    public Elf(int str, int dex, int con, int inte, int sab, int car) {
        super(str, dex, con, inte, sab, car);
    }

    public int calcStatus(){

        int dex = getDex() + 2;
        setDex(dex);
    return dex;
    }
}
