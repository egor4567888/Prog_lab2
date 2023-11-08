package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Lampent extends Pokemon {
    public Lampent(String name, int lvl){
        super(name,lvl);
        setType(Type.FIRE,Type.GHOST);
        setStats(60,40,60,95,60,55);
        setMove(new Facade(),new Overheat(),new Minimize());
    }
}
