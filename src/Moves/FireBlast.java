package Moves;
import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {super(Type.FIRE,110,85); }
    @Override
    protected java.lang.String describe() { return "Fire Blast deals damage and has a 10% chance of burning the target."; }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect();
        effect.chance(0.1);
        Effect.burn(p);
        p.addEffect(effect);
    }
}
