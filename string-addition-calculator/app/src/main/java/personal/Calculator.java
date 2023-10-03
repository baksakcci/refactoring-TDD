package personal;

public class Calculator {
    public String[] removeSpecialCharacter(String input) {
        return input.split(":|,");
    }

    public Integer[] convertStringArrToIntegerArr(String[] inputs) {
        Integer[] convertedInputs = new Integer[inputs.length];
        for (int i = 0; i < inputs.length; i++) {
            convertedInputs[i] = Integer.parseInt(inputs[i]);
        }
        for (Integer n : convertedInputs) {
            System.out.println(n);
        }
        return convertedInputs;
    }

    public int addNumber(Integer[] inputs) {
        int result = 0;
        for (Integer n : inputs) {
            result += n;
        }
        System.out.println(result);
        return result;
    }
}
