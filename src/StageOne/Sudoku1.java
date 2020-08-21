package StageOne;

import Modules.Classes;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Sudoku1 extends JFrame {

    JPanel panelA, panelB, panelC,
            panelD, panelE, panelF,
            panelG, panelH, panelI;

    JMenuBar menubar;

    JMenu EXIT, GAME, CONFIRM, RESET,
            STAGE, F1, STAGEONE, STAGETWO, STAGETHREE, STAGEFOUR, STAGEFIVE;
    JMenuItem exit, f1, next, previous, reset, confirm,
            stage1lev1, stage1lev2, stage1lev3, stage1lev4, stage1lev5, stage1lev6, stage1lev7, stage1lev8, stage1lev9, stage1lev10,
            stage2lev1, stage2lev2, stage2lev3, stage2lev4, stage2lev5, stage2lev6, stage2lev7, stage2lev8, stage2lev9, stage2lev10,
            stage3lev1, stage3lev2, stage3lev3, stage3lev4, stage3lev5, stage3lev6, stage3lev7, stage3lev8, stage3lev9, stage3lev10,
            stage4lev1, stage4lev2, stage4lev3, stage4lev4, stage4lev5, stage4lev6, stage4lev7, stage4lev8, stage4lev9, stage4lev10,
            stage5lev1, stage5lev2, stage5lev3, stage5lev4, stage5lev5, stage5lev6, stage5lev7, stage5lev8, stage5lev9, stage5lev10;

    JTextField panelAtextField1, panelAtextField12, panelAtextField13,
            panelAtextField15, panelAtextField18, panelAtextField19,
            panelBtextField1, panelBtextField2, panelBtextField3,
            panelBtextField4, panelBtextField5, panelBtextField6,
            panelBtextField8, panelBtextField9,
            panelCtextField2, panelCtextField3, panelCtextField6,
            panelCtextField7, panelCtextField8, panelCtextField9,
            panelDtextField1, panelDtextField2, panelDtextField3,
            panelDtextField4, panelDtextField6, panelDtextField9,
            panelEtextField1, panelEtextField2, panelEtextField3,
            panelEtextField5, panelEtextField6, panelEtextField8,
            panelFtextField1, panelFtextField7, panelFtextField9,
            panelGtextField2, panelGtextField6, panelGtextField7,
            panelHtextField2, panelHtextField3, panelHtextField4,
            panelHtextField5, panelHtextField6, panelHtextField9,
            panelItextField1, panelItextField2, panelItextField3,
            panelItextField6, panelItextField9, panelItextField8;

    JLabel panelAlabel4, panelAlabel6, panelAlabel7,
            panelBlabel5, panelBlabel7,
            panelClabel1, panelClabel4, panelClabel5,
            panelDlabel5, panelDlabel7, panelDlabel8,
            panelElabel4, panelElabel7, panelElabel9,
            panelFlabel2, panelFlabel3, panelFlabel4, panelFlabel5, panelFlabel6, panelFlabel8,
            panelGlabel1, panelGlabel3, panelGlabel4, panelGlabel5, panelGlabel8, panelGlabel9,
            panelHlabel1, panelHlabel7, paneHAlabel8,
            panelIlabel4, panelIlabel5, panelIlabel7;

    /*
    COnstructor
     */
    public Sudoku1() {
        setSize(364, 350);
        setTitle("Level 1");
        setResizable(false);
        setLayout(new GridLayout(3, 3));

        menubar = new JMenuBar();
        setJMenuBar(menubar);;

        exit = new JMenuItem("exit");
        exit.addActionListener((ActionEvent evt) -> {
            exitActionPerformed(evt);
        });

        next = new JMenuItem("Next");
        next.addActionListener((ActionEvent evt) -> {
            dispose();
            //Loadin stage one Level two. Lets create it
            sudoku2 s2 = new sudoku2();
            s2.setVisible(true);
        });

        previous = new JMenuItem("Previous");
        previous.addActionListener((ActionEvent evt) -> {
            previousAction(evt);
        });

        reset = new JMenuItem("Reset");
        reset.addActionListener((ActionEvent evt) -> {
            // TO clear all the input fields
            resetActionPerformed(evt);
        });

        confirm = new JMenuItem("Confirm");
        confirm.addActionListener((ActionEvent evt) -> {
            confirmActionPerformed(evt);
        });

//     Create Panels
        STAGEONE = new JMenu("Stage 1");

        STAGETWO = new JMenu("Stage 2");

        STAGETHREE = new JMenu("Stage 3");

        STAGEFOUR = new JMenu("Stage 4");

        STAGEFIVE = new JMenu("Stage 5");

        panelA = new JPanel();
        panelB = new JPanel();
        panelC = new JPanel();
        panelD = new JPanel();
        panelE = new JPanel();
        panelF = new JPanel();
        panelG = new JPanel();
        panelH = new JPanel();
        panelI = new JPanel();

        // Add panels to the main frame
        add(panelA);
        add(panelB);
        add(panelC);
        add(panelD);
        add(panelE);
        add(panelF);
        add(panelG);
        add(panelH);
        add(panelI);

        java.awt.Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

}
    public static void main(String[] args) {
        new Sudoku1();
    }
    private void exitActionPerformed(ActionEvent evt) {
        System.exit(0);
    }

    private void previousAction(ActionEvent evt) {
        /**
         * This is the first stage so there is no previous.
         */
        JOptionPane.showMessageDialog(null, "This is the First Level", "Alert!", JOptionPane.PLAIN_MESSAGE);
    }

    private void resetActionPerformed(ActionEvent evt) {

        //create an array to stor all the text fields
        JTextField[] list = {
            panelAtextField1, panelAtextField12, panelAtextField13,
            panelAtextField15, panelAtextField18, panelAtextField19,
            panelBtextField1, panelBtextField2, panelBtextField3,
            panelBtextField4, panelBtextField5, panelBtextField6,
            panelBtextField8, panelBtextField9,
            panelCtextField2, panelCtextField3, panelCtextField6,
            panelCtextField7, panelCtextField8, panelCtextField9,
            panelDtextField1, panelDtextField2, panelDtextField3,
            panelDtextField4, panelDtextField6, panelDtextField9,
            panelEtextField1, panelEtextField2, panelEtextField3,
            panelEtextField5, panelEtextField6, panelEtextField8,
            panelFtextField1, panelFtextField7, panelFtextField9,
            panelGtextField2, panelGtextField6, panelGtextField7,
            panelHtextField2, panelHtextField3, panelHtextField4,
            panelHtextField5, panelHtextField6, panelHtextField9,
            panelItextField1, panelItextField2, panelItextField3,
            panelItextField6, panelItextField9, panelItextField8
        };

        // Lets create a class to be reused to reset any given list (textfields)
        Classes.RESET(list);

    }

    private void confirmActionPerformed(ActionEvent evt) {

    }
}
