public class firstStack {


    public static void main(String[] args) {
        
        MyStack theStack = new MyStack();
        System.out.println("Size now:" +theStack.size());
        theStack.push("first on");
        System.out.println("Peek: "+theStack.peek());
        theStack.push("next");
        System.out.println("Peek: "+theStack.peek());
        theStack.push("last on");
        System.out.println("Peek: "+theStack.peek());
        System.out.println("Size now:" +theStack.size());
        System.out.println("Pop "+theStack.pop());
        System.out.println("Empty " +theStack.isEmpty());
        System.out.println(theStack.display());
        theStack.emptyStack();
         System.out.println(theStack.display());
    }
    
}
