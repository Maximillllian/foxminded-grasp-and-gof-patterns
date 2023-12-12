package structural_patterns.proxy;

import structural_patterns.facade.CalculatorFacade;
import structural_patterns.facade.CalculatorFacadeImpl;

public class CalculatorProxy implements CalculatorFacade {
    private final CalculatorFacade calculatorFacade = new CalculatorFacadeImpl();

    private CalculatorOperationCache addResults = new CalculatorOperationCache();
    private CalculatorOperationCache multiplyResults = new CalculatorOperationCache();
    private CalculatorOperationCache divideResults = new CalculatorOperationCache();
    private CalculatorOperationCache subtractResults = new CalculatorOperationCache();

    public String MULTIPLY = "MULTIPLY";
    public String ADD = "ADD";
    public String DIVIDE = "DIVIDE";
    public String SUBTRACT = "SUBTRACT";

    @Override
    public int add(int number1, int number2) {
        return getValue(number1,  number2, ADD);
    }

    @Override
    public int multiply(int number1, int number2) {
        return getValue(number1, number2, MULTIPLY);
    }

    @Override
    public int divide(int number1, int number2) {
        return getValue(number1, number2, DIVIDE);
    }

    @Override
    public int subtract(int number1, int number2) {
        return getValue(number1, number2, SUBTRACT);
    }

    private int getValue(int number1, int number2, String operation) {
        var value = new CalcuatorCachValue(number1, number2);
        var cache = getCache(operation);
        var cachedValue = cache.get(value);
        if (cachedValue != null) {
            return cachedValue;
        }

        var result = sendRequest(operation, number1, number2);
        cache.put(value, result);
        return result;
    }

    private CalculatorOperationCache getCache(String operation) {
        if (operation.equals(ADD)) {
            return addResults;
        }

        if (operation.equals(SUBTRACT)) {
            return subtractResults;
        }

        if (operation.equals(DIVIDE)) {
            return divideResults;
        }

        if (operation.equals(MULTIPLY)) {
            return multiplyResults;
        }

        return null;
    }

    private Integer sendRequest(String operation, int number1, int number2) {
        if (operation.equals(ADD)) {
            return calculatorFacade.add(number1, number2);
        }

        if (operation.equals(SUBTRACT)) {
            return calculatorFacade.subtract(number1, number2);
        }

        if (operation.equals(DIVIDE)) {
            return calculatorFacade.divide(number1, number2);
        }

        if (operation.equals(MULTIPLY)) {
            return calculatorFacade.multiply(number1, number2);
        }

        return null;
    }
}
