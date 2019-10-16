package character.race.races;

public class Elf extends Race {

    private String size;
    private int speed;
    private String immunities;
    private String habilities;
    private String vision;
    private String proficiencies;
    private String skillBonus;
    private String languages;
    private String favoredClass;


    public Elf(int str, int dex, int con, int inte, int sab, int car) {
        super(str, dex + 2, con - 2, inte, sab, car);
        this.size = "medium";
        this.speed = 30;
        this.immunities = "sleep";
        this.habilities = habilities;
        this.vision = "low-light";
        this.proficiencies = proficiencies;
        this.skillBonus = skillBonus;
        this.languages = "Common, Elvish";
        this.favoredClass = "wizard";
    }

    public String getSize() {
        return size;
    }

    public int getSpeed() {
        return speed;
    }

    public String getImmunities() {
        return immunities;
    }

    public String getHabilities() {
        return habilities;
    }

    public String getVision() {
        return vision;
    }

    public String getProficiencies() {
        return proficiencies;
    }

    public String getSkillBonus() {
        return skillBonus;
    }

    public String getLanguages() {
        return languages;
    }

    public String getFavoredClass() {
        return favoredClass;
    }
}
