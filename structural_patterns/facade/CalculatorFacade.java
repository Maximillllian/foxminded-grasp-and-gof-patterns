package structural_patterns.facade;

import jakarta.xml.soap.*;
import structural_patterns.facade.calculator.org.tempuri.Add;
import structural_patterns.facade.calculator.org.tempuri.AddResponse;
import structural_patterns.facade.soap.CalculatorSOAP;

public class CalculatorFacade {
    public static int add(int number1, int number2) throws SOAPException {
        var add = new Add();
        add.setIntA(number1);
        add.setIntB(number2);
        var soap = new CalculatorSOAP();
        var response = soap.sendMessageToSOAPServer(add.toString(), "Add", AddResponse.class);
        return response.getAddResult();
    }
}
