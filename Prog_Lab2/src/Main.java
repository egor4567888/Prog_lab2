import Pokemons.*;
import ru.ifmo.se.pokemon.*;
public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Minun p1 = new Minun("Обамаврат", 1);
        Purugly p2 = new Purugly(" Чресломор", 1);
        Glameow p3 = new Glameow("Чресломысл ",1);
        Chandelure p4 = new Chandelure("Ведабомж",1);
        Lampent p5 = new Lampent("Дристаяр",1);
        Litwick p6 = new Litwick("Мачупил",1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
        }
    }