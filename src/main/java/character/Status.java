package character;

import java.util.HashMap;

public class Status {

    private int str;
    private int dex;
    private int con;
    private int inte;
    private int sab;
    private int car;

    public Status() {
    }

    public Status(int str, int dex, int con, int inte, int sab, int car) {
        this.str = str;
        this.dex = dex;
        this.con = con;
        this.inte = inte;
        this.sab = sab;
        this.car = car;
    }

    public int calcModifier(int status) {

        int statusModifier = (status / 2) - 5;
        return statusModifier;
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
