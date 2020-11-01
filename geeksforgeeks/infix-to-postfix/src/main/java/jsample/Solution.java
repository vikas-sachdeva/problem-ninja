package jsample;

import java.util.Stack;

public class Solution {

    public String solve(String infixExp) {
        StringBuilder postfixExp = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        for (int i = 0; i < infixExp.length(); i++) {
            char ch = infixExp.charAt(i);
            if (ch == '^' || ch == '(') {
                operatorStack.push(ch);
            } else if (ch == '/' || ch == '*' || ch == '+' || ch == '-') {
                while (!operatorStack.isEmpty()) {
                    char topChar = operatorStack.peek();
                    if (topChar == '/' || topChar == '*' || topChar == '^') {
                        postfixExp.append(operatorStack.pop());
                    } else if ((topChar == '+' || topChar == '-') && (ch == '+' || ch == '-')) {
                        postfixExp.append(operatorStack.pop());
                    } else {
                        break;
                    }
                }
                operatorStack.push(ch);
            } else if (ch == ')') {
                while (operatorStack.peek() != '(') {
                    postfixExp.append(operatorStack.pop());
                }
                operatorStack.pop();
            } else {
                postfixExp.append(ch);
            }
        }
        while (!operatorStack.isEmpty()) {
            postfixExp.append(operatorStack.pop());
        }
        return postfixExp.toString();
    }
}
