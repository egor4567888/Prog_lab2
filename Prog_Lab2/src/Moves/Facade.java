package Moves;

import ru.ifmo.se.pokemon.*;

import static java.lang.String.valueOf;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL,70,100);
    }
    public void applyOppDamage(Pokemon p,Double damage){
        if (valueOf(p.getCondition())=="POISON" || valueOf(p.getCondition())=="PARALYZE ")
            p.setMod(Stat.HP, (int) Math.round(damage));
    }
    public String describe() {
        return "использовал Facade";
    }
}
