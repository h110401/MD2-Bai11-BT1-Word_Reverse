import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6};
        Stack<Integer> stack = new Stack<>();
        for (int e : intArray) {
            stack.push(e);
        }
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = stack.pop();
        }
        System.out.println(Arrays.toString(intArray));

        String wString = "Hello world !";
        Stack<String> wStack = new Stack<>();
        String[] split = wString.split(" ");
        for (String s : split) {
            wStack.push(s);
        }
        wString = "";
        for (int i = 0; i < split.length; i++) {
            wString += wStack.pop() + " ";
        }
        System.out.println(wString);


    }
}
