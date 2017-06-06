/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;

/**
 *
 * @author issei
 */
public class File03 {
    public static void main(String[] args) throws IOException{
        //C:/Users/issei/Documents/NetBeansProjects/JavaChallenge/src/java/File/log.txt
        Date time = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        File fo = new File("C:/Users/issei/Documents/NetBeansProjects/JavaChallenge/src/java/File/log.txt");
        FileWriter fw = new FileWriter(fo,true);
        FileReader fr = new FileReader(fo);
        BufferedReader br = new BufferedReader(fr);
        
        fw.write(sdf.format(time) + "  開始");
        
        LinkedList<String> link = new LinkedList<>();
        
        link.add("二番目");
        link.add("３番目");
        link.add("５番目");
        link.addFirst("１番目");
        link.add(3,"４番目");
        System.out.println(link);
        
        link.set(1,"２番目");
        System.out.println(link);
        System.out.println(link.indexOf("３番目"));
        
        link.clear();
        System.out.println(link);
        
        fw.write(sdf.format(time) + "  終了");
        
        fw.close();
        
        System.out.println(br.readLine());
        
        br.close();
        
        
        
        
    }
}
