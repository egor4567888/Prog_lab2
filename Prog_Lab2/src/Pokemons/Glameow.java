package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Glameow extends Pokemon {
    public Glameow(String name, int lvl){
        super(name,lvl);
        addType(Type.NORMAL);
        setStats(49,55,42,42,37,85);
        setMove(new ShadowBall(),new HoneClaws(),new FeintAttack());
    }
}
