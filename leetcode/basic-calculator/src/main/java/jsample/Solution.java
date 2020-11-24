package jsample;

public class Solution {

    public int solve(String s) {
        char[] chars = s.toCharArray();
        int len = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                chars[len++] = chars[i];
            }
        }

        int[] temp = new int[chars.length];
        int j = 0;
        int rightOperand = 0;
        int leftOperand = 0;
        int i = 0;
        while (i < len) {
            char ch = chars[i];
            switch (ch) {
                case '*':
                    i++;
                    while (i < len && chars[i] > 47) {
                        rightOperand = rightOperand * 10 + chars[i] - 48;
                        i++;
                    }
                    leftOperand = leftOperand * rightOperand;
                    rightOperand = 0;
                    break;
                case '/':
                    i++;
                    while (i < len && chars[i] > 47) {
                        rightOperand = rightOperand * 10 + chars[i] - 48;
                        i++;
                    }
                    leftOperand = leftOperand / rightOperand;
                    rightOperand = 0;
                    break;
                case '+':
                case '-':
                    temp[j++] = leftOperand;
                    temp[j++] = ch;
                    leftOperand = 0;
                    i++;
                    break;
                default:
                    while (i < len && chars[i] > 47) {
                        leftOperand = leftOperand * 10 + chars[i] - 48;
                        i++;
                    }
            }
        }
        temp[j++] = leftOperand;
        i = 0;
        while (i < j) {
            int val = temp[i];
            switch (val) {
                case '+':
                    rightOperand = temp[++i];
                    leftOperand = leftOperand + rightOperand;
                    break;
                case '-':
                    rightOperand = temp[++i];
                    leftOperand = leftOperand - rightOperand;
                    break;
                default:
                    leftOperand = val;
            }
            i++;
        }
        return leftOperand;
    }
}