import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.*;

public class FalloutFrame extends JFrame{

    JButton falloutButton;

    FalloutFrame(){
        this.setTitle("Fallout Explorer");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Exit out application (Default = Hide)
        this.setSize(500, 600); //Set x and y dimension of frame
        this.setLayout(null);

        JPanel falloutPanel = new JPanel();
        falloutPanel.setBackground(Color.darkGray);
        falloutPanel.setBounds(0, 0, 500, 250);
        falloutPanel.setLayout(null);
    
        JLabel falloutLable = new JLabel();
        falloutLable.setText("Learn to code");
        falloutLable.setHorizontalAlignment(JLabel.CENTER);
        falloutLable.setVerticalAlignment(JLabel.TOP);
        falloutLable.setForeground(new Color(120,30,50)); //Font color
        falloutLable.setBounds(0,0, 250, 250);
        
        falloutButton = new JButton();
        falloutButton.setBounds(50,100,250,50);
        falloutButton.addActionListener(e -> System.out.println("Some say the end is near"));
        falloutButton.setText("Tool Reference?!");
        falloutButton.setFocusable(false);
        //Set font and color methods

        this.setVisible(true); //Make frame visible
        this.add(falloutLable);
        this.add(falloutPanel);
        falloutPanel.add(falloutButton);
    }

}