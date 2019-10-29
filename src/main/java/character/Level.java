package character;

public class Level {

    private int level;
    private int quantHD;
    private int feats;
    private int xp;
    private boolean levelUp;

    public int firstHD(int con) {
        int firstHD = 0;

        if (getLevel() == 1) {

//            firstHD = Status.calcModifier(con) + classe.getQuantHD();
        }
        return firstHD;
    }

    public int numeroFeats(int nivel) {

        int numeroFeats = 0;
        int contador = nivel;

        if (getLevel() == 1) {
            numeroFeats++;
        } else if (getLevel() > 1) {
            while (contador > 0) {
                if (contador % 4 == 0) {
                    numeroFeats++;
                }
                contador--;
            }
        }
        return numeroFeats;
    }

    public int getFeats() {
        return feats;
    }

    public void setFeats(int feats) {
        this.feats = feats;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getQuantHD() {
        return quantHD;
    }

    public void setQuantHD(int quantHD) {
        this.quantHD = quantHD;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public boolean isLevelUp() {
        return levelUp;
    }

    public void setLevelUp(boolean levelUp) {
        this.levelUp = levelUp;
    }
}
