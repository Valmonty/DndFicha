package character.race.races;

public class Elf extends Race {

    public Elf(int strength, int dexterity, int constitution, int intelligence, int wisdom, int carisma) {
        super(strength, dexterity + 2, constitution - 2, intelligence, wisdom, carisma);
        this.size = "medium";
        this.speed = 30;
        this.immunities = "sleep";
        this.vision = "low-light";
        this.languages.add("Common");
        this.languages.add("Elvish");
        this.favoredClass = "wizard";
    }
}
