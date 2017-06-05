/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author issei
 */
public class File02 {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File fo = new File("C:/Users/issei/Documents/NetBeansProjects/memo.txt");
        
        FileReader fr = new FileReader(fo);
        
        BufferedReader br = new BufferedReader(fr);
        
        System.out.println(br.readLine());
        
        br.close();
    }
}
