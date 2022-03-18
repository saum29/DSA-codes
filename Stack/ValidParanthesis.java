import java.util.*;

public class ValidParanthesis {

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '{' || ch == '[' || ch == '(') {
                st.push(ch);
            } else {
                if (st.size() == 0)
                    return false;
                if (ch == '}' && st.peek() != '{')
                    return false;
                else if (ch == ']' && st.peek() != '[')
                    return false;
                else if (ch == ')' && st.peek() != '(')
                    return false;
                else {
                    st.pop();
                }
            }
        }
        return st.size() == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isValid(s));
    }

}
