package character.race.races;

public class HalfOrc extends Race {

    public HalfOrc(int strength, int dexterity, int constitution, int intelligence, int wisdom, int carisma) {
        super(strength, dexterity, constitution + 2, intelligence - 2, wisdom, carisma);
        this.size = "medium";
        this.speed = 30;
        this.vision = "darkvision";
        this.languages.add("Common");
        this.languages.add("Orc");
        this.favoredClass = "Barbarian";
    }
}
