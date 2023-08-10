
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class BlackjackMain implements Runnable {

    BlackjackGUI gui = new BlackjackGUI();
    public static void main(String[] args){

        new Thread(new BlackjackMain()).start();
        Blackjack bj = new Blackjack();

        bj.startGame();
    }


    @Override
    public void run() {
        while(true){
            gui.repaint();
        }
    }

    /**
    public class BlackjackGUI {


        //int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //  JOptionPane.showMessageDialog(null, "You are " + age + " years old.");
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("START");
        button.addActionListener(this);
        JLabel label = new JLabel("Number of clicks: 0");

        panel.setBorder(BorderFactory.createEmptyBorder(300, 300, 300, 300));
        panel.setLayout(new GridLayout());
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bambino's Blackjack");
        frame.pack();
        frame.setVisible(true);

    }
     */

}
