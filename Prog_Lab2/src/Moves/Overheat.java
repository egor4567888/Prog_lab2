package Moves;

import ru.ifmo.se.pokemon.*;

public class Overheat extends SpecialMove {
    public Overheat(){
        super(Type.FIRE,130,90);
    }
    public void applySelfEffects(Pokemon p){
       p.setMod(Stat.DEFENSE,-2);
    }
    public String describe() {
        return "использовал Overheat";
    }
}
