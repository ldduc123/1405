/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se1405;

import util.MyToys;

/**
 *
 * @author Duc
 */
public class SE1405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("5! =" + MyToys.cF(5));//hy vọng 120
        System.out.println("6! =" + MyToys.cF(6));//execpted 720
        System.out.println("0! =" + MyToys.cF(0));//execpted 1
        System.out.println("-5! =" + MyToys.cF(-5));//vỡ mặt, 
                                                    //JVM ném vào mặt mình Ễcption
                                                    //giết app

    }
    
}
