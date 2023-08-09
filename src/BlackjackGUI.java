import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BlackjackGUI extends JFrame {
    //Grid
    int gridX = 125;
    int gridY = 60;
    int gridW = 550;
    int gridH = 200;

    //Label
    JLabel playerTotalLabel = new JLabel("Your score:");


    //Colors
    Color backgroundColor = new Color(55, 85, 10);
    Color buttonColor = new Color(100, 25, 25);
    Color buttonTextColor = new Color(Color.WHITE.getRGB());

    //Font
    Font font = new Font("Times New Roman", Font.BOLD, 28);
    Font font2 = new Font("Times New Roman", Font.BOLD, 30);

    //Buttons
    Button hitButton = new Button();
    Button stayButton = new Button();
    Button betButton = new Button();
    Button exitButton = new Button();

    public BlackjackGUI(){
        //Frame size, title, and gui visibility.
        this.setSize(900, 900);
        this.setTitle("Bambino's Blackjack");
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Board board = new Board();
        this.setContentPane(board);

        //User hit button.
        ActionPressHit aPress1 = new ActionPressHit();
        hitButton.addActionListener(aPress1);
        hitButton.setBounds(750, 725, 100, 50);
        hitButton.setBackground(buttonColor);
        hitButton.setForeground(buttonTextColor);
        hitButton.setFont(font);
        hitButton.setLabel("HIT");

        //User stay button.
        ActionPressStay aPress2 = new ActionPressStay();
        stayButton.addActionListener(aPress2);
        stayButton.setBounds(750, 800, 100, 50);
        stayButton.setBackground(buttonColor);
        stayButton.setForeground(buttonTextColor);
        stayButton.setFont(font);
        stayButton.setLabel("STAY");

        //User yes button.
        ActionPressBet aPress3 = new ActionPressBet();
        betButton.addActionListener(aPress3);
        betButton.setBounds(25, 810, 80, 40);
        betButton.setBackground(buttonColor);
        betButton.setForeground(buttonTextColor);
        betButton.setFont(font);
        betButton.setLabel("BET");

        //User no button.
        ActionPressExit aPress4 = new ActionPressExit();
        exitButton.addActionListener(aPress4);
        exitButton.setBounds(800, 20, 80, 33);
        exitButton.setBackground(Color.BLACK);
        exitButton.setForeground(Color.RED);
        exitButton.setFont(font);
        exitButton.setLabel("EXIT");

        //Add the Buttons to the board.
        board.add(hitButton);
        board.add(stayButton);
        board.add(betButton);
        board.add(exitButton);

        //Our player total score label.
        playerTotalLabel.setFont(font2);
        playerTotalLabel.setForeground(Color.BLACK);
        playerTotalLabel.setBackground(Color.BLACK);
        board.add(playerTotalLabel).setBounds(300, 755, 200, 80);
    }

    public class Board extends JPanel{

        public void paintComponent(Graphics g){
            g.setColor(backgroundColor);
            g.fillRect(0, 0, 900, 900);

            g.setColor(Color.BLACK);
            g.drawRect(gridX,gridY,gridW, gridH);

            g.drawRect(gridX, gridY * 9, gridW, gridH);
        }
    }

    public class ActionPressHit implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("HIT");
        }
    }

    public class ActionPressStay implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("STAY");
        }
    }

    public class ActionPressBet implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("BET");
        }
    }

    public class ActionPressExit implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}


