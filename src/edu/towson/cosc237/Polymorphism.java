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
        Class_1[] someObj = {new Class_1(), new Class_2(), new Class_3(), new Class_4()};
        System.out.println("Class_1 = superclass: method_1, method_2, toString");
        System.out.println("Class_2 = subclass of Class_1: method_2, toString");
        System.out.println("Class_3 = subclass of Class_1: method_1, toString");
        System.out.println("Class_4 = subclass of Class_3: method_2, toString\n");
        for (int i = 0; i < someObj.length; i++) {
            System.out.println(someObj[i]);//toString() invoked 
            someObj[i].method_1();
            someObj[i].method_2();
            System.out.println();
        }
    }

}
