package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Sableye extends Pokemon  {
    public Sableye(String name,int level){
        super(name,level);
        setType(Type.DARK, Type.GHOST);
        setStats(50D,75D,75D,65D,65D,50D);
        setMove( new AuraSphere(),new LowSweep(), new XScissor(), new FlameCharge());
    }
}