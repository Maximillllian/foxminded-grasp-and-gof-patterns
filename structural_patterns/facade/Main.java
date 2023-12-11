package structural_patterns.facade;

public class Main {
    public static void main(String[] args) {
        var addResult = CalculatorFacade.add(1, 2);
        System.out.println("AddResult - " + addResult);
        var subtractResult = CalculatorFacade.subtract(4, 2);
        System.out.println("subtractResult - " + subtractResult);
        var divideResult = CalculatorFacade.divide(18, 3);
        System.out.println("divideResult - " + divideResult);
        var multiplyResult = CalculatorFacade.multiply(5, 2);
        System.out.println("multiplyResult - " + multiplyResult);
    }
}
