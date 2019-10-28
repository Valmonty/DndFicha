package character.race.races;

import character.Status;

import java.util.ArrayList;
import java.util.List;

public abstract class Race extends Status {

    public static String size;
    public static int speed;
    public static String immunities;
    public static String vision;
    public static String favoredClass;

    public static String skillBonus;
    public static List<String> proficiencies = new ArrayList<String>();
    public static List<String> languages = new ArrayList<String>();
    public static List<String> raceAbilities = new ArrayList<String>();

    public Race(int strength, int dexterity, int constitution, int intelligence, int wisdom, int carisma) {
        super(strength, dexterity, constitution, intelligence, wisdom, carisma);
    }

    public static String getSize() {
        return size;
    }

    public static void setSize(String size) {
        Race.size = size;
    }

    public static int getSpeed() {
        return speed;
    }

    public static void setSpeed(int speed) {
        Race.speed = speed;
    }

    public static String getImmunities() {
        return immunities;
    }

    public static void setImmunities(String immunities) {
        Race.immunities = immunities;
    }

    public static String getVision() {
        return vision;
    }

    public static void setVision(String vision) {
        Race.vision = vision;
    }

    public static String getFavoredClass() {
        return favoredClass;
    }

    public static void setFavoredClass(String favoredClass) {
        Race.favoredClass = favoredClass;
    }

    public static String getSkillBonus() {
        return skillBonus;
    }

    public static void setSkillBonus(String skillBonus) {
        Race.skillBonus = skillBonus;
    }

    public static List<String> getProficiencies() {
        return proficiencies;
    }

    public static void setProficiencies(List<String> proficiencies) {
        Race.proficiencies = proficiencies;
    }

    public static List<String> getLanguages() {
        return languages;
    }

    public static void setLanguages(List<String> languages) {
        Race.languages = languages;
    }

    public static List<String> getRaceAbilities() {
        return raceAbilities;
    }

    public static void setRaceAbilities(List<String> raceAbilities) {
        Race.raceAbilities = raceAbilities;
    }
}
