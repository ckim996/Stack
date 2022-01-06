public class BalanceCheckerMain
{
    public static void main(String[] args)
    {
        String expression = "a {b [c (d + e)/2 - f] + 1}";
        String one = "[a {b/(c-d)+e/(f+g)}-h]";
        String two = "{a[b+(c+2)/d] + e)+f}";
        String three = "[a {b + [c(d+e)-f] +g}";
        boolean isBalanced = BalanceChecker.checkBalance(expression);
        boolean isBalancedOne = BalanceChecker.checkBalance(one);
        boolean isBalancedTwo = BalanceChecker.checkBalance(two);
        boolean isBalancedThree = BalanceChecker.checkBalance(three);

        if(isBalanced)
            System.out.println(expression + " is balanced");
        else
            System.out.println(expression + "is not balanced");

        if(isBalancedOne)
            System.out.println(one + " is balanced");
        else
            System.out.println(one + "is not balanced");

        if(isBalancedTwo)
            System.out.println(two + " is balanced");
        else
            System.out.println(two + "is not balanced");

        if(isBalancedThree)
            System.out.println(three + " is balanced");
        else
            System.out.println(three + "is not balanced");
    }
}
