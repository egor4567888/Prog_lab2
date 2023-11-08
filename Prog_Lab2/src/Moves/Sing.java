package Moves;

import ru.ifmo.se.pokemon.*;

public class Sing extends StatusMove {
    public Sing(){
        super(Type.NORMAL,0,55);
    }
    public void applyOppEffects(Pokemon p){
        p.setCondition(new Effect().turns((int)(Math.random()*3+1)).condition(Status.SLEEP));
    }
    public String describe() {
        return "использовал Sing";
    }
}
