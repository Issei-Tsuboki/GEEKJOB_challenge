/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author issei
 */
public class Date03 {
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        Date day = sdf.parse("2016-11-04 10:00:00");
        
        System.out.println(day.getTime());
        System.out.print(sdf.format(day.getTime()));
        
    }
}
