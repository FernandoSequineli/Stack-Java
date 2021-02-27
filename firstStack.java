/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

/**
 *
 * @author fernando
 */
public class firstStack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
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
