class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            // Opening bracket → push onto stack
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);

            // Closing bracket → check if it matches top of stack
            } else {
                if (stack.isEmpty()) return false; // Nothing to match

                char top = stack.pop();

                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }

        // Stack must be empty at the end
        return stack.isEmpty();
    }
}