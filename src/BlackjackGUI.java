import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BlackjackGUI extends JFrame {

    //ArrayList of cards for our player and dealer hands.
    private Hand handHelper = new Hand();
    private ArrayList<Card> playerCards = new ArrayList<>();
    private ArrayList<Card> dealerCards = new ArrayList<>();
    private final int spacing = 100;


    //Grid for card areas
    int gridX = 75;
    int gridY = 60;
    int gridW = 700;
    int gridH = 200;

    //Grid for individual cards.
    int cardGridX = -67;
    int cardGridY = 90;
    int cardGridW = 90;
    int cardGridH = 140;

    //Label
    JLabel playerTotalLabel = new JLabel("Your score:");
    JLabel dealerTotalLabel = new JLabel("Dealer's Score:");


    //Colors
    Color backgroundColor = new Color(55, 85, 10);
    Color buttonColor = new Color(100, 25, 25);
    Color buttonTextColor = new Color(Color.WHITE.getRGB());
    Color cardAreaColor = new Color(40, 15, 10);

    //Font
    Font font = new Font("Times New Roman", Font.BOLD, 28);
    Font font2 = new Font("Times New Roman", Font.BOLD, 30);

    //Buttons
    Button hitButton = new Button();
    Button stayButton = new Button();
    Button betButton = new Button();
    Button exitButton = new Button();

    public BlackjackGUI() {
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
        board.add(playerTotalLabel).setBounds(310, 425, 200, 80);

        //Our player total score label.
        dealerTotalLabel.setFont(font2);
        dealerTotalLabel.setForeground(Color.BLACK);
        dealerTotalLabel.setBackground(Color.BLACK);
        board.add(dealerTotalLabel).setBounds(275, 255, 200, 80);

        //Add user cards
        Hand handHelper = new Hand();
        playerCards = handHelper.getPlayerHand();
        dealerCards = handHelper.getDealerHand();

    }

    public class Board extends JPanel{

        public void paintComponent(Graphics g){
            int count = 1;
            g.setColor(backgroundColor);
            g.fillRect(0, 0, 900, 900);

            //Dealer Grid
            g.setColor(cardAreaColor);
            g.fillRect(gridX,gridY,gridW, gridH);
            //Player Grid
            g.fillRect(gridX, gridY + 450, gridW, gridH);

            //Dealer Card areas drawn
            g.setColor(Color.BLACK);
            for(int i = 1; i < 7; i++){
                g.drawRect(cardGridX + cardGridW + i * spacing, cardGridY , cardGridW, cardGridH);
            }

            //Player Card areas drawn
            for(int i = 1; i < 7; i++){
                g.drawRect(cardGridX + cardGridW + i * spacing, cardGridY * 6 , cardGridW, cardGridH);
            }

            //Drawing player cards
            for(Card c : playerCards){
                playerCards = handHelper.getPlayerHand();
                g.setColor(Color.WHITE);
                g.fillRect(cardGridX + cardGridW + count * spacing, cardGridY * 6 , cardGridW, cardGridH);
                g.drawString(String.valueOf(playerCards.get(count).getCardValue()), cardGridX + cardGridW + count * spacing, cardGridY * 6);
                count++;
            }
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


