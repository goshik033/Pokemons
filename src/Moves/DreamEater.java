package Moves;
import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater() {super(Type.PSYCHIC,100,100); }
    @Override
    protected java.lang.String describe(){
        return "Dream Eater deals damage only on sleeping foes and the user will recover 50% of the HP drained.";
    }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect=new Effect();
        effect.stat(Stat.HP);
        p.addEffect(effect);
    }
    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (att.getStat(Stat.SPEED) / 512.0D > Math.random()) {
            System.out.println("Критический удар!\nКто-то остался без сна...");
            return 2.0D;
        } else {
            return 1.0D;
        }}
}
