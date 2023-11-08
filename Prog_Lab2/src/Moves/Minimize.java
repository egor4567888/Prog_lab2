package Moves;

import ru.ifmo.se.pokemon.*;

public class Minimize extends StatusMove {
    public Minimize(){
        super(Type.NORMAL,0,1000);
    }

    public void applySelfEffects(Pokemon p){
        p.setMod(Stat.EVASION, 2);
    }
    public String describe() {
        return "использовал Minimize";
    }
}
