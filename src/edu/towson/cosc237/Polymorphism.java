/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.towson.cosc237;

/**
 *
 * @author skaza
 */
public class Polymorphism {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape[] someObj = {new Shape(), new Circle(), new Rectangle(), new Box()};
        System.out.println("Shape = superclass: method_1, method_2, toString");
        System.out.println("Circle = subclass of Shape: method_2, toString");
        System.out.println("Rectangle = subclass of Shape: method_1, toString");
        System.out.println("Box = subclass of Rectangle: method_2, toString\n");
        for (int i = 0; i < someObj.length; i++) {
            System.out.println(someObj[i]);//toString() invoked 
            someObj[i].method_1();
            someObj[i].method_2();
            System.out.println();
        }
    }

}
