/*
 * clase main, tenemos el menú del reloj despertador
 * 
 * 
 */
package reloj;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JOptionPane;
/**
 *
 * @author Araceli
 * @version 29/05/2017
 */
public class Reloj {

    
    static LocalTime hourNow;
    static LocalTime alarmHour;
    static Timer timer;
    static TimerTask task;
    static boolean stopAlarm = true;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         task = new TimerTask() {
            @Override
            public void run() {
                
                if (alarmHour.getMinute() == LocalTime.now().getMinute() && alarmHour.getHour() == LocalTime.now().getHour()&& Display.ledAlarm==true) {
                    JOptionPane.showMessageDialog(null, "ALARMA SONANDO!!!");
                    Altavoz.alarmaSonando();
                    

                } else {
                    JOptionPane.showMessageDialog(null, "HORA ACTUAL : " + LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());
                }
            }
        };
        timer = new Timer();
        hourNow = LocalTime.now();
        alarmHour = LocalTime.now();
        int opcion;
        timer.schedule(task, 20, 100);
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "****MENÚ**** \n 1. configurar Hora  \n 2. Aumentar hora  \n 3. Aumentar minutos \n 4. Configurar Alarma \n 5. Mostrar Hora E minutos \n 6. Parar Alarma \n 7.AlarmOn \n 8.AlarmOff"));

            switch (opcion) {

                case 1:
                    Botonera.configHr();
                    break;
                case 2:
                    Botonera.plusHr();
                    break;
                case 3:
                    Botonera.plusMin();
                    break;
                case 4:
                    Botonera.configAlarm();
                    break;
                case 5:
                    Display.showHourMin();
                    break;
                case 6:
                    Botonera.stopAlarm();
                    break;
                case 7:
                    Botonera.arlamOn();
                    break;
                case 8:
                    Botonera.alarmOff();
                    break;
            }

        } while (opcion != 0);
     
task.cancel();
    }
    
}
