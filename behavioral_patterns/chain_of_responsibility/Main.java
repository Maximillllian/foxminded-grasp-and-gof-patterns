package behavioral_patterns.chain_of_responsibility;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var router = new AccidentRouter();
        var accidents = List.of(new AccidentImpl(AccidentType.CRIME), new AccidentImpl(AccidentType.INJURY), new AccidentImpl(AccidentType.FIRE));

        accidents.forEach(it -> router.handle(it));
    }
}
