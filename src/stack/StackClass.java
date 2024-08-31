/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

/**
 *
 * @author PC
 */
public class StackClass {
    
    private int maxSize;
    private double[] StackArray; //storage
    private int top;
    
    public StackClass(int Size){
        maxSize = Size;
        StackArray = new double[maxSize];
        top = -1;
    }
    
    public void push(double numberValue){
        if (!isFull()) {
            StackArray[++top] = numberValue;
        } else {
            System.out.println( "Ang imohang stack kay full na!! barabida!!");
        
        }
    }
    
    public double pop (){
        if (!isEmpty()){
            return StackArray[top--];
       } else {
            System.out.println("Ang stack kay very much empty na!!");
            return -1;
        }
    }
    
    public double peek(){
        if(!isEmpty()){
            return StackArray[top];
        } else {
            System.out.println("Stack kay empty na lagi! No pilit!");   
          return -1;
        }
    }
    
    public boolean isEmpty(){
        return(top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize - 1);
    }
}

//non existing ang negative 1
//last in, first out