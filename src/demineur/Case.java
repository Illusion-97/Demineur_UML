package demineur;

import java.util.List;

public class Case {
    public State state;
    private final List<Case> voisines;

    public Case(State state, List<Case> voisines) {
        this.state = state;
        this.voisines = voisines;
    }

    public void devoiler() {
        System.out.println("\u001B[36mCase.devoiler\u001B[0m");
        System.out.println("state = \u001B[31m" + state + "\u001B[0m");
        switch (state) {
            case MINEE -> Partie.perdre();
            case NUMEROTEE -> Partie.testGagner();
            case VIDE -> voisines.forEach(Case::decouvrir);
        }
    }

    public void decouvrir() {
        System.out.println("\u001B[36mCase.decouvrir\u001B[0m");
        System.out.println("state = \u001B[31m" + state + "\u001B[0m");
    }

    public enum State {
        MINEE, NUMEROTEE, VIDE
    }
}
