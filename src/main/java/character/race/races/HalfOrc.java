package character.race.races;

public class HalfOrc extends Race {

    private String size;
    private int speed;
    private String immunities;
    private String habilities;
    private String vision;
    private String proficiencies;
    private String skillBonus;
    private String languages;
    private String favoredClass;

    public HalfOrc(int str, int dex, int con, int inte, int sab, int car) {
        super(str, dex, con, inte, sab, car);
    }
}
