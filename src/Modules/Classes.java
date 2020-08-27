package Modules;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Classes {
    
    
    
    public static Color red = Color.RED;
	public static Color blue = Color.BLUE;
	public static Color black = Color.BLACK;
	public static Color cyan = Color.CYAN;
	public static Color green = Color.GREEN;
	public static Color orange = Color.ORANGE;
	public static Color yellow = Color.YELLOW;
	public static Color pink = Color.PINK;
	public static Color magenta = Color.MAGENTA;
	public static Color darkGray = Color.DARK_GRAY;
	public static Color gray = Color.GRAY;
	public static Color lightGray = Color.LIGHT_GRAY;
	public static Color white = Color.WHITE;
	public static Color next;
	public static Color exit = new java.awt.Color(0, 255, 0 );
	public static Color game = new java.awt.Color(200, 100, 200);
	public static Color reset;
	public static Color confirm;
	public static Color selecctLevel;
	public static LineBorder labelBorder = new javax.swing.border.LineBorder(new java.awt.Color(200, 0, 200), 1, true);
	public static LineBorder tfBorder =  new javax.swing.border.LineBorder(new java.awt.Color(200, 100, 200), 2, true);
	public static LineBorder panelBorder = new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true);
	public static Color tfBg = new java.awt.Color(100, 100, 100);
		/**
		 * Fonts weight
		 * PLAIN = 0
		 * BOLD = 1
		 * ITALIC = 2
		 * BOLD ITALIC = 3
		 */
	
	public static Font comic = (new java.awt.Font("Comic Sans MS", 1, 18));
	public static Font andika = (new java.awt.Font("Andika",  1, 18));
	public static Font arial = (new java.awt.Font("Arial", 1, 18));
	public static Font arialBlack = (new java.awt.Font("Arial Black",  1, 18));
	public static Font handwriting = (new java.awt.Font("Bradley HandITC",  1, 18));
        public static Font handwritingsmall = (new java.awt.Font("Bradley HandITC",  0, 12));
	public static Font handwritinghead = (new java.awt.Font("Bradley HandITC",  1, 20));
	public static Font calibri = (new java.awt.Font("Calibri",  1, 18));
	public static Font calibriLight = (new java.awt.Font("Calibri Light",  1, 18));
	public 	static Font courierNew = (new java.awt.Font("Courier New",  1, 18));
	public static Font dejavuSans = (new java.awt.Font("DejaVu Sans",  1, 18));
	public static Font elephant = (new java.awt.Font("Elephant",  1, 18));
	public static Font euclid = (new java.awt.Font("Euclid",  1, 18));
	public static Font freeMono = (new java.awt.Font("FreeMono",  1, 18));
	public static Font freeSans = (new java.awt.Font("FreeSans", 1, 18));
	public static Font freeSerif = (new java.awt.Font("FreeSErif",1, 18));
	public static Font georgia = (new java.awt.Font("Georgia", 1, 18));
	public static Font gigi = (new java.awt.Font("Gigi", 1, 18));
	public static Font harrington = (new java.awt.Font("Harrington", 1, 18));
	public static Font jokerMan = (new java.awt.Font("Jokerman", 1, 18));
	public static Font lato = (new java.awt.Font("Lato", 1, 11));
	public static Font latoBlack = (new java.awt.Font("Lato Black",1, 18));
	public static Font extraBold = (new java.awt.Font("Rockwell Extra Bold", 1, 18));
	

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

    public static void JPANEL_GAME(JPanel[] panel) {
       for(int i = 0; i < panel.length; i++){
           panel[i].setBackground(cyan);
           panel[i].setBorder(panelBorder);
       }
    }

    public static void BUTTONS_HOME(JButton[] but) {
    for(int i = 0; i < but.length; i++){
        but[i].setForeground(blue);
        but[i].setFont(handwriting);
        but[i].setBackground(cyan);
        but[i].setFont(elephant);
        but[i].setBorderPainted(false);
    }
    }

}
