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

    JTextField panelAtextField1, panelAtextField2, panelAtextField3,
            panelAtextField5, panelAtextField8, panelAtextField9,
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
            panelHlabel1, panelHlabel7, panelHlabel8,
            panelIlabel4, panelIlabel5, panelIlabel7;

    /*
    COnstructor
     */
    public Sudoku1() {
        setSize(364, 350);
        setTitle("Level 1");
        setResizable(false);
        setLayout(new GridLayout(3, 3));

        /**
         * Lets add the menus.
         */
        menubar = new JMenuBar();
        setJMenuBar(menubar);

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

        f1 = new JMenuItem("Help");
        f1.addActionListener((ActionEvent evt) -> {
            // To do help 
        });

        stage1lev1 = new JMenuItem("Level 1");
        stage1lev2 = new JMenuItem("Level 2");
        stage1lev3 = new JMenuItem("Level 3");
        stage1lev4 = new JMenuItem("Level 4");
        stage1lev5 = new JMenuItem("Level 5");
        stage1lev6 = new JMenuItem("Level 6");
        stage1lev7 = new JMenuItem("Level 7");
        stage1lev8 = new JMenuItem("Level 8");
        stage1lev9 = new JMenuItem("Level 9");
        stage1lev10 = new JMenuItem("Level 10");

        stage2lev1 = new JMenuItem("Level 1");
        stage2lev2 = new JMenuItem("Level 2");
        stage2lev3 = new JMenuItem("Level 3");
        stage2lev4 = new JMenuItem("Level 4");
        stage2lev5 = new JMenuItem("Level 5");
        stage2lev6 = new JMenuItem("Level 6");
        stage2lev7 = new JMenuItem("Level 7");
        stage2lev8 = new JMenuItem("Level 8");
        stage2lev9 = new JMenuItem("Level 9");
        stage2lev10 = new JMenuItem("Level 10");

        stage3lev1 = new JMenuItem("Level 1");
        stage3lev2 = new JMenuItem("Level 2");
        stage3lev3 = new JMenuItem("Level 3");
        stage3lev4 = new JMenuItem("Level 4");
        stage3lev5 = new JMenuItem("Level 5");
        stage3lev6 = new JMenuItem("Level 6");
        stage3lev7 = new JMenuItem("Level 7");
        stage3lev8 = new JMenuItem("Level 8");
        stage3lev9 = new JMenuItem("Level 9");
        stage3lev10 = new JMenuItem("Level 10");

        stage4lev1 = new JMenuItem("Level 1");
        stage4lev2 = new JMenuItem("Level 2");
        stage4lev3 = new JMenuItem("Level 3");
        stage4lev4 = new JMenuItem("Level 4");
        stage4lev5 = new JMenuItem("Level 5");
        stage4lev6 = new JMenuItem("Level 6");
        stage4lev7 = new JMenuItem("Level 7");
        stage4lev8 = new JMenuItem("Level 8");
        stage4lev9 = new JMenuItem("Level 9");
        stage4lev10 = new JMenuItem("Level 10");

        stage5lev1 = new JMenuItem("Level 1");
        stage5lev2 = new JMenuItem("Level 2");
        stage5lev3 = new JMenuItem("Level 3");
        stage5lev4 = new JMenuItem("Level 4");
        stage5lev5 = new JMenuItem("Level 5");
        stage5lev6 = new JMenuItem("Level 6");
        stage5lev7 = new JMenuItem("Level 7");
        stage5lev8 = new JMenuItem("Level 8");
        stage5lev9 = new JMenuItem("Level 9");
        stage5lev10 = new JMenuItem("Level 10");
//     Create Panels
        STAGEONE = new JMenu("Stage 1");
        STAGEONE.add(stage1lev1);
        STAGEONE.add(stage1lev2);
        STAGEONE.add(stage1lev3);
        STAGEONE.add(stage1lev4);
        STAGEONE.add(stage1lev5);
        STAGEONE.add(stage1lev6);
        STAGEONE.add(stage1lev7);
        STAGEONE.add(stage1lev8);
        STAGEONE.add(stage1lev9);
        STAGEONE.add(stage1lev10);

        STAGETWO = new JMenu("Stage 2");
        STAGETWO.add(stage2lev1);
        STAGETWO.add(stage2lev2);
        STAGETWO.add(stage2lev3);
        STAGETWO.add(stage2lev4);
        STAGETWO.add(stage2lev5);
        STAGETWO.add(stage2lev6);
        STAGETWO.add(stage2lev7);
        STAGETWO.add(stage2lev8);
        STAGETWO.add(stage2lev9);
        STAGETWO.add(stage2lev10);

        STAGETHREE = new JMenu("Stage 3");
        STAGETHREE.add(stage3lev1);
        STAGETHREE.add(stage3lev2);
        STAGETHREE.add(stage3lev3);
        STAGETHREE.add(stage3lev4);
        STAGETHREE.add(stage3lev5);
        STAGETHREE.add(stage3lev6);
        STAGETHREE.add(stage3lev7);
        STAGETHREE.add(stage3lev8);
        STAGETHREE.add(stage3lev9);
        STAGETHREE.add(stage3lev10);

        STAGEFOUR = new JMenu("Stage 4");
        STAGEFOUR.add(stage4lev1);
        STAGEFOUR.add(stage4lev2);
        STAGEFOUR.add(stage4lev3);
        STAGEFOUR.add(stage4lev4);
        STAGEFOUR.add(stage4lev5);
        STAGEFOUR.add(stage4lev6);
        STAGEFOUR.add(stage4lev7);
        STAGEFOUR.add(stage4lev8);
        STAGEFOUR.add(stage4lev9);
        STAGEFOUR.add(stage4lev10);

        STAGEFIVE = new JMenu("Stage 5");
        STAGEFIVE.add(stage5lev1);
        STAGEFIVE.add(stage5lev2);
        STAGEFIVE.add(stage5lev3);
        STAGEFIVE.add(stage5lev4);
        STAGEFIVE.add(stage5lev5);
        STAGEFIVE.add(stage5lev6);
        STAGEFIVE.add(stage5lev7);
        STAGEFIVE.add(stage5lev8);
        STAGEFIVE.add(stage5lev9);
        STAGEFIVE.add(stage5lev10);

        STAGE = new JMenu("SELECT STAGE");
        STAGE.add(STAGEONE);
        STAGE.add(STAGETWO);
        STAGE.add(STAGETHREE);
        STAGE.add(STAGEFOUR);
        STAGE.add(STAGEFIVE);

        EXIT = new JMenu("EXIT");
        EXIT.add(exit);

        F1 = new JMenu("HELP");
        F1.add(f1);

        GAME = new JMenu("GAME");
        GAME.add(next);
        GAME.add(previous);

        RESET = new JMenu("RESET");
        RESET.add(reset);

        CONFIRM = new JMenu("CONFIRM");
        CONFIRM.add(confirm);

        menubar.add(EXIT);
        menubar.add(F1);
        menubar.add(GAME);
        menubar.add(RESET);
        menubar.add(CONFIRM);
        menubar.add(STAGE);

        panelA = new JPanel();
        // Adding fields in our panels
        panelAtextField1 = new JTextField();
        panelAtextField2 = new JTextField();
        panelAtextField3 = new JTextField();
        panelAlabel4 = new JLabel("  3");
        panelAtextField5 = new JTextField();
        panelAlabel6 = new JLabel("  2");
        panelAlabel7 = new JLabel("  6");
        panelAtextField8 = new JTextField();
        panelAtextField9 = new JTextField();
        panelA.add(panelAtextField1);
        panelA.add(panelAtextField2);
        panelA.add(panelAtextField3);
        panelA.add(panelAlabel4);
        panelA.add(panelAtextField5);
        panelA.add(panelAlabel6);
        panelA.add(panelAlabel7);
        panelA.add(panelAtextField8);
        panelA.add(panelAtextField9);

        panelB = new JPanel();
        panelBtextField1 = new JTextField();
        panelBtextField2 = new JTextField();
        panelBtextField3 = new JTextField();
        panelBtextField4 = new JTextField();
        panelBlabel5 = new JLabel("  7");
        panelBtextField6 = new JTextField();
        panelBlabel7 = new JLabel("  9");
        panelBtextField8 = new JTextField();
        panelBtextField9 = new JTextField();
        panelB.add(panelBtextField1);
        panelB.add(panelBtextField2);
        panelB.add(panelBtextField3);
        panelB.add(panelBtextField4);
        panelB.add(panelBlabel5);
        panelB.add(panelBtextField1);
        panelB.add(panelBlabel7);
        panelB.add(panelBtextField8);
        panelB.add(panelBtextField9);

        panelC = new JPanel();
        panelClabel1 = new JLabel("  5");
        panelCtextField2 = new JTextField();
        panelCtextField3 = new JTextField();
        panelClabel4 = new JLabel("  9");
        panelClabel5 = new JLabel(" 1");
        panelCtextField6 = new JTextField();
        panelCtextField7 = new JTextField();
        panelCtextField8 = new JTextField();
        panelCtextField9 = new JTextField();
        panelC.add(panelClabel1);
        panelC.add(panelCtextField2);
        panelC.add(panelCtextField3);
        panelC.add(panelClabel4);
        panelC.add(panelClabel5);
        panelC.add(panelCtextField6);
        panelC.add(panelCtextField7);
        panelC.add(panelCtextField8);
        panelC.add(panelCtextField9);

        panelD = new JPanel();
        panelDtextField1 = new JTextField();
        panelDtextField2 = new JTextField();
        panelDtextField3 = new JTextField();
        panelDtextField4 = new JTextField();
        panelDlabel5 = new JLabel("  2");
        panelDtextField6 = new JTextField();
        panelDlabel7 = new JLabel("  7");
        panelDlabel8 = new JLabel("  9");
        panelDtextField9 = new JTextField();
        panelD.add(panelDtextField1);
        panelD.add(panelDtextField2);
        panelD.add(panelDtextField3);
        panelD.add(panelDtextField4);
        panelD.add(panelDlabel5);
        panelD.add(panelDtextField6);
        panelD.add(panelDlabel7);
        panelD.add(panelDlabel8);
        panelD.add(panelDtextField9);

        panelE = new JPanel();
        panelEtextField1 = new JTextField();
        panelEtextField2 = new JTextField();
        panelEtextField3 = new JTextField();
        panelElabel4 = new JLabel("  3");
        panelEtextField5 = new JTextField();
        panelEtextField6 = new JTextField();
        panelElabel7 = new JLabel("  2");
        panelEtextField8 = new JTextField();
        panelElabel9 = new JLabel("  5");
        panelE.add(panelEtextField1);
        panelE.add(panelEtextField2);
        panelE.add(panelEtextField3);
        panelE.add(panelElabel4);
        panelE.add(panelEtextField5);
        panelE.add(panelEtextField6);
        panelE.add(panelElabel7);
        panelE.add(panelEtextField8);
        panelE.add(panelElabel9);

        panelF = new JPanel();
        panelFtextField1 = new JTextField();
        panelFlabel2 = new JLabel("  2");
        panelFlabel3 = new JLabel("  6");
        panelFlabel4 = new JLabel("  1");
        panelFlabel5 = new JLabel("  5");
        panelFlabel6 = new JLabel("  9");
        panelFtextField7 = new JTextField();
        panelFlabel8 = new JLabel("  8");
        panelFtextField9 = new JTextField();
        panelF.add(panelFtextField1);
        panelF.add(panelFlabel2);
        panelF.add(panelFlabel3);
        panelF.add(panelFlabel4);
        panelF.add(panelFlabel5);
        panelF.add(panelFlabel6);
        panelFtextField7 = new JTextField();
        panelF.add(panelFlabel8);
        panelFtextField9 = new JTextField();

        panelG = new JPanel();
        panelGlabel1 = new JLabel("  1");
        panelGtextField2 = new JTextField();
        panelGlabel3 = new JLabel("  9");
        panelGlabel4 = new JLabel("  4");
        panelGlabel5 = new JLabel("  5");
        panelGtextField6 = new JTextField();
        panelGtextField7 = new JTextField();
        panelGlabel8 = new JLabel("  3");
        panelGlabel9 = new JLabel("  8");
        panelG.add(panelGlabel1);
        panelG.add(panelGtextField2);
        panelG.add(panelGlabel3);
        panelG.add(panelGlabel4);
        panelG.add(panelGlabel5);
        panelG.add(panelGtextField6);
        panelG.add(panelGtextField7);
        panelG.add(panelGlabel8);
        panelG.add(panelGlabel9);

        panelH = new JPanel();
        panelHlabel1 = new JLabel("  7");
        panelHtextField2 = new JTextField();
        panelHtextField3 = new JTextField();
        panelHtextField4 = new JTextField();
        panelHtextField5 = new JTextField();
        panelHtextField6 = new JTextField();
        panelHlabel7 = new JLabel("  4");
        panelHlabel8 = new JLabel("  5");
        panelHtextField9 = new JTextField();
        panelH.add(panelHlabel1);
        panelH.add(panelHtextField2);
        panelH.add(panelHtextField3);
        panelH.add(panelHtextField4);
        panelH.add(panelHtextField5);
        panelH.add(panelHtextField6);
        panelH.add(panelHlabel7);
        panelH.add(panelHlabel8);
        panelH.add(panelHtextField9);

        panelI = new JPanel();
        panelItextField1 = new JTextField();
        panelItextField2 = new JTextField();
        panelItextField3 = new JTextField();
        panelIlabel4 = new JLabel("  2");
        panelIlabel5 = new JLabel("  3");
        panelItextField6 = new JTextField();
        panelIlabel7 = new JLabel("  6");
        panelItextField8 = new JTextField();
        panelItextField9 = new JTextField();
        panelI.add(panelItextField1);
        panelI.add(panelItextField2);
        panelI.add(panelItextField3);
        panelI.add(panelIlabel4);
        panelI.add(panelIlabel5);
        panelI.add(panelItextField6);
        panelI.add(panelIlabel7);
        panelI.add(panelItextField8);
        panelI.add(panelItextField9);

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

        /**
         * We have added our panels but cannot be seen because their background
         * is colorless Lets create a method to style our panels and Fields.
         *
         */
        PLAY();

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
            panelAtextField1, panelAtextField2, panelAtextField3,
            panelAtextField5, panelAtextField8, panelAtextField9,
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

    private void PLAY() {
        // Here we will add methods to style our lables, textfields, panels, etc
        // Since we will reuse this methods, we will create them in a separate class
        // and then import them
        // Lets create an array of JPanels and create a method.

        JPanel[] panel = {
            panelA, panelB, panelC,
            panelD, panelE, panelF,
            panelG, panelH, panelI
        };

        /**
         * Lets create a method in class 'classes' to style panels of level1 and
         * we pass an array of panels as parameters
         */
        Classes.JPANEL_LEVEL1(panel);

        /**
         * Lets create a layout to this panels Each panel will require 9
         * labels/fields Lets create one method to handle this task Again we
         * will create this in our classes file // Now this will work when we
         * add the labels/fields.
         */
        Classes.JPANEL_LAYOUT(panel);

    }
}
