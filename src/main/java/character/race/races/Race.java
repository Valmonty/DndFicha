package character.race.races;

import character.Status;

public abstract class Race extends Status {

    public Race(int str, int dex, int con, int inte, int sab, int car) {
        super(str, dex, con, inte, sab, car);
    }
}
