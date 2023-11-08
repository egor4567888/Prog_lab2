package Moves;

import ru.ifmo.se.pokemon.*;

public class HoneClaws extends StatusMove {
    public HoneClaws(){
        super(Type.DARK,0,1000);
    }

    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.ATTACK, 1);
        p.setMod(Stat.ACCURACY, 1);
    }
    public String describe() {
        return "использовал HoneClaws";
    }
}
