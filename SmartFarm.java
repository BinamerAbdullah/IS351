/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smart.farm;

/**
 *
 * @author HowFunny
 */
public class SmartFarm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        public int waterSensor waterSensor;
        public int Humidity humiditySensor;
        public int Sprinkles sprinklesSystem;
        
        
        
        public void watering(){
            
            if (humiditySensor <= 50){
                
               sprinklesSystem=1;
            }
        }
        
        public void checkHumidity(Humidity x){
            
            if (x >40){
                system.out.print("you should watering soon");
            }  
                else 
                system.out.print("Humidity is ok");
        
    }
    
}
