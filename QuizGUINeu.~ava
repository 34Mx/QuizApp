import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Description
 *
 * @version 1.0 from 14.03.2024
 * @author 
 */

public class QuizGUINeu extends JFrame {
  // start attributes
  private JTextField tFrage = new JTextField();
  private JButton bPrevious = new JButton();
  private JButton bNext = new JButton();
  private JTextField tAntwort = new JTextField();
  private JButton bCheck = new JButton();
  private JButton bBar = new JButton();
  private JNumberField nPunkte = new JNumberField();
  private JLabel lPunkte1 = new JLabel();
  // end attributes
  
  public QuizGUINeu() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 941; 
    int frameHeight = 661;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("QuizGUINeu");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    cp.setBackground(new Color(0xF7F7F7));
    // start components
    
    tFrage.setBounds(240, 80, 432, 40);
    tFrage.setEditable(false);
    cp.add(tFrage);
    bPrevious.setBounds(200, 80, 40, 40);
    bPrevious.setText("<");
    bPrevious.setMargin(new Insets(2, 2, 2, 2));
    bPrevious.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPrevious_ActionPerformed(evt);
      }
    });
    bPrevious.setBackground(new Color(0xFCA311));
    bPrevious.setForeground(new Color(0xF7F7F7));
    bPrevious.setFocusable(false);
    cp.add(bPrevious);
    bNext.setBounds(672, 80, 40, 40);
    bNext.setText(">");
    bNext.setMargin(new Insets(2, 2, 2, 2));
    bNext.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bNext_ActionPerformed(evt);
      }
    });
    bNext.setBackground(new Color(0x3A86FF));
    bNext.setForeground(new Color(0xF7F7F7));
    bNext.setFocusable(false);
    cp.add(bNext);
    tAntwort.setBounds(240, 176, 392, 40);
    cp.add(tAntwort);
    bCheck.setBounds(632, 176, 40, 40);
    bCheck.setText("?");
    bCheck.setMargin(new Insets(2, 2, 2, 2));
    bCheck.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bCheck_ActionPerformed(evt);
      }
    });
    bCheck.setBackground(new Color(0x8AC926));
    bCheck.setForeground(new Color(0xF7F7F7));
    cp.add(bCheck);
    bBar.setBounds(0, 0, 32, 616);
    bBar.setText("");
    bBar.setMargin(new Insets(2, 2, 2, 2));
    bBar.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBar_ActionPerformed(evt);
      }
    });
    bBar.setEnabled(false);
    bBar.setBackground(new Color(0xF7F7F7));
    cp.add(bBar);
    nPunkte.setBounds(832, 552, 48, 40);
    nPunkte.setEditable(false);
    cp.add(nPunkte);
    lPunkte1.setBounds(832, 528, 48, 24);
    lPunkte1.setText("Punkte");
    lPunkte1.setHorizontalTextPosition(SwingConstants.CENTER);
    lPunkte1.setHorizontalAlignment(SwingConstants.CENTER);
    cp.add(lPunkte1);
    // end components
    
    setVisible(true);
  } // end of public QuizGUINeu
  
  // start methods
  
  public static void main(String[] args) {
    new QuizGUINeu();
  } // end of main
  
  public void bPrevious_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bPrevious_ActionPerformed

  public void bNext_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bNext_ActionPerformed

  public void bCheck_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bCheck_ActionPerformed

  public void bBar_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    
  } // end of bBar_ActionPerformed

  // end methods
} // end of class QuizGUINeu
