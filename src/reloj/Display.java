/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reloj;


import java.time.LocalTime;
/**
 *
 * @author Araceli
 * @version 29/05/2017
 */
public class Display {
   static  boolean ledClock;
   static boolean ledAlarm;
   static boolean ledSet;
   
   
  /**
   * showHourMin() enseña hora actual
   */
   
   
    public static void showHourMin(){
        if(Display.ledAlarm ==true){
       System.out.println(Reloj.alarmHour.getHour()+": "+Reloj.alarmHour.getMinute());
        }else{
               System.out.println(Reloj.hourNow.getHour()+": "+Reloj.hourNow.getMinute()); 
               }
    }
   
    /**
     * 
     *enseña la hora actual, visualizamos la conf. del menú y vemos estado del led
     * 
     * @param ledClock muestra el led del reloj
     * @param ledAlarma muestra el led de la alarma
     * @alarm ledSet muestra cual de los dos anteriores esta puesto en el momento
     */
    public static void showLeds(boolean clock,boolean alarm,boolean set){
        ledClock = clock;
        ledAlarm = alarm;
        ledSet = set;
        
        
    }
}
