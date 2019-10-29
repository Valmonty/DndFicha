package character;

import java.util.*;

public abstract class Classe extends Level {

    public static String name;
    public static int hd;
    public static int bba;
    public static int fort;
    public static int ref;
    public static int will;
    public static int skillPoints;
    public static List<String> classAbilities = new ArrayList<>();

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Classe.name = name;
    }

    public static int getHd() {
        return hd;
    }

    public static void setHd(int hd) {
        Classe.hd = hd;
    }

    public static int getBba() {
        return bba;
    }

    public static void setBba(int bba) {
        Classe.bba = bba;
    }

    public static int getFort() {
        return fort;
    }

    public static void setFort(int fort) {
        Classe.fort = fort;
    }

    public static int getRef() {
        return ref;
    }

    public static void setRef(int ref) {
        Classe.ref = ref;
    }

    public static int getWill() {
        return will;
    }

    public static void setWill(int will) {
        Classe.will = will;
    }

    public static int getSkillPoints() {
        return skillPoints;
    }

    public static void setSkillPoints(int skillPoints) {
        Classe.skillPoints = skillPoints;
    }

    public static List<String> getClassAbilities() {
        return classAbilities;
    }

    public static void setClassAbilities(List<String> classAbilities) {
        Classe.classAbilities = classAbilities;
    }
}
