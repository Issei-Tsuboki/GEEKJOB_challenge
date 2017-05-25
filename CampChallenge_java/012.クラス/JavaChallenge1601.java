/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author issei
 */
public class JavaChallenge1601 {
    
    class Number{
        public int one = 0;
        public int two = 0;
        
        public void setNumber(int o,int t){
            this.one = o;
            this.two = t;
        }
        public void printNumber(){
            System.out.println(one);
            System.out.println(two);
        }
    }
    
    class Number2 extends Number{
        public void clear(){
            this.one = 0;
            this.two = 0;
        }
    }
    
}


