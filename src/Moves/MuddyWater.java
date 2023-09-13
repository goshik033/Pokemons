package Moves;
import ru.ifmo.se.pokemon.*;

public class MuddyWater extends SpecialMove {
    public MuddyWater(){
        super(Type.WATER,90,85);
    }
    @Override
    protected java.lang.String describe(){
        return "Muddy Water deals damage and has a 30% chance of lowering the target's Accuracy by one stage.";
    }
    @Override
    protected void applyOppEffects(Pokemon p){
        Effect effect=new Effect();
        effect.chance(0.3);
        effect.stat(Stat.ACCURACY,-1);
        p.addEffect(effect);
    }
}
