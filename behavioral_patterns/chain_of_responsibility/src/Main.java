package behavioral_patterns.chain_of_responsibility.src;

import behavioral_patterns.chain_of_responsibility.src.entities.Injury;

public class Main {

    public static void main(String[] args) {
        EmergencyCallHandler emergencyCallHandler = new Police();
        emergencyCallHandler.setNextHandler(new Ambulance());
        emergencyCallHandler.handle(new Injury());
    }
}
