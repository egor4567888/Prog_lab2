package Moves;

import ru.ifmo.se.pokemon.*;

public class BodySlam extends PhysicalMove {
    public BodySlam(){
        super(Type.NORMAL,85,100);
    }
    public void applyOppEffects(Pokemon p){

        p.setCondition(new Effect().chance(30).condition(Status.PARALYZE));
    }
    public String describe() {
        return "использовал BodySlam";
    }
}
