yksinkertainen laskuri.

```
public class Calculator {
private int currentValue = 0;

    public void reset() {
        currentValue = 0;
    }

    public void add(int value) {
        if (value < 0) {
            throw new IllegalArgumentException("Negative values not allowed");
        }
        currentValue += value;
    }

    public int getValue() {
        return currentValue;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.add(5);
        calc.add(10);
        System.out.println("Current value: " + calc.getValue()); // Should print 15
        calc.reset();
        System.out.println("After reset: " + calc.getValue()); // Should print 0
        try {
            calc.add(-3);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
```

Tämä laskuri toimii siten, että siihen voi lisätä vain positiivisia kokonaislukuja. Laskuri pitää kirjaa nykyisestä arvosta, jonka voi nollata reset-metodilla. Jos yritetään lisätä negatiivinen arvo, ohjelma heittää poikkeuksen. Arvon voi tarkistaa getValue-metodilla.
