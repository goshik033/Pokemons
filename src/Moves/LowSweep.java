package Moves;
import ru.ifmo.se.pokemon.*;

public class LowSweep extends PhysicalMove {
    public LowSweep() {super(Type.FIGHTING,65,100); }
    @Override
    protected java.lang.String describe() { return "Low Sweep deals damage and lowers the target's Speed by one stage."; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect();
        effect.stat(Stat.SPEED, -1);
        p.addEffect(effect);
    }
}
