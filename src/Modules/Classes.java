package Modules;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Classes {
    
    public static LineBorder panelBorder = new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true);

    public static void RESET(JTextField[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i].setText(null);
        }
    }

    public static void JPANEL_LEVEL1(JPanel[] panel) {
        for (int i = 0; i < panel.length; i++) {
            
            /**
             * Lets set a background of green and a line Border
             */
            panel[i].setBackground(Color.green);
            panel[i].setBorder(panelBorder);
        }
    }

    public static void JPANEL_LAYOUT(JPanel[] panel) {
        for (int i = 0; i < panel.length; i++) {
            // Now this will work when we add the labels/fields
            panel[i].setLayout(new GridLayout(3, 3));
            
        }
    }

}
