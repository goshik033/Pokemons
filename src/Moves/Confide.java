package Moves;
import ru.ifmo.se.pokemon.*;

public class Confide extends StatusMove {
    public Confide() {super(Type.NORMAL,0.0,0.0); }
    @Override
    protected java.lang.String describe() { return "Confide lowers the target's Special Attack by one stage."; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect();
        effect.stat(Stat.SPECIAL_ATTACK, -1);
        p.addEffect(effect);
    }
}
