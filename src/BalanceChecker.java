public class BalanceChecker
{
    public static boolean checkBalance(String expression)
    {
        StackInterface<Character> openDelimiterStack = new ArrayStack<>();

        int characterCount = expression.length();
        boolean isBalanced = true;
        int i = 0;
        char nextCharacter = ' ' ;

        while(isBalanced && ( i < characterCount))
        {
            nextCharacter = expression.charAt(i);
            switch(nextCharacter)
            {
                case '(': case '[': case '{':
                    openDelimiterStack.push(nextCharacter);
                    break;
                case ')': case ']': case '}':
                    if(openDelimiterStack.isEmpty())
                        isBalanced = false;
                    else
                    {
                        char openDelimiter = openDelimiterStack.pop();
                    }
                    break;
                default: break;
            }
            i++;
        }

        if(!openDelimiterStack.isEmpty())
        {
            isBalanced = false;
        }
        return isBalanced;
    }

    private static boolean isPaired(char open, char close)
    {
        return (open == '(' && close == ')') ||
                (open == '[' && close == ']') ||
                (open == '{' && close == '}');
    }
}
