package Main;

import Help.Help;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Game extends JFrame {

    JPanel panelA, panelB, panelC, panelD;
    JDesktopPane pane;
    JMenuBar menubar;
    JMenuItem exit, Help;
    JButton easy, help, challenge, author;

    public Game() {
//        Set the size og f the fram
        this.setSize(300, 300);
        this.setTitle("Sudoku Game In Java");
        this.setResizable(false);
        this.setLayout(new GridLayout(2, 2));

        easy = new JButton("Start");
        easy.addActionListener((ActionEvent evt) -> {
            easyAction(evt);
        });

        help = new JButton("Help");
        help.addActionListener((ActionEvent evt) -> {
            HelpAction(evt);
        });
        challenge = new JButton("Challenge");
        challenge.addActionListener((ActionEvent evt) -> {
            challengeAction(evt);
        });
        author = new JButton("Author");
        author.addActionListener((ActionEvent evt) -> {
            authorAction(evt);
        });

        panelA = new JPanel();
        panelA.setSize(100, 100);
        panelA.add(easy);

        panelB = new JPanel();
        panelB.setSize(100, 100);
        panelB.add(help);
        panelC = new JPanel();
        panelC.add(challenge);
        panelC.setSize(100, 100);
        panelD = new JPanel();
        panelD.add(author);
        panelD.setSize(100, 100);

        this.add(panelA);
        this.add(panelB);
        this.add(panelC);
        this.add(panelD);

//        Set our frame to visible
        this.setVisible(true);

        // Lets make the frame to appear at the center of the screen after running
        java.awt.Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        this.setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

    }

      /** LETS CREATE OUR MAIN CLASS. */
    public static void main(String[] args) {
        Game game = new Game();
        game.setVisible(true);
    }

    private void easyAction(ActionEvent evt) {
        dispose();
        // To do later
    }

    private void HelpAction(ActionEvent evt) {
        
        Help hep = new Help();
        hep.setVisible(true);
       hep.setAlwaysOnTop(true);
        
    }

    private void challengeAction(ActionEvent evt) {
        dispose();
        // To do later
    }

    private void authorAction(ActionEvent evt) {
        dispose();
        // To do later
    }

}
