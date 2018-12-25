/**
 * FileName:   ConstrutorInitStep.java
 * @Description TODO
 * All rights Reserved, Code by Muskteer
 * Copyright MuskteerAthos@gmail.com
 * @author MuskteerAthos
 */
package com.muskteer.java.grammar.abstract_.ConstrutorInit;


/**
 * @author wanglei
 *
 */
public class ConstrutorInitStep extends Parent{

    Print a = new Print(7);
    static Print b = new Print(3);
    static {
        System.out.println("4");
    }
    
    public ConstrutorInitStep() {
        System.out.println("8");
    }
    
    public static void main(String[] args) {
        Parent p = new ConstrutorInitStep();
        p.hashCode();
    }
}
