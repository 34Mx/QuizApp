import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

/**
 *
 * Description
 *
 * @version 1.0 from 11.03.2024
 * @author 
 */

public class QuizGUI extends JFrame {
  // start attributes
  private JTextField tFrage = new JTextField();
  private JButton bPrevious = new JButton();
  private JButton bNext = new JButton();
  private JTextField tAntwort = new JTextField();
  private JButton bCheck = new JButton();
  private JButton bBar = new JButton();
  int i;
  int a;
  String antwort = null;
  
  
  List<String> quiste;
  List<String> quantwort;
  
  
  // end attributes
  
  public QuizGUI() {
    // Frame init
    super();
    quiste = new List<String>();
    quiste.append("Ja?");
    quiste.append("Wie alt ist Jan Balzer?");
    quiste.toFirst();
    
    tFrage.setText(quiste.getContent());
    
    
    quantwort = new List<String>();
    quantwort.append("Nein");
    quantwort.append("17");
    quantwort.toFirst();
    antwort = quantwort.getContent();
    
    
    
    
    
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 903; 
    int frameHeight = 609;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("QuizGUI");
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    cp.setBackground(new Color(0xF7F7F7));
    // start components
    
    tFrage.setBounds(208, 96, 440, 40);
    tFrage.setEditable(false);
    cp.add(tFrage);
    bPrevious.setBounds(168, 96, 40, 40);
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
    bPrevious.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(bPrevious);
    bNext.setBounds(648, 96, 40, 40);
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
    bNext.setHorizontalTextPosition(SwingConstants.RIGHT);
    cp.add(bNext);
    tAntwort.setBounds(304, 280, 232, 40);
    cp.add(tAntwort);
    bCheck.setBounds(536, 280, 40, 40);
    bCheck.setText("?");
    bCheck.setMargin(new Insets(2, 2, 2, 2));
    bCheck.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bCheck_ActionPerformed(evt);
      }
    });
    bCheck.setBackground(new Color(0x8AC926));
    bCheck.setForeground(Color.WHITE);
    bCheck.setHorizontalTextPosition(SwingConstants.CENTER);
    cp.add(bCheck);
    bBar.setBounds(0, -8, 24, 568);
    bBar.setText("");
    bBar.setMargin(new Insets(2, 2, 2, 2));
    bBar.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bBar_ActionPerformed(evt);
      }
    });
    bBar.setBackground(new Color(0xF7F7F7));
    bBar.setEnabled(false);
    cp.add(bBar);
    // end components
    
    setVisible(true);
  } // end of public QuizGUI
  
  // start methods
  
  public static void main(String[] args) {
    new QuizGUI();
  } // end of main
  
  public void bPrevious_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bPrevious(); 
  } // end of bPrevious_ActionPerformed

  public void bNext_ActionPerformed(ActionEvent evt) {
    bNext();
  } // end of bNext_ActionPerformed

  public void bCheck_ActionPerformed(ActionEvent evt) {
    bCheck();
  } // end of bCheck_ActionPerformed

  public void bBar_ActionPerformed(ActionEvent evt) {
    
  } // end of bBar_ActionPerformed
  
  
  
  
  public void bNext(){
    resetColor();
    quiste.next();
    quantwort.next();
    i++;
    a++;
    tFrage.setText(quiste.getContent());
    antwort=quantwort.getContent();
  }
  
  public void bPrevious(){
    resetColor();
    quiste.toFirst();
    while (i-1!=1) { 
      quiste.next();
    } // end of while
    i=0;
     quantwort.toFirst();
    while (a-1!=1) { 
      quantwort.next();
    } // end of while
    a=0;
  }
  
  public void bCheck(){
    if (tAntwort.getText().equalsIgnoreCase(antwort)) {
      bBar.setBackground(new Color(0x8ac926));
    } else {
      bBar.setBackground(new Color(0xff595e));
    }
  }
  
  public void resetColor() {
    bBar.setBackground(new Color(0xF7F7F7));
  }
  
  public String getElementFragen(int index) {
    quiste.toFirst();
    for (int i = 0; i <= index; i++) {
      if (!quiste.hasAccess()) return null;
      quiste.next();
    }
    
    return quiste.getContent();
  }
  
  public String getElementAntworten(int index) {
    
  }

  
  
  

  // end methods
} // end of class QuizGUI
