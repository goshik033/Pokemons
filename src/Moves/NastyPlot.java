package Moves;

import ru.ifmo.se.pokemon.*;

public class NastyPlot extends StatusMove {
    public NastyPlot() { super(Type.DARK,0.0,0.0); }
    @Override
    protected java.lang.String describe(){
        return "Nasty Plot raises the user's Special Attack by two stages.";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect=new Effect();
        effect.stat(Stat.SPECIAL_ATTACK, 2);
        p.addEffect(effect);
    }
}
