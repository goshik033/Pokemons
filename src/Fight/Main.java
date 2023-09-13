package Fight;

import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Sableye("Sableye", 50);
        Pokemon p2 = new Rapidash("Rapidash", 50);
        Pokemon p3 = new Ponyta("Ponyta", 50);
        Pokemon p4 = new Chimchar("Chimchar", 50);
        Pokemon p5 = new Monferno("Monferno", 50);
        Pokemon p6 = new Infernape("Infernape", 50);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
