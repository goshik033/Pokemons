package Moves;
import ru.ifmo.se.pokemon.*;

public class AuraSphere extends SpecialMove {
    public AuraSphere() {super(Type.FIGHTING,80,10000); }

    @Override
    protected java.lang.String describe() { return "Aura Sphere deals damage and ignores changes to the Accuracy and Evasion stats."; }

    @Override
    protected double calcCriticalHit(Pokemon att,Pokemon def){
        if (att.getStat(Stat.SPEED) / 512.0D > Math.random()) {
        System.out.println("Критический удар!\nКакая сильная аура!!!");
        return 2.0D;
    } else {
        return 1.0D;
    }}

}