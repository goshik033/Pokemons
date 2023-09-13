package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Rapidash extends Pokemon  {
    public Rapidash(String name,int level){
        super(name,level);
        setType(Type.FIRE);
        setStats(65D,100D,70D,80D,80D,105D);
        setMove( new Rest(),new DreamEater(), new FireBlast(), new NastyPlot());
    }
}
