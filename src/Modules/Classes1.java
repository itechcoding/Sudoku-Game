package Modules;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Classes1 {

    public static LineBorder panelBorder = new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 255), 1, true);

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
    public static Color exit = new java.awt.Color(0, 255, 0);
    public static Color game = new java.awt.Color(200, 100, 200);
    public static Color reset;
    public static Color confirm;
    public static Color selecctLevel;
    public static LineBorder labelBorder = new javax.swing.border.LineBorder(new java.awt.Color(200, 0, 200), 1, true);
    public static LineBorder tfBorder = new javax.swing.border.LineBorder(new java.awt.Color(200, 100, 200), 2, true);
    public static Color tfBg = new java.awt.Color(100, 100, 100);
    /**
     * Fonts weight PLAIN = 0 BOLD = 1 ITALIC = 2 BOLD ITALIC = 3
     */

    public static Font comic = (new java.awt.Font("Comic Sans MS", 1, 18));
    public static Font andika = (new java.awt.Font("Andika", 1, 18));
    public static Font arial = (new java.awt.Font("Arial", 1, 18));
    public static Font arialBlack = (new java.awt.Font("Arial Black", 1, 18));
    public static Font handwriting = (new java.awt.Font("Bradley HandITC", 1, 18));
    public static Font handwritingsmall = (new java.awt.Font("Bradley HandITC", 0, 12));
    public static Font handwritinghead = (new java.awt.Font("Bradley HandITC", 1, 20));
    public static Font calibri = (new java.awt.Font("Calibri", 1, 18));
    public static Font calibriLight = (new java.awt.Font("Calibri Light", 1, 18));
    public static Font courierNew = (new java.awt.Font("Courier New", 1, 18));
    public static Font dejavuSans = (new java.awt.Font("DejaVu Sans", 1, 18));
    public static Font elephant = (new java.awt.Font("Elephant", 1, 18));
    public static Font euclid = (new java.awt.Font("Euclid", 1, 18));
    public static Font freeMono = (new java.awt.Font("FreeMono", 1, 18));
    public static Font freeSans = (new java.awt.Font("FreeSans", 1, 18));
    public static Font freeSerif = (new java.awt.Font("FreeSErif", 1, 18));
    public static Font georgia = (new java.awt.Font("Georgia", 1, 18));
    public static Font gigi = (new java.awt.Font("Gigi", 1, 18));
    public static Font harrington = (new java.awt.Font("Harrington", 1, 18));
    public static Font jokerMan = (new java.awt.Font("Jokerman", 1, 18));
    public static Font lato = (new java.awt.Font("Lato", 1, 11));
    public static Font latoBlack = (new java.awt.Font("Lato Black", 1, 18));
    public static Font extraBold = (new java.awt.Font("Rockwell Extra Bold", 1, 18));

    //method to reset all TextFields
    public static void RESET(JTextField list[]) {
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

//            Lets run our sudoku1 class and see the panels
        }
    }

    public static void JPANEL_LAYOUT(JPanel[] panel) {
        for (int i = 0; i < panel.length; i++) {
            // Now this will work when we add the labels/fields
            panel[i].setLayout(new GridLayout(3, 3));

        }
    }

    public static void LABEL_PROPS(JLabel[] label) {

        for (int i = 0; i < label.length; i++) {
            label[i].setForeground(blue);
            label[i].setBackground(pink);
            label[i].setFont(comic);
            label[i].setBorder(labelBorder);
        }
    }

    public static void TEXTFIELD_PROPS(JTextField[] list) {
      	for(int i = 0; i < list.length; i ++) {
//			list[i].setForeground(Classes1.yellow);
//			list[i].setFont(Classes1.handwriting);
//			list[i].setBorder(Classes1.tfBorder);
//			list[i].setBackground(Classes1.tfBg);
		}
    }

    public static void LEVELS_PROPS(JMenuItem[] x) {
        for (int i = 0; i < x.length; i++) {

            if (i > 0 && i < 6) {
                x[i].setForeground(blue);
            }

            x[0].setForeground(green);
            x[0].setToolTipText("Exit The Game");
            x[0].setMnemonic(KeyEvent.VK_Q);
            x[1].setToolTipText("Press H for help");
            x[1].setMnemonic(KeyEvent.VK_H);
            x[2].setToolTipText("Next Level");
            x[2].setMnemonic(KeyEvent.VK_N);
            x[3].setToolTipText("Previous Level");
            x[3].setMnemonic(KeyEvent.VK_P);
            x[4].setToolTipText("Reset the Game");
            x[4].setMnemonic(KeyEvent.VK_R);
            x[5].setToolTipText("Check");
            x[5].setMnemonic(KeyEvent.VK_C);

            if (i > 5 && i <= 15) {
                if (i % 2 == 0) {
                    x[i].setForeground(darkGray);
                } else {
                    x[i].setForeground(gray);
                }
            }

            if (i > 15 && i <= 25) {
                if (i % 2 == 0) {
                    x[i].setForeground(cyan);
                } else {
                    x[i].setForeground(magenta);
                }
            }

            if (i > 25 && i <= 35) {
                if (i % 2 == 0) {
                    x[i].setForeground(blue);
                } else {
                    x[i].setForeground(yellow);
                }
            }

            if (i > 35 && i <= 45) {
                if (i % 2 == 0) {
                    x[i].setForeground(black);
                } else {
                    x[i].setForeground(cyan);
                }
            }
            if (i > 45) {
                if (i % 2 == 0) {
                    x[i].setForeground(red);
                } else {
                    x[i].setForeground(blue);
                }
            }
        }
    }

    public static void JMENU_FOREGROUND(JMenu[] x) {
        String texte = "Exit the game";
        String texth = "Help, How to go about it";
        String textg = "Next or Previous level";
        String textr = "Reset game";
        String textc = "Check";
        String texts = "Select the Stage to proceed";

        for (int i = 0; i < x.length; i++) {

            x[0].setForeground(red);
            x[0].setToolTipText(texte);
            x[1].setForeground(magenta);
            x[1].setToolTipText(textg);
            x[2].setForeground(magenta);
            x[2].setToolTipText(textc);
            x[3].setForeground(darkGray);
            x[3].setToolTipText(textr);
            x[4].setForeground(green);
            x[4].setToolTipText(texts);
            x[5].setForeground(blue);
            x[5].setToolTipText(texth);
            x[6].setForeground(magenta);
            x[7].setForeground(pink);
            x[8].setForeground(gray);
            x[9].setForeground(blue);
            x[10].setForeground(red);

        }

    }
}
