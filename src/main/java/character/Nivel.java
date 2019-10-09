package character;

public class Nivel {

    public int nivel;
    public int bba;
    public int hp;
    public int fort;
    public int ref;
    public int will;
    public int feats;
    public int abilityPoints;

    public int numeroFeats(int nivel){
        
        int numeroFeats = 0;
        int contador = nivel;
        
        if(getNivel() == 1) {
            numeroFeats++;
        } else if(getNivel() > 1) {
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
