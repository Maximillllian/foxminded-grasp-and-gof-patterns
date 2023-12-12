package structural_patterns.proxy;

public class Main {
    public static void main(String[] args) {
        var proxy = new CalculatorProxy();

        print(proxy.add(1, 1), proxy.ADD);
        print(proxy.add(1, 1), proxy.ADD);
        print(proxy.add(1, 2), proxy.ADD);
        print(proxy.add(1, 2), proxy.ADD);
        print(proxy.multiply(2, 2), proxy.MULTIPLY);
        print(proxy.divide(6, 2), proxy.DIVIDE);
        print(proxy.subtract(6, 2), proxy.SUBTRACT);
    }

    private static void print(int result, String operation) {
        System.out.println("Result " + operation + ":" + result);
    }
}
