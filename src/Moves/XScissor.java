package Moves;
import ru.ifmo.se.pokemon.*;

public class XScissor extends PhysicalMove {
    public XScissor() {super(Type.BUG,80,100); }
    @Override
    protected java.lang.String describe() { return "X-Scissor deals damage with no additional effect."; }
}
