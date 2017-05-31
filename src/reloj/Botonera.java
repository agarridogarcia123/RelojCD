/**
 * clase botonera, tenemos los botones del reloj
 */
package reloj;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author Araceli
 * @version 29/05/2017
 */
public class Botonera {
   
    static boolean alarmRings, setHr, setAlarm;
   
 
    
    /**
     * botones que nos permiten configurar el reloj
     * @param alarmRings enseña si la alarma esta en on o off
     * @param showSetHr permite conf la hora
     * @param showSetAlarm  muestra cuando la alarma está encendida
     */
    public Botonera(boolean showAlarmActive, boolean showSetHr, boolean showSetAlarm) {
       this.alarmRings = showAlarmActive;
       this.setAlarm = showSetAlarm;
       this.setHr = showSetHr;
    }

    public Botonera() {
        
    }
    
    /**
     * muestra si la alarma está en on
     */
    public static void arlamOn(){
        Display.showLeds(false,true,false);
        
    }
     /**
     * sirve paa conf la hora actual
     */
    public static void configHr(){
       
        Display.showLeds(true,false,true);
        Display.showHourMin();
        
        
    }
    /**
     * muestra si la alarma esta en off
     */
    public static void alarmOff(){
        Display.showLeds(false, false, false);
    }
        /**
     * aumenta los minutos
     */
    public static void plusMin(){
        if(Display.ledAlarm ==true){
            Reloj.alarmHour = Reloj.alarmHour.plusMinutes(1);
        }else
        {
      Reloj.hourNow  =   Reloj.hourNow.plusMinutes(1);
      Display.showHourMin();
        } 
  
    }
    /**
     * apaga la alarma
     */
    public static void stopAlarm(){
        Reloj.timer.cancel();
       
    }
   
    /**
     * configura la hora de la alarma
     */
    public static void configAlarm(){
     
        Display.showLeds(false,true,true);
        Display.showHourMin();
        
        
    }
    /**
     * aumenta la hora
     * 
     */
    public static void plusHr(){
     if(Display.ledAlarm==true){
      Reloj.alarmHour = Reloj.alarmHour.plusHours(1);
      Display.showHourMin();
     }else{
     Reloj.hourNow = Reloj.hourNow.plusHours(1);
     
      Display.showHourMin();
     }
    }

}
