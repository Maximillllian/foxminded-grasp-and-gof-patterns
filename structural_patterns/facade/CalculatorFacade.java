package structural_patterns.facade;

import jakarta.xml.soap.*;
import structural_patterns.facade.calculator.org.tempuri.*;
import structural_patterns.facade.soap.CalculatorSOAP;

public class CalculatorFacade {
    private final static CalculatorSOAP soap = new CalculatorSOAP();

    public static int add(int number1, int number2) {
        var add = new Add();
        add.setIntA(number1);
        add.setIntB(number2);
        var response = soap.sendMessageToSOAPServer(add, "Add", AddResponse.class);
        return response.getAddResult();
    }

    public static int multiply(int number1, int number2) {
        var multiply = new Multiply();
        multiply.setIntA(number1);
        multiply.setIntB(number2);
        var response = soap.sendMessageToSOAPServer(multiply, "Multiply", MultiplyResponse.class);
        return response.getMultiplyResult();
    }

    public static int divide(int number1, int number2) {
        var divide = new Divide();
        divide.setIntA(number1);
        divide.setIntB(number2);
        var response = soap.sendMessageToSOAPServer(divide, "Divide", DivideResponse.class);
        return response.getDivideResult();
    }

    public static int subtract(int number1, int number2) {
        var subtract = new Subtract();
        subtract.setIntA(number1);
        subtract.setIntB(number2);
        var response = soap.sendMessageToSOAPServer(subtract, "Subtract", SubtractResponse.class);
        return response.getSubtractResult();
    }
}
