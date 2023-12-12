package structural_patterns.proxy;

import java.util.HashMap;
import java.util.Map;

public class CalculatorOperationCache {
    private Map<String, Integer> cache = new HashMap<>();

    public void put(CalcuatorCachValue value, int result) {
        cache.put(value.getKey(), result);
    }

//    TODO: для сложения и умножения сделать проверку на одинаковые числа, даже если они в разном порядке
    public Integer get(CalcuatorCachValue value) {
        return cache.get(value.getKey());
    }
}
