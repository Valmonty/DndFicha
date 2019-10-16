package character;

public class Status {

    private int strength;
    private int dexterity;
    private int constitution;
    private int intelligence;
    private int wisdom;
    private int carisma;
    private int modStr;
    private int modDex;
    private int modCon;
    private int modInt;
    private int modWis;
    private int modCar;

    public Status(int strength, int dexterity, int constitution, int intelligence, int wisdom, int carisma) {
        this.strength = strength;
        this.dexterity = dexterity;
        this.constitution = constitution;
        this.intelligence = intelligence;
        this.wisdom = wisdom;
        this.carisma = carisma;
        this.modStr = calcModifier(strength);
        this.modDex = calcModifier(dexterity);
        this.modCon = calcModifier(constitution);
        this.modInt = calcModifier(intelligence);
        this.modWis = calcModifier(wisdom);
        this.modCar = calcModifier(carisma);
    }

    public static int calcModifier(int status) {

        int statusModifier = (status / 2) - 5;
        return statusModifier;
    }

    public int getModStr() {
        return modStr;
    }

    public int getModDex() {
        return modDex;
    }

    public int getModCon() {
        return modCon;
    }

    public int getModInt() {
        return modInt;
    }

    public int getModWis() {
        return modWis;
    }

    public int getModCar() {
        return modCar;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
        this.carisma = carisma;
    }
}
