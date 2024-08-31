/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author PC
 */
public class Stack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StackClass stackclass = new StackClass(3);
        stackclass.push(100);
        stackclass.push(5);
        stackclass.push(50);
        stackclass.push(500);
        stackclass.push(90);

        double peeking = stackclass.peek();
        System.out.println(peeking);
        
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        
        while(!stackclass.isEmpty()){
            double popping = stackclass.pop();
            System.out.println(popping);
        }
    }
    
}
