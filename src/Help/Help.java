package Help;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Help extends JFrame {

    JLabel picOne, picSolution;
    JTextArea textArea1, textArea2;
    JScrollPane jPane1, jPane2;
    JButton exit;

    /**
     * Constructor.
     */
    public Help() {
        setLayout(null);
        setSize(695, 570);
        setTitle("Sudoku Game | Help Page");
        setResizable(false);

        picOne = new JLabel();
        jPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        jPane2 = new JScrollPane();
        textArea2 = new JTextArea();
        picSolution = new JLabel();
        exit = new JButton();

        picOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Help/Help.png")));

        picOne.setBounds(50, 70, 210, 250);
        textArea1.setEditable(false);
        textArea1.setColumns(20);
        textArea1.setRows(5);
        textArea1.setText("1. There is only one valid solution to each Sudoku puzzle.\n   The only way the puzzle can be considered solved \n   correctly   is when all 81 boxes contain numbers and the\n   other Sudoku   rules have been followed.\n2. When you start a game of Sudoku, some blocks will be \n   pre-filled for you. You cannot change these numbers\n   in the  course of the game.\n3. Each column must contain all of the numbers 1 through 9 \n   and  no two numbers in the same column of a\n   Sudoku puzzle can be the same\n4.  Each row must contain all of the numbers 1 through 9  \n   and no two numbers in the same row of a Sudoku \n   puzzle can   be the same.\n 5. Each block must contain all of the numbers 1 through 9  \n   and no two numbers in the same block of a Sudoku \n   puzzle can  be the same. \n\n  Sudoku Solution When the rules are applied, the solved Sudoku \n   puzzle appears as shown: on the left");
        // textArea1.setFont()

        textArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 100, 100)));
        textArea1.setBounds(270, 130, 420, 300);
        
        textArea2.setEditable(false);
        textArea2.setColumns(20);
        textArea2.setRows(5);
        textArea2.setText("A standard Sudoku puzzle consists of a grid of 9 blocks.      \nEach block contains 9 boxes arranged in 3 rows and 3 columns.\nConsider this example of an actual Sudoku puzzle:");
        
        textArea2.setBounds(150,10,390,50);
        
        picSolution.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Help/Sol.png")));
        picSolution.setBounds(50,300,210,250);
        
        exit.setText("Exit");
        
        exit.addActionListener((ActionEvent e) -> {
            exitActionPerformed();
        });
        exit.setBounds(550,450,80,30);
        
        add(textArea1);
        add(textArea2);
        add(picOne);
        add(picSolution);
        add(exit);
        
        setVisible(true);
        
        /** Make it appear at the center.*/
        java.awt.Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, size.height/2 - getHeight()/2);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
	
        

    }

    public static void main(String[] args) {
        new Help();
        // Lets connect to our main page
        // Lets compile and run our program
    }
    private void exitActionPerformed() {
        dispose();
    }

}
