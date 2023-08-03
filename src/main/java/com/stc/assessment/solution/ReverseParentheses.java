package com.stc.assessment.solution;

import java.util.Stack;

public class ReverseParentheses {
    public static String reverseParentheses(String theGivenString) {
        Stack<Character> theStack = new Stack<>();

        // Iterate through each character in the string
        for (char theChar : theGivenString.toCharArray()) {
            // If the character is a closing parentheses, reverse the string within the parentheses
            if (theChar == ')') {
                StringBuilder theStringBuilder = new StringBuilder();

                // Pop characters from the theStack until an opening parentheses is found
                while (!theStack.isEmpty() && theStack.peek() != '(') {
                    theStringBuilder.append(theStack.pop());
                }

                // Pop the opening parentheses
                theStack.pop();

                // Add the reversed string within parentheses back to the theStack
                while (!theStringBuilder.isEmpty()) {
                    theStack.add(theStringBuilder.charAt(0));
                    theStringBuilder.deleteCharAt(0);
                }
            }

            // If the character is not a closing parentheses, add it to the theStack
            else {
                theStack.add(theChar);
            }
        }

        // Create a StringBuilder to store the final output
        StringBuilder ans = new StringBuilder();

        // Pop all the characters from the theStack and add them to the StringBuilder
        while (!theStack.isEmpty()) {
            ans.append(theStack.pop());
        }
        
        // Reverse the StringBuilder and convert it to a String
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        // sample test cases
        System.out.println(reverseParentheses("abd(jnb)asdf")); // Output: abdbnjasdf
        System.out.println(reverseParentheses("abdjnbasdf"));   // Output: abdjnbasdf
        System.out.println(reverseParentheses("dd(df)a(ghhh)")); // Output: ddfdahhhg
    }
}