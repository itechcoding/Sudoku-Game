
package Modules;

import javax.swing.JTextField;


public class Classes {
 
    
    //method to reset all TextFields
    public static void RESET(JTextField list[]){
        for(int i = 0; i < list.length; i++){
            list[i].setText(null);
        }
    }
}
