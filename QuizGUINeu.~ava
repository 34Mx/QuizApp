import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;

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
  private JButton bNext = new JButton();
  private JTextField tAntwort = new JTextField();
  private JButton bCheck = new JButton();
  private JButton bBar = new JButton();
  private JNumberField nPunkte = new JNumberField();
  private JLabel lPunkte1 = new JLabel();
  private JLabel lTipp = new JLabel();
  private JButton bTipp = new JButton();
  private JTextField tTipp = new JTextField();
  // end attributes
  int quizIndex = 0;
  
  int punkte = 0;
  int tipps = 0;
  
  List<Frage> quiz;
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
    
    tFrage.setBounds(240, 80, 392, 40);
    tFrage.setEditable(false);
    cp.add(tFrage);
    bNext.setBounds(632, 80, 40, 40);
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
    bCheck.setBackground(new Color(0x6A4C93));
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
    lTipp.setBounds(184, 312, 112, 40);
    lTipp.setText("Tipp gefällig? (2P)");
    lTipp.setVerticalAlignment(SwingConstants.CENTER);
    lTipp.setVerticalTextPosition(SwingConstants.CENTER);
    cp.add(lTipp);
    bTipp.setBounds(296, 312, 40, 40);
    bTipp.setText("***");
    bTipp.setMargin(new Insets(2, 2, 2, 2));
    bTipp.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bTipp_ActionPerformed(evt);
      }
    });
    bTipp.setBackground(new Color(0xA7C957));               
    bTipp.setFont(new Font("Moon", Font.BOLD, 20));
    bTipp.setForeground(new Color(0x386641));
    cp.add(bTipp);
    tTipp.setBounds(176, 352, 312, 40);
    tTipp.setEditable(false);
    cp.add(tTipp);
    // end components
    quiz = new List<Frage>();
    quiz.append(new Frage("Wie alt ist Jan Balzer?", "17", "2 * 9 - 1"));
    quiz.append(new Frage("Wie macht die Kuh?", "Muh", "Es reimt sich auf Kuh..."));
    quiz.append(new Frage("Wo liegt der höchste Berg Europas?", "Frankreich", "Er heißt Mont Blanc."));
    quiz.append(new Frage("Wer ist aktuell Fußball-Weltmeister?", "Argentinien", "Messi kommt aus diesem Land."));
    quiz.append(new Frage("Welcher ist der größte Planet im Sonnensystem?", "Jupiter", "Er fängt mit J an."));
    quiz.append(new Frage("Welcher Buchstabe kommt im Alphabet nach T?", "U", "Es ist nicht A."));
    
    quiz.toFirst();
    
    
    tFrage.setText(quiz.getContent().getFrage());
    
    setVisible(true);
  } // end of public QuizGUINeu
  
  // start methods
  
  public static void main(String[] args) {
    new QuizGUINeu();
  } // end of main
  
  public void bPrevious_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bPrevious();
  } // end of bPrevious_ActionPerformed

  public void bNext_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    setRandom();
  } // end of bNext_ActionPerformed

  public void bCheck_ActionPerformed(ActionEvent evt) {
    // TODO add your code here
    bCheck();
  } // end of bCheck_ActionPerformed

  public void bBar_ActionPerformed(ActionEvent evt) {
    
    
  }
  
  public void bNext(){
    resetColor();
    quiz.next();
    if (quiz.getContent()!=null){
      tFrage.setText(quiz.getContent().getFrage());
      tTipp.setText("");
      tAntwort.setText("");
      quizIndex++; 
    }
    
    else{
      tAntwort.setText("");
      tAntwort.setText("Bitte schließ das Quiz nun und starte es für die nächste Person neu :^)");
      tFrage.setText("Danke fürs Spielen! Du hast " + punkte + " Punkte erreicht und " + tipps + " Tipps gebraucht!");
    }   
  }
  
  public void setRandom() {
    Random rndm = new Random();
    int randomIndex = rndm.nextInt(6);
    quizIndex = randomIndex;
    quiz.toFirst();
    
    for (int i = 0; i < quizIndex; i++) {
      quiz.next();
    }
    
    tFrage.setText(quiz.getContent().getFrage());
    
    tTipp.setText("");
    tAntwort.setText("");
  }
  
  public void bPrevious(){
    resetColor();
    quiz.toFirst();
    
    if (quizIndex == 0) return;
    
    quizIndex--;
    for (int i = 0; i < quizIndex; i++) {
      quiz.next();
    }
    tFrage.setText(quiz.getContent().getFrage());
    
    tTipp.setText("");
    tAntwort.setText("");
  }
  
  public void bCheck(){
    if (tAntwort.getText().equalsIgnoreCase(quiz.getContent().getLoesung())) {
      bBar.setBackground(new Color(0x8ac926));
      punkte=punkte+1;
      setRandom();
    } else {
      bBar.setBackground(new Color(0xff595e));
      if (punkte!=0){
        punkte=punkte-1;
      }
    }
    nPunkte.setInt(punkte);
  }
  
  public void bTipp(){
    if(punkte>=2){
      tTipp.setText(quiz.getContent().getTipp());
      punkte -= 2;
      nPunkte.setInt(punkte);
      tipps++;
    }
    else{
      tTipp.setText("Nicht genug Punkte!");
    }
  }
  
  public void resetColor() {
    bBar.setBackground(new Color(0xF7F7F7));
  }
  public void bTipp_ActionPerformed(ActionEvent evt) {
    bTipp();
    
  } // end of bTipp_ActionPerformed
  
  // end methods
} // end of class QuizGUINeu