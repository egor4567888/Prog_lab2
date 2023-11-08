package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Minun extends Pokemon {
    public Minun(String name, int lvl){
        super(name,lvl);
        addType(Type.ELECTRIC);
        setStats(60,40,50,75,85,95);
        setMove(new Nuzzle(),new FakeTears(),new Sing());

    }

}
