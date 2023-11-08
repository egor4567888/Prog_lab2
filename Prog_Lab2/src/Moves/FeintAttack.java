package Moves;

import ru.ifmo.se.pokemon.*;

public class FeintAttack extends PhysicalMove {
    public FeintAttack(){
        super(Type.DARK,60,10000);
    }
    public String describe() {
        return "использовал FeintAttack";
    }
}
