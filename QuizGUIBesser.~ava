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

public class QuizGUIBesser extends JFrame {
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
  int punkte;
  
  List<String> quiz;
  
  
  
  // end attributes
  
  public QuizGUIBesser() {
    // Frame init
    super();
    quiz = new List<String>();
    quiz.append("Ja?");
    quiz.append("Wie alt ist Jan Balzer?");
    quiz.toFirst();
    
    tFrage.setText(quiz.getContent());
    quiz.next();
    antwort = quiz.getContent();
    
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
    quiz.next();
    tFrage.setText(quiz.getContent());
    i++;
    quiz.next();
    antwort=quiz.getContent();
    i++;
  }
  
  public void bPrevious(){
    resetColor();
    quiz.toFirst();
    i=a;
    a=a-1;
    while (a!=1) { 
      quiz.next();
      i--;
    } // end of while 
    tFrage.setText(quiz.getContent());
    a=0;
    while (i!=1) { 
      quiz.next();
      i--;
    } // end of while 
    antwort=quiz.getContent();
    i=0;
    
    
  }
  
  public void bCheck(){
    if (tAntwort.getText().equalsIgnoreCase(antwort)) {
      bBar.setBackground(new Color(0x8ac926));
      punkte=punkte+1;
      //nPunkte.setText(punkte);
     } else {
      bBar.setBackground(new Color(0xff595e));
      //if (punkte!=0){
        //punkte=punkte-1;
      //}
      //nPunkte.setText(punkte);
    }
  }
   
  public void resetColor() {
    bBar.setBackground(new Color(0xF7F7F7));
  }
  
  
} // end of class QuizGUI
