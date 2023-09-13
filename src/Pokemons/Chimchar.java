package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Chimchar extends Pokemon  {
    public Chimchar(String name,int level){
        super(name,level);
        setType(Type.FIRE);
        setStats(44D,58D,44D,58D,44D,61D);
        setMove( new Confide(),new Swagger());
    }
}
