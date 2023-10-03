package personal;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);

        String[] inputBySplit = input.split(":|,");
        ArrayList<Integer> inputBySplitParseInt = new ArrayList<>();
        for (String num : inputBySplit) {
            inputBySplitParseInt.add(Integer.parseInt(num));
        }
        for (Integer n : inputBySplitParseInt) {
            System.out.println(n);
        }
    }
}
