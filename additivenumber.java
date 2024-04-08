//    Q1 22K-4005 MUJTABA SAQIB
public class additivenumber {
    public static boolean isAdditiveNumber(String num) {
        int n = num.length();
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                String first = num.substring(0, i);
                String second = num.substring(i, j);
                if (sequence(first, second, j, num)) {
                    return true;
                }
            }
        }
        return false;
    }
     static boolean sequence(String first, String second, int start, String num) {
        if ((first.startsWith("0") && first.length() > 1) || (second.startsWith("0") && second.length() > 1)) {
            return false;
        }

        String sum = addStrings(first, second);
        String nextNum = num.substring(start);

        if (nextNum.startsWith(sum)) {
            if (start + sum.length() == num.length()) {
                return true;
            }
            return sequence(second, sum, start + sum.length(), num);
        }
        return false;
    }

     static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || carry != 0) {
            if (i >= 0) carry += num1.charAt(i--) - '0';
            if (j >= 0) carry += num2.charAt(j--) - '0';
            sb.append(carry % 10);
            carry /= 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "112358";
        System.out.println(isAdditiveNumber(input));
    }
}
