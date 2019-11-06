package character.classe.classes;

import character.classe.Classe;

public class Barbarian extends Classe {

    public Barbarian(int level, int feats, int xp, boolean levelUp) {
        super(level, feats, xp, levelUp);
        name = this.getClass().getSimpleName();
    }
}
