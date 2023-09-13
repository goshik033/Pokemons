package Moves;
import ru.ifmo.se.pokemon.*;

public class DazzlingGleam extends SpecialMove {
    public DazzlingGleam(){
        super(Type.FAIRY,80,100);
    }
    @Override
    protected java.lang.String describe(){
        return "Dazzling Gleam deals damage and hits all adjacent opponents in double/triple battles.";
    }
    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (att.getStat(Stat.SPEED) / 512.0D > Math.random()) {
            System.out.println("Критический удар!\nКажется у нас появилось новое солнце!!");
            return 2.0D;
        } else {
            return 1.0D;
        }}
}

