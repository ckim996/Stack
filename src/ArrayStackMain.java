public class ArrayStackMain
{
    public static void main(String[] args)
    {
        StackInterface<String> arrStack = new ArrayStack<>();
        arrStack.push("Jim");
        arrStack.push("Jess");
        arrStack.pop();
        arrStack.push("Jill");
        arrStack.push("Jane");
        arrStack.pop();

        System.out.println("Top of the stack: " + arrStack.peek());
        System.out.println("\nClearing the stack...");
        arrStack.clear();
        if(arrStack.isEmpty())
        {
            System.out.println("Stack status: Emtpy");
        }else{
            System.out.println("Stack status: Not Empty");
        }
    }
}
