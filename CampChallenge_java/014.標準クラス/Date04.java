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
public class Date04 {
    public static void main(String[] args) throws ParseException{
        
        SimpleDateFormat sdf =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        
        Date day = sdf.parse("2015-01-01 00:00:00");
        Date day2 = sdf.parse("2015-12-31 23:59:59");
        
        System.out.print(day2.getTime() - day.getTime());
        
    }
}
