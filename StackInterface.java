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
public interface StackInterface {
    public boolean isEmpty();
    public int size();
    public boolean isFull();
    public Object pop();
    public void push(Object newItem);
    
    
}
