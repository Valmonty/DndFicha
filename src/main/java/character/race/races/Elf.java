package character.race.races;

import character.race.Race;

public class Elf extends Race {

    public Elf(int strength, int dexterity, int constitution, int intelligence, int wisdom, int carisma) {
        super(strength, dexterity + 2, constitution - 2, intelligence, wisdom, carisma);
        size = "medium";
        speed = 30;
        immunities = "sleep";
        vision = "low-light";
        languages.add("Common");
        languages.add("Elvish");
        favoredClass = "wizard";
    }
}
