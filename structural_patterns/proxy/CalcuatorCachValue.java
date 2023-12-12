package structural_patterns.proxy;

public class CalcuatorCachValue {
    private int number1;
    private int number2;
    private int result;

    public CalcuatorCachValue(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getKey() {
        return number1 + "," + number2;
    }
}
