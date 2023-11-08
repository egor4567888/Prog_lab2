package Moves;

import ru.ifmo.se.pokemon.*;

public class SweetKiss extends StatusMove {
    public SweetKiss(){
        super(Type.FAIRY,0,75);
    }
    public void applyOppEffects(Pokemon p){
        p.confuse();
    }
    public String describe() {
        return "использовал SweetKiss";
    }
}
