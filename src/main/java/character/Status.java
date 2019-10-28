package character;

public abstract class Status {

    private int str;
    private int dex;
    private int con;
    private int inte;
    private int sab;
    private int car;
    private int modStr;
    private int modDex;
    private int modCon;
    private int modInte;
    private int modSab;
    private int modCar;

    public static int calcModifier(int status) {

        int statusModifier = (status / 2) - 5;
        return statusModifier;
    }

    public Status() {
    }

    public Status(int str, int dex, int con, int inte, int sab, int car) {
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.inte = inte;
        this.sab = sab;
        this.car = car;
        this.modStr = calcModifier(str);
        this.modDex = calcModifier(dex);
        this.modCon = calcModifier(con);
        this.modInte = calcModifier(inte);
        this.modSab = calcModifier(sab);
        this.modCar = calcModifier(car);
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

    public int getModInte() {
        return modInte;
    }

    public int getModSab() {
        return modSab;
    }

    public int getModCar() {
        return modCar;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }

    public int getInte() {
        return inte;
    }

    public void setInte(int inte) {
        this.inte = inte;
    }

    public int getSab() {
        return sab;
    }

    public void setSab(int sab) {
        this.sab = sab;
    }

    public int getCar() {
        return car;
    }

    public void setCar(int car) {
        this.car = car;
    }
}
