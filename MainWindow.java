import java.io.*;
import javax.swing.*;

public class MainWindow {
  
    public static void main(String[] args){

        JFrame mainFrame = new JFrame();

        JButton newButton = new JButton("Hello World!");

        newButton.setBounds(200,200,200,200);

        mainFrame.add(newButton);
        mainFrame.setSize(500, 600);

        mainFrame.setLayout(null);

        mainFrame.setVisible(true);

    }

}
