package structural_patterns.facade;

public class Main {
    public static void main(String[] args) {
        var calculator = new CalculatorFacadeImpl();
        var addResult = calculator.add(1, 2);
        System.out.println("AddResult - " + addResult);
        var subtractResult = calculator.subtract(4, 2);
        System.out.println("subtractResult - " + subtractResult);
        var divideResult = calculator.divide(18, 3);
        System.out.println("divideResult - " + divideResult);
        var multiplyResult = calculator.multiply(5, 2);
        System.out.println("multiplyResult - " + multiplyResult);
    }
}
