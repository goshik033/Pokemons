package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Ponyta extends Pokemon  {
    public Ponyta(String name,int level){
        super(name,level);
        setType(Type.FIRE);
        setStats(50D,85D,55D,65D,65D,90D);
        setMove( new Rest(),new DreamEater(), new FireBlast());
    }
}
