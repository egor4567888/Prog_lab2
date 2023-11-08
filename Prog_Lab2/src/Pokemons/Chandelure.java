package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Chandelure extends Pokemon {
    public Chandelure(String name, int lvl){
        super(name,lvl);
        setType(Type.FIRE,Type.GHOST);
        setStats(60,55,90,145,90,80);
        setMove(new Facade(),new Overheat(),new Minimize(),new FireBlast());
    }
}
