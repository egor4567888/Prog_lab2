package Moves;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(){
        super(Type.GHOST,80,100);
    }
    public void applyOppEffects(Pokemon p){
        if(Math.random()*10<2)      //20% шанс
            p.setMod(Stat.DEFENSE,-1);
    }
    public String describe() {
        return "использовал ShadowBall";
    }
}
