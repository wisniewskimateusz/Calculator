package pl.mateusz;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double add = calculator.add(2.5, 3);
        double substract = calculator.add(5, 3.3);
        System.out.println(add);
        System.out.println(substract);
    }
}
