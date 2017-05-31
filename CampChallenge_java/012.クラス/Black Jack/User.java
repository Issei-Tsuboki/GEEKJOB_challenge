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
public class User extends Human {
    public int[] open(){
            int[] sum = {0,0};
            
            for(int i=0;i<myCard.size();i++){
                if(myCard.get(i) == 1){
                    sum[0] += 1;
                    sum[1] += 11;
                }else if(myCard.get(i)  >= 11){
                    sum[0] += 10;
                    sum[1] += 10;
                }else{
                    sum[0] += myCard.get(i);
                    sum[1] += myCard.get(i);
                }
            }
            return sum;    
    };
        
    public void setCard(ArrayList<Integer> uSetC){
        
        for(int i=0;i<uSetC.size();i++){
            myCard.add(uSetC.get(i));
        }
    };
        
    public boolean checkSum(int[] sum){
            
        if(sum[0]>15 || 22>sum[1] && sum[1]>18){
            return false;
        }else{
            return true;
        }
    };
}
