/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author fernando
 */
public class MyStack implements StackInterface {

    //stack principle is LIFO - last in at 0 index
    private ArrayList<String> theStack;

    public MyStack() {
        theStack = new ArrayList<>();
    }

    public int size() {
        return theStack.size();

    }

    public boolean isEmpty() {
        return theStack.isEmpty();
    }

    public boolean isFull() {
        return false;
    }

    public void push(Object newItem) {
        theStack.add(0, (String) newItem);
    }

    public Object pop() {
        if (!theStack.isEmpty()) {
            return theStack.remove(0);
        } else {
            return null;
        }
    }

    public Object peek() {
        return theStack.get(0);
    }

    public String display() {
        Iterator it;
        it = theStack.iterator();
        //create an empty string
        String str = "";
        //iterate over the stack and add the next item to the string
        //check if its empty
        if (theStack.isEmpty()) {
            str = str.concat("Stack is empty");
        } else {

            while (it.hasNext()) {
                str = str.concat((String) it.next());
                str = str.concat("; ");
            }
        }

        //return the string for display
        return str;
    }
    
    public void emptyStack() {
        while(!theStack.isEmpty()){
            pop();
        }
    };

}
