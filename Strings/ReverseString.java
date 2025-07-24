package Strings;

import java.util.Stack;

public class ReverseString {
    public static String reverse(String s) {
        s += " ";
        Stack<String> st = new Stack<String>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                st.push(str);
                str = "";
            } else {
                str += s.charAt(i);
            }
        }
        String ans = "";
        while (st.size() != 1) {
            ans += st.peek() + " ";
            st.pop();
        }
        ans += st.peek();
        return ans;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        String reversed = reverse(s);
        System.out.println("Reversed String: " + reversed);
    }
}
