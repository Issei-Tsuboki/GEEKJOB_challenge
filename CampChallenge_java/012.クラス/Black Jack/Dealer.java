/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.BlackJack.servlet;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author issei
 */

public class Dealer extends Human {
    ArrayList<Integer> cards;
        Dealer(){
            cards =new ArrayList<>();
            
            for(int i=1;i<=4;i++){
                for(int j=1;j<=13;j++){
                        cards.add(j);
                }
            }
        }
    
        
        public ArrayList<Integer> deal(){
            ArrayList<Integer> dc = new ArrayList<>();
            Random rand = new Random();
            
            int rn = rand.nextInt(cards.size());
            dc.add(cards.get(rn));
            cards.remove(rn);
            
            int rn2 = rand.nextInt(cards.size());
            dc.add(cards.get(rn2));
            cards.remove(rn2);
            
            return dc;
        }
        
        public ArrayList<Integer> hit(){
            ArrayList<Integer> hc = new ArrayList<>();
            Random rand =new Random();
            
            int rn = rand.nextInt(cards.size());
            hc.add(cards.get(rn));
            cards.remove(rn);
            
            return hc;
        }
        
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
        
        public void setCard(ArrayList<Integer> dSetC){
            
            for(int i=0;i<dSetC.size();i++){
                myCard.add(dSetC.get(i));
            }
        };
        
        public boolean checkSum(int[] sum){
            
            if(sum[0]>16 || 22>sum[1] && sum[1]>16){
                return false;
            }else{
                return true;
            }
        };    
        
}