package Moves;
import ru.ifmo.se.pokemon.*;

public class FlameCharge extends PhysicalMove {
    public FlameCharge() {super(Type.FIRE,50,100); }
    @Override
    protected java.lang.String describe() { return "Flame Charge deals damage and raises the user's Speed by one stage."; }
    @Override
    protected void applySelfEffects(Pokemon p){
        Effect effect=new Effect();
        effect.stat(Stat.SPEED, 1);
        p.addEffect(effect);
    }
    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (att.getStat(Stat.SPEED) / 512.0D > Math.random()) {
            System.out.println("Критический удар!\nВот это огонь...");
            return 2.0D;
        } else {
            return 1.0D;
        }}
}
