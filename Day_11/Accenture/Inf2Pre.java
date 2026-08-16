import java.util.*;

public class Inf2Pre {
    static int priority(char ch) {
        if (ch == '*' || ch == '/')
            return 2;
        if (ch == '+' || ch == '-')
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().replaceAll(" ", "");

        String reversed = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);

            if (ch == '(')
                reversed += ')';
            else if (ch == ')')
                reversed += '(';
            else
                reversed += ch;
        }

        Stack<Character> stack = new Stack<>();
        String postfix = "";

        for (int i = 0; i < reversed.length(); i++) {
            char ch = reversed.charAt(i);

            if (Character.isDigit(ch)) {
                postfix += ch;
            }
            else if (ch == '(') {
                stack.push(ch);
            }
            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postfix += stack.pop();

                stack.pop();
            }
            else {
                while (!stack.isEmpty() &&
                       stack.peek() != '(' &&
                       priority(stack.peek()) > priority(ch)) {
                    postfix += stack.pop();
                }

                stack.push(ch);
            }
        }

        while (!stack.isEmpty())
            postfix += stack.pop();

        String prefix = "";

        for (int i = postfix.length() - 1; i >= 0; i--)
            prefix += postfix.charAt(i);

        System.out.println(prefix);
    }
}