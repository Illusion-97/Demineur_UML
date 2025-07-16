import demineur.Case;

import java.security.SecureRandom;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        getRandomCase().devoiler();
    }

    private static final SecureRandom random = new SecureRandom();

    public static Case getRandomCase() {
        return new Case(
                Case.State.values()[random.nextInt(3)],
                random.ints(9, 1, 3)
                        .mapToObj(i -> new Case(Case.State.values()[i], List.of()))
                        .toList()
        );
    }
}
