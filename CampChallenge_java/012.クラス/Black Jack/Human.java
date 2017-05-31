/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BlackJack.servlet;

import java.util.ArrayList;

/**
 *
 * @author issei
 */
abstract class Human {
    abstract public int[] open();
        
    abstract public void setCard(ArrayList<Integer> hSetC);
        
    abstract public boolean checkSum(int[] sum);
        
    ArrayList<Integer> myCard = new ArrayList<>();
}
