package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Litwick extends Pokemon {
    public Litwick(String name, int lvl){
        super(name,lvl);
        setType(Type.FIRE,Type.GHOST);
        setStats(50,30,55,65,55,20);
        setMove(new Facade(),new Overheat());
    }
}
