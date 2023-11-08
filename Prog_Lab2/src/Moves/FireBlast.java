package Moves;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast(){
        super(Type.FIRE,110,85);
    }
    public void applyOppEffects(Pokemon p){

        p.setCondition(new Effect().chance(10).condition(Status.BURN));
    }
    public String describe(){

        return "использовал FireBlast";
    }
}
