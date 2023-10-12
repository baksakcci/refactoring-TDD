package personal;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        App app = new App();

        String input = app.getInputValue();
        String[] removed = calculator.removeSpecialCharacter(input);
        Integer[] converted = calculator.convertStringArrToIntegerArr(removed);
        Integer result = calculator.addNumber(converted);
    }

    public String getInputValue() {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(input);
        return input;
    }
}
