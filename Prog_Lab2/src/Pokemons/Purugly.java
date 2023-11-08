package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Purugly extends Pokemon {
    public Purugly(String name, int lvl){
        super(name,lvl);
        addType(Type.NORMAL);
        setStats(71,82,64,64,59,112);
        setMove(new ShadowBall(),new HoneClaws(),new FeintAttack(),new BodySlam());

    }
}
