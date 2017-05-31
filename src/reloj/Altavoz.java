/**
 * 
 * clase para el altavoz del reloj
 * 
 */
package reloj;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
/**
 *
 * @author Araceli
 */
public class Altavoz {
   static  boolean ringOn;
   static  Clip melody;
  
/**
 * 
 * @param ringOn activa la alarma y avisa cuando suena
 * @param music sonido de la alarma
 */
    public Altavoz(boolean ringOn, Clip music) {
        this.ringOn = ringOn;
        this.melody = music;
    }

    public Altavoz() {
      
        
        
    }
    /**
     * hace que suene la alarma cuando es la hora
     */
    public static void alarmaSonando(){
         try {
           melody = AudioSystem.getClip();
           
       } catch (LineUnavailableException ex) {
           System.out.println("Error no audio:"+ex.getMessage());
       }
        
    }
}
