public class Postfix
{
    public static String convertToPostfix(String infix)
    {
        StackInterface<Character> operatorStack = new LinkedStack<>();

        // use a StringBuilder object rather than a String, since appending is much more efficient.
        // To add to the StringBuilder object 'postfix':
        // postfix.append(stringToAppend);
        StringBuilder postfix = new StringBuilder();
        int length = infix.length();
        for(int i = 0; i < length; i++)
        {
            char nextCharacter = infix.charAt(i);
            if(isVariable(nextCharacter))
            {
                // TODO
            }
            else
            {
                switch(nextCharacter)
                {
                    // TODO
                    default:
                        break;
                }
            }
        }

        return postfix.toString();
    }

    public static int evaluatePostfix(String postfix)
    {
        //for each variable, we push it into the stack created in the method
        StackInterface<Integer> postStack = new LinkedStack<>();
        int i;
        int holder;
        int result;
        //for loop differentiates variables from operators
        for (i = 0; i < postfix.length(); i++){
            if (isVariable(postfix.charAt(i)) == true){
                holder = getValue(postfix.charAt(i));
                postStack.push(holder);
            }
            if (isOperator(postfix.charAt(i))){
                result = performOperation(postStack.pop(), postStack.pop(), postfix.charAt(i));
                postStack.push(result);
            }
            //return final remaining value, which represents the total of the function
        }
        return (postStack.pop());
    }

    private static int getValue(Character c)
    {
        switch(c)
        {
            case 'a':
                return 2;
            case 'b':
                return 3;
            case 'c':
                return 4;
            case 'd':
                return 5;
            case 'e':
                return 6;
            default:
                return 0;
        }
    }


    private static int performOperation(int operandOne, int operandTwo, char operator)
    {
         // each case for the possible operators passed into the function and performed on the operands
        switch (operator) {
            case '+':
                int total;
                total = operandOne + operandTwo;
                return total;
            case '-':
                total = operandOne - operandTwo;
                return total;
            case '*':
                total = operandOne * operandTwo;
                return total;
            case '/':
                total = operandOne / operandTwo;
                return total;
            default:
                return 0;
        }
        //return the total calculated depending on the case
        return 0;
    }

    private static int getPrecedence(char operator)
    {
        switch (operator)
        {
            case '(': case ')': return 0;
            case '+': case '-': return 1;
            case '*': case '/': return 2;
            case '^':           return 3;
        }
        return -1;
    }

    private static boolean isOperator(char c)
    {
        return (c == '+' || c == '-' || c == '*' || c == '/' || c == '^');
    }

    private static boolean isVariable(Character c)
    {
        return Character.isLetter(c);
    }
}
