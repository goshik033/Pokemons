package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Infernape extends Pokemon  {
    public Infernape(String name,int level){
        super(name,level);
        setType(Type.FIRE, Type.FIGHTING);
        setStats(76D,104D,71D,104D,71D,108D);
        setMove( new Confide(),new Swagger(),new MuddyWater(),new DazzlingGleam());
    }
}
