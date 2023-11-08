package Moves;

import ru.ifmo.se.pokemon.*;

public  class Nuzzle extends PhysicalMove{
    public Nuzzle()
    {
        super (Type.ELECTRIC,20,100);
       // applyOppEffects();
    }
    public void applyOppEffects(Pokemon p){

        p.setCondition(new Effect().condition(Status.PARALYZE));
    }
    public String describe(){

        return "использовал Nuzzle";
    }

}
