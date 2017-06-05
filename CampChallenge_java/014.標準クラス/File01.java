/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author issei
 */
public class File01 {
    public static void main(String[] args) throws IOException{
        File fo = new File("C:/Users/issei/Documents/NetBeansProjects/memo.txt");
        
        FileWriter fw = new FileWriter(fo);
        
        fw.write("自己紹介");
        
        fw.close();
        
    }
}
