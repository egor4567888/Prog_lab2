package Moves;

import ru.ifmo.se.pokemon.*;

public class FakeTears extends StatusMove {
    public FakeTears(){
        super(Type.DARK,0,100);
    }

    public void applyOppEffects(Pokemon p){
        p.setMod(Stat.DEFENSE, -2);
        //p.addEffect(new Effect().stat(Stat.DEFENSE, -2));
    }
    public String describe() {
        return "использовал FakeTears";
    }
}
