import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.util.Random;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showMessageDialog;

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
  private JNumberField nPunkte = new JNumberField();
  private JLabel lPunkte1 = new JLabel();
  private JLabel lTipp = new JLabel();
  private JButton bTipp = new JButton();
  private JTextField tTipp = new JTextField();
  private JButton bAntwort0 = new JButton();
  private JButton bAntwort1 = new JButton();
  private JButton bAntwort2 = new JButton();
  private JButton bAntwort3 = new JButton();
  private ArrayList<Integer> usedNums = new ArrayList<Integer>();
  private boolean tippUsed = false;
  private int fragenSize;
  private int quizIndex = 0;
  private boolean buttonsClickable = true;
  
  int punkte = 0;
  int tipps = 0;
  
  List<Frage> quiz;
  private JButton b5050 = new JButton();
  private JButton bPub = new JButton();
  private JLabel lHeader = new JLabel();
  private JLabel lFinished = new JLabel();
  private JLabel lReachedPointsFollowing = new JLabel();
  private JLabel lEndPoints = new JLabel();
  private JButton bRestart = new JButton();
  // end attributes
  public QuizGUINeu() { 
    // Frame init
    super();
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    int frameWidth = 1082; 
    int frameHeight = 641;
    setSize(frameWidth, frameHeight);
    Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
    int x = (d.width - getSize().width) / 2;
    int y = (d.height - getSize().height) / 2;
    setLocation(x, y);
    setTitle("QuizGUINeu");
    // ______________________________________________
    //setExtendedState(JFrame.MAXIMIZED_BOTH); 
    setUndecorated(true);
    //setVisible(true);
    // ______________________________________________
    setResizable(false);
    Container cp = getContentPane();
    cp.setLayout(null);
    cp.setBackground(new Color(0x221B6F));
    
    lFinished.setBounds(0, 184, 1088, 41);
    lFinished.setText("Das spiel ist vorbei!");
    lFinished.setFont(new Font("Alegreya SC", Font.BOLD, 25));
    lFinished.setForeground(new Color(0xF7F7F7));
    lFinished.setHorizontalAlignment(SwingConstants.CENTER);
    lFinished.setHorizontalTextPosition(SwingConstants.CENTER);
    
    lReachedPointsFollowing.setBounds(464, 224, 164, 33);
    lReachedPointsFollowing.setText("Du hast erreicht:");
    lReachedPointsFollowing.setFont(new Font("Alegreya SC", Font.BOLD, 20));
    lReachedPointsFollowing.setForeground(new Color(0xF7F7F7));
    
    lEndPoints.setBounds(456, 288, 179, 92);
    lEndPoints.setText("25/25 P");
    lEndPoints.setFont(new Font("Alegreya SC", Font.BOLD, 60));
    lEndPoints.setForeground(new Color(0xF7F7F7));
    lFinished.setVisible(false);
    cp.add(lFinished);
    lReachedPointsFollowing.setVisible(false);
    cp.add(lReachedPointsFollowing);
    lEndPoints.setVisible(false);
    cp.add(lEndPoints);
    
    
    bRestart.setBounds(480, 512, 120, 48);
    bRestart.setText("Neustarten");
    bRestart.setMargin(new Insets(2, 2, 2, 2));
    bRestart.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bRestart_ActionPerformed(evt);
      }
    });
    bRestart.setBackground(new Color(0xB58AE4));
    bRestart.setForeground(new Color(0xF7F7F7));
    bRestart.setBorder(new javax.swing.border.LineBorder(new Color(0x323d83), 2, true));
    bRestart.setVisible(false);
    bRestart.setFocusable(false);
    bRestart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    cp.add(bRestart);
    
    
    // start components
    b5050.setBounds(64, 184, 40, 40);
    b5050.setText("50");
    b5050.setMargin(new Insets(2, 2, 2, 2));
    b5050.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        b5050_ActionPerformed(evt);
      }
    });
    b5050.setHorizontalAlignment(SwingConstants.CENTER);
    b5050.setVerticalAlignment(SwingConstants.CENTER);
    b5050.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    b5050.setBackground(new Color(0x3A86FF));
    b5050.setFont(new Font("Alegreya SC", Font.BOLD, 20));
    b5050.setForeground(new Color(0xF7F7F7));
    b5050.setFocusable(false);
    b5050.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 0));
    cp.add(b5050);
    bPub.setBounds(64, 240, 40, 40);
    bPub.setText("%");
    bPub.setMargin(new Insets(2, 2, 2, 2));
    bPub.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bPub_ActionPerformed(evt);
      }
    });
    bPub.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    bPub.setBackground(new Color(0x3A86FF));
    bPub.setFont(new Font("Alegreya SC", Font.BOLD, 20));
    bPub.setForeground(new Color(0xF7F7F7));
    bPub.setFocusable(false);
    bPub.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 0));
    cp.add(bPub);
    lHeader.setBounds(16, 40, 1040, 63);
    lHeader.setText("Wer wird Informatiker?");
    lHeader.setHorizontalAlignment(SwingConstants.CENTER);
    lHeader.setHorizontalTextPosition(SwingConstants.CENTER);
    lHeader.setFont(new Font("Alegreya SC", Font.BOLD, 40));
    lHeader.setForeground(new Color(0xF7F7F7));
    cp.add(lHeader);
    
    
    // end components
    
    cp.setBackground(new Color(0x221B6F));
    
    tFrage.setBounds(256, 128, 560, 56);
    tFrage.setEditable(false);
    tFrage.setHorizontalAlignment(SwingConstants.CENTER);
    tFrage.setFont(new Font("Alegreya SC", Font.PLAIN, 14));
    tFrage.setBorder(new javax.swing.border.LineBorder(new Color(0xf7f7f7), 2, true));
    tFrage.setBackground(new Color(0x7F66D2));
    tFrage.setForeground(new Color(0xF7F7F7));
    tFrage.setFont(new Font("Alegreya SC", Font.PLAIN, 18));
    tFrage.setForeground(new Color(0xF7F7F7));
    cp.add(tFrage);
    bNext.setBounds(824, 128, 56, 56);
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
    bNext.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    cp.add(bNext);
    nPunkte.setBounds(1024, 568, 48, 40);
    nPunkte.setEditable(false);
    nPunkte.setBackground(new Color(0x221B6F));
    nPunkte.setFont(new Font("Alegreya SC", Font.PLAIN, 12));
    nPunkte.setForeground(new Color(0xF7F7F7));
    nPunkte.setInt(0);
    nPunkte.setFont(new Font("Alegreya SC", Font.PLAIN, 20));
    nPunkte.setHorizontalAlignment(SwingConstants.RIGHT);
    nPunkte.setHorizontalAlignment(SwingConstants.CENTER);
    nPunkte.setBorder(new javax.swing.border.LineBorder(new Color(0x323d83), 2, true));
    nPunkte.setBackground(new Color(0x7F66D2));
    nPunkte.setFocusable(false);
    cp.add(nPunkte);
    lPunkte1.setBounds(960, 568, 58, 40);
    lPunkte1.setText("Punkte");
    lPunkte1.setHorizontalTextPosition(SwingConstants.CENTER);
    lPunkte1.setHorizontalAlignment(SwingConstants.CENTER);
    lPunkte1.setForeground(new Color(0xF7F7F7));
    lPunkte1.setFont(new Font("Alegreya SC", Font.BOLD, 12));
    lPunkte1.setFont(new Font("Alegreya SC", Font.BOLD, 15));
    lPunkte1.setForeground(new Color(0xF7F7F7));
    lPunkte1.setText("Punkte:");
    cp.add(lPunkte1);
    lTipp.setBounds(8, 528, 312, 40);
    lTipp.setText("Tipp gefällig? (2P)");
    lTipp.setVerticalAlignment(SwingConstants.CENTER);
    lTipp.setVerticalTextPosition(SwingConstants.CENTER);
    lTipp.setForeground(new Color(0xF7F7F7));
    lTipp.setHorizontalAlignment(SwingConstants.RIGHT);
    lTipp.setHorizontalAlignment(SwingConstants.CENTER);
    lTipp.setHorizontalTextPosition(SwingConstants.CENTER);
    lTipp.setHorizontalTextPosition(SwingConstants.LEFT);
    lTipp.setHorizontalTextPosition(SwingConstants.RIGHT);
    lTipp.setHorizontalTextPosition(SwingConstants.CENTER);
    lTipp.setFont(new Font("Alegreya SC", Font.BOLD, 12));
    lTipp.setForeground(new Color(0xF7F7F7));
    lTipp.setFont(new Font("Alegreya SC", Font.BOLD, 20));
    lTipp.setForeground(new Color(0xF7F7F7));
    lTipp.setFont(new Font("Alegreya SC", Font.BOLD, 15));
    lTipp.setForeground(new Color(0xF7F7F7));
    cp.add(lTipp);
    bTipp.setBounds(64, 128, 40, 41);
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
    bTipp.setText("?");
    bTipp.setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
    bTipp.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    bTipp.setBackground(new Color(0x86A6F3));
    bTipp.setFont(new Font("Alegreya SC", Font.BOLD, 20));
    bTipp.setForeground(new Color(0xF7F7F7));
    bTipp.setForeground(Color.BLACK);
    bTipp.setForeground(new Color(0xB58AE4));
    bTipp.setForeground(new Color(0x241B6F));
    bTipp.setFont(new Font("Alegreya SC", Font.BOLD, 25));
    bTipp.setFocusable(false);
    bTipp.setForeground(new Color(0xF7F7F7));
    bTipp.setBackground(new Color(0x3A86FF));
    bTipp.setBorder(new javax.swing.border.LineBorder(Color.BLACK, 0));
    cp.add(bTipp);
    tTipp.setBounds(8, 568, 312, 40);
    tTipp.setEditable(false);
    tTipp.setHorizontalAlignment(SwingConstants.CENTER);
    tTipp.setBackground(new Color(0x7F66D2));
    tTipp.setBorder(new javax.swing.border.LineBorder(new Color(0x323d83), 2, true));
    tTipp.setFocusable(false);
    tTipp.setForeground(new Color(0xF7F7F7));
    cp.add(tTipp);
    bAntwort0.setBounds(328, 280, 200, 56);
    bAntwort0.setText("Antwort0");
    bAntwort0.setMargin(new Insets(2, 2, 2, 2));
    bAntwort0.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAntwort0_ActionPerformed(evt);
      }
    });
    bAntwort0.setBackground(new Color(0xEAEAEA));
    bAntwort0.setFocusable(false);
    bAntwort0.setBackground(new Color(0xB289DE));
    bAntwort0.setForeground(new Color(0xF7F7F7));
    bAntwort0.setBackground(new Color(0x7F66D2));
    bAntwort0.setBorder(new javax.swing.border.LineBorder(new Color(0xf7f7f7), 2, true));
    
    bAntwort0.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    bAntwort0.setFont(new Font("Alegreya SC", Font.BOLD, 12));
    bAntwort0.setForeground(new Color(0xF7F7F7));
    bAntwort0.setFont(new Font("Alegreya SC", Font.BOLD, 15));
    bAntwort0.setForeground(new Color(0xF7F7F7));
    cp.add(bAntwort0);
    bAntwort1.setBounds(544, 280, 200, 56);
    bAntwort1.setText("Antwort2");
    bAntwort1.setMargin(new Insets(2, 2, 2, 2));
    bAntwort1.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAntwort1_ActionPerformed(evt);
      }
    });
    bAntwort1.setBackground(new Color(0xEAEAEA));
    bAntwort1.setFocusable(false);
    bAntwort1.setBackground(new Color(0xB289DE));
    bAntwort1.setForeground(new Color(0xF7F7F7));
    bAntwort1.setBackground(new Color(0x7F66D2));
    bAntwort1.setBorder(new javax.swing.border.LineBorder(new Color(0xf7f7f7), 2, true));
    bAntwort1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    bAntwort1.setFont(new Font("Alegreya SC", Font.BOLD, 12));
    bAntwort1.setForeground(new Color(0xF7F7F7));
    bAntwort1.setFont(new Font("Alegreya SC", Font.BOLD, 15));
    bAntwort1.setForeground(new Color(0xF7F7F7));
    cp.add(bAntwort1);
    bAntwort2.setBounds(328, 344, 200, 56);
    bAntwort2.setText("Antwort3");
    bAntwort2.setMargin(new Insets(2, 2, 2, 2));
    bAntwort2.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAntwort2_ActionPerformed(evt);
      }
    });
    bAntwort2.setBackground(new Color(0xEAEAEA));
    bAntwort2.setFocusable(false);
    bAntwort2.setBackground(new Color(0xB289DE));
    bAntwort2.setForeground(new Color(0xF7F7F7));
    bAntwort2.setBackground(new Color(0x7F66D2));
    bAntwort2.setBorder(new javax.swing.border.LineBorder(new Color(0xf7f7f7), 2, true));
    bAntwort2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    bAntwort2.setFont(new Font("Alegreya SC", Font.BOLD, 12));
    bAntwort2.setForeground(new Color(0xF7F7F7));
    bAntwort2.setFont(new Font("Alegreya SC", Font.BOLD, 15));
    bAntwort2.setForeground(new Color(0xF7F7F7));
    cp.add(bAntwort2);
    bAntwort3.setBounds(544, 344, 200, 56);
    bAntwort3.setText("Antwort4");
    bAntwort3.setMargin(new Insets(2, 2, 2, 2));
    bAntwort3.addActionListener(new ActionListener() { 
      public void actionPerformed(ActionEvent evt) { 
        bAntwort3_ActionPerformed(evt);
      }
    });
    bAntwort3.setFocusable(false);
    bAntwort3.setForeground(new Color(0xF7F7F7));
    bAntwort3.setBackground(new Color(0x7F66D2));
    bAntwort3.setBorder(new javax.swing.border.LineBorder(new Color(0xf7f7f7), 2, true));
    bAntwort3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    bAntwort3.setFont(new Font("Alegreya SC", Font.BOLD, 12));
    bAntwort3.setForeground(new Color(0xF7F7F7));
    bAntwort3.setFont(new Font("Alegreya SC", Font.BOLD, 15));
    bAntwort3.setForeground(new Color(0xF7F7F7));
    cp.add(bAntwort3);
    
    
    
    quiz = new List<Frage>();
    quiz.append(new Frage("Wie alt ist Jan Balzer?", new String[]{"16", "17", "18", "19"}, 1, "2 * 9 - 1"));
    quiz.append(new Frage("Wie macht die Kuh?", new String[]{"Miau", "Bääh", "AAAAH", "Muh"}, 3, "Es reimt sich auf Kuh..."));
    quiz.append(new Frage("Wo liegt der höchste Berg Europas?", new String[]{"Spanien", "Frankreich", "Schweiz", "Deutschland"}, 1, "Er heißt Mont Blanc."));
    quiz.append(new Frage("Wer ist aktuell Fußball-Weltmeister?", new String[]{"Argentinien", "Brasilien", "Spanien", "Mexico"}, 0, "Messi kommt aus diesem Land."));
    quiz.append(new Frage("Welcher ist der größte Planet im Sonnensystem?", new String[]{"Merkur", "Jupiter", "Erde", "Mond"}, 1, "Er fängt mit J an."));
    quiz.append(new Frage("Welcher Buchstabe kommt im Alphabet nach T?", new String[]{"X", "S", "U", "P"}, 2, "Es ist nicht A."));
    quiz.append(new Frage("Was ist die Hauptstadt von Frankreich?", new String[]{"Berlin", "Rom", "Paris", "Madrid"}, 2, "Den Eiffelturm finden Sie hier."));
    quiz.append(new Frage("Wie viele Planeten hat unser Sonnensystem?", new String[]{"7", "8", "9", "10"}, 1, "Pluto wurde degradiert."));
    quiz.append(new Frage("Was ist die Hauptstadt von Spanien?", new String[]{"Berlin", "Rom", "Paris", "Madrid"}, 3, "Hier gibt es leckere Tapas."));
    quiz.append(new Frage("Wie nennt man die kleinste Einheit von digitalen Informationen?", new String[]{"Byte", "Bit", "Kilobyte", "Megabyte"}, 1, "Es ist ein kleiner 'Biss'."));
    quiz.append(new Frage("Was ist die Hauptstadt von Italien?", new String[]{"Berlin", "Rom", "Paris", "Madrid"}, 1, "Hier gibt es tolles Eis."));
    quiz.append(new Frage("Wie lautet die chemische Formel für Wasser?", new String[]{"H2O", "CO2", "NaCl", "O2"}, 0, "Besteht aus 2 Wasserstoffatomen und einem Sauerstoffatom."));
    quiz.append(new Frage("Was ist die Hauptstadt von Deutschland?", new String[]{"Berlin", "Rom", "Paris", "Madrid"}, 0, "Hier steht das Brandenburger Tor."));
    quiz.append(new Frage("Wie nennt man eine Gruppe von Wölfen?", new String[]{"Schwarm", "Herde", "Rudel", "Flocke"}, 2, "Leben in einem Rudel."));
    quiz.append(new Frage("Wie heißt die Hauptstadt von Russland?", new String[]{"Berlin", "Rom", "Paris", "Moskau"}, 3, "Roter Platz zu finden."));
    quiz.append(new Frage("Wie nennt man die äußerste Schicht der Erde?", new String[]{"Mantel", "Kern", "Kruste", "Kernfusion"}, 2, "Oft Teil von Kontinenten."));
    quiz.append(new Frage("Wie viele Stunden hat ein Tag?", new String[]{"12", "24", "36", "48"}, 1, "Ist jetzt nicht dein Ernst, oder?"));
    quiz.append(new Frage("Was ist die Hauptstadt von Japan?", new String[]{"Berlin", "Rom", "Paris", "Tokio"}, 3, "Hier gibt es Sushi."));
    quiz.append(new Frage("Wie nennt man eine Gruppe von Fischen?", new String[]{"Schwarm", "Herde", "Rudel", "Flocke"}, 0, "Schwimmen in einem Schwarm."));
    quiz.append(new Frage("Wie heißt die Hauptstadt von China?", new String[]{"Peking", "Shanghai", "Hongkong", "Taipei"}, 0, "Hier steht die Verbotene Stadt."));
    quiz.append(new Frage("Was ist die Hauptstadt von Kanada?", new String[]{"Berlin", "Toronto", "Ottawa", "Vancouver"}, 2, "Liegt am Ottawa River."));
    quiz.append(new Frage("Wie nennt man die Zahl Pi?", new String[]{"3.14", "2.71", "1.62", "4.29"}, 0, "Die Kreiszahl."));
    quiz.append(new Frage("Was ist die Hauptstadt von Australien?", new String[]{"Sydney", "Melbourne", "Perth", "Canberra"}, 3, "Hier befindet sich das Parliament House."));
    quiz.append(new Frage("Wie nennt man eine Gruppe von Löwen?", new String[]{"Schwarm", "Herde", "Rudel", "Flocke"}, 2, "Leben in einem Rudel."));
    quiz.append(new Frage("Wie nennt man die kleinste Einheit von digitalen Informationen?", new String[]{"Byte", "Bit", "Kilobyte", "Megabyte"}, 1, "Ist ein kleiner 'Biss'."));
    
    
    fragenSize = 25;
    setRandom();
    
    
    tFrage.setText(quiz.getContent().getFrage());
    enableButtons(true);
    showAntworten();
    
    setVisible(true);
  } // end of public QuizGUINeu
  
  
  // start methods
  public static void main(String[] args) {
    new QuizGUINeu();
  }

  public void bNext_ActionPerformed(ActionEvent evt) {
    enableButtons(true);
    resetColor();
    setRandom();
  }
  
  public void setRandom() {
    Random rndm = new Random();
    int randomIndex = rndm.nextInt(fragenSize);
    while (usedNums.contains(randomIndex)) {
      if (usedNums.size() == fragenSize) {
        lEndPoints.setText(punkte + "/25 P");
        showGUI(false);
        showEndMessage(true);
 
        return;
      }
      randomIndex = rndm.nextInt(fragenSize);
    }
    usedNums.add(randomIndex);
    quizIndex = randomIndex;
    quiz.toFirst();
    
    for (int i = 0; i < quizIndex; i++) {
      quiz.next();
    }
    
    tFrage.setText(quiz.getContent().getFrage());
    
    tTipp.setText("");
    showAntworten();
  }
  
  public void showAntworten() {
    bAntwort0.setText("A: " + quiz.getContent().getAntworten()[0]);
    bAntwort1.setText("B: " + quiz.getContent().getAntworten()[1]);
    bAntwort2.setText("C: " + quiz.getContent().getAntworten()[2]);
    bAntwort3.setText("D: " + quiz.getContent().getAntworten()[3]);
  }
  
  public JButton getButtonByIndex(int index) {
    switch (index) {
      case 0: 
        return bAntwort0;
      case 1: 
        return bAntwort1;
      case 2: 
        return bAntwort2;
      case 3: 
        return bAntwort3;
      default:
        return null;
    }
  }
  
  public void answerReveal(int userIndex) {
    int rightIndex = quiz.getContent().getLoesung();
    for (int i = 0; i < 4; i++) {
      getButtonByIndex(i).setBackground(new Color(0x7343a7));
    }
    if (userIndex != rightIndex) getButtonByIndex(userIndex).setBackground(new Color(0xff595e));
    getButtonByIndex(rightIndex).setBackground(new Color(0x8ac926));
  }
  
  public void showEndMessage(boolean state) {
    lFinished.setVisible(state);
    lReachedPointsFollowing.setVisible(state);
    lEndPoints.setVisible(state);
    bRestart.setVisible(state);
  }
  
  public void showGUI(boolean state) {
    tFrage.setVisible(state);
    bNext.setVisible(state);
    bAntwort0.setVisible(state);
    bAntwort1.setVisible(state);
    bAntwort2.setVisible(state);
    bAntwort3.setVisible(state);
    bTipp.setVisible(state);
    b5050.setVisible(state);
    bPub.setVisible(state);
    lTipp.setVisible(state);
    tTipp.setVisible(state);
    lPunkte1.setVisible(state);
    nPunkte.setVisible(state);
  }
  
  public void bCheck(int index){
    enableButtons(false);
    answerReveal(index);
    if (index == quiz.getContent().getLoesung()) {
      punkte=punkte+1;
    } else {
      if (punkte!=0){
        punkte=punkte-1;
      }
    }
    nPunkte.setInt(punkte);
  }
  
  public void enableButtons(boolean state) {
    //for (int i = 0; i < 4; i++) { getButtonByIndex(i).setEnabled(state); }
    //bTipp.setEnabled(state);
    //b5050.setEnabled(state);
    //bPub.setEnabled(state);
    buttonsClickable = state;
    bNext.setVisible(!state);
  }
  
  public void bTipp(){
    if(punkte>=2){
      tTipp.setText(quiz.getContent().getTipp());
      punkte -= 2;
      nPunkte.setInt(punkte);
      tipps++;
      bTipp.setEnabled(false);
    }
    else{
      tTipp.setText("Nicht genug Punkte!");
    }
  }
  
  public void resetColor() {
    bTipp.setEnabled(true);
    for (int i = 0; i < 4; i++) {
      getButtonByIndex(i).setBackground(new Color(0x7f66d2));
      getButtonByIndex(i).setVisible(true);
    }
  }
  
  
  
  
  
  public void fiftyFifty() {
    int rightIndex = quiz.getContent().getLoesung();
    Random rndm = new Random();
    int randomIndex = 0;
    
    do {
      randomIndex = rndm.nextInt(4);
    } while (rightIndex == randomIndex);
    
    for(int i = 0; i < 4; i++) {
      if (i != rightIndex && i != randomIndex) getButtonByIndex(i).setVisible(false);
    }
    
    b5050.setVisible(false);
  }
  
  
  public void pub() {
    int rightQuote, wrongQuote1, wrongQuote2, wrongQuote3;
    rightQuote = generateRandomNumber(60, 101);
    int remainingSum = 100 - rightQuote;
    wrongQuote1 = generateRandomNumber(0, remainingSum + 1);
    remainingSum -= wrongQuote1;
    wrongQuote2 = generateRandomNumber(0, remainingSum + 1);
    remainingSum -= wrongQuote2;
    wrongQuote3 = remainingSum;
    int[] wrongQuotes = new int[]{wrongQuote1, wrongQuote2, wrongQuote3};
    
    
    int rightIndex = quiz.getContent().getLoesung();
    JButton rightButton = getButtonByIndex(rightIndex);
    rightButton.setText(rightButton.getText() + " (" + rightQuote + "%)");
    
    int tmpIndex = 0;
    for (int i = 0; i < 4; i++) {
      if (i != rightIndex) {
        JButton tmpButton = getButtonByIndex(i);
        tmpButton.setText(tmpButton.getText() + " (" + wrongQuotes[tmpIndex] + "%)");
        tmpIndex++;
      }
    }
    
    bPub.setVisible(false);
  }
  
  public int generateRandomNumber(int min, int max) {
    return new Random().nextInt(max - min) + min;
  }
  
  
  
  
  
  
  
  
  public void bTipp_ActionPerformed(ActionEvent evt) {
    if (buttonsClickable) bTipp();
  }
  
  public void bAntwort0_ActionPerformed(ActionEvent evt) {
    if (buttonsClickable) bCheck(0);
  } // end of bAntwort0_ActionPerformed

  public void bAntwort1_ActionPerformed(ActionEvent evt) {
    if (buttonsClickable) bCheck(1);
  } // end of bAntwort1_ActionPerformed

  public void bAntwort2_ActionPerformed(ActionEvent evt) {
    if (buttonsClickable) bCheck(2);
  } // end of bAntwort2_ActionPerformed

  public void bAntwort3_ActionPerformed(ActionEvent evt) {
    if (buttonsClickable) bCheck(3);
  }
  public void b5050_ActionPerformed(ActionEvent evt) {
    if (buttonsClickable) fiftyFifty();
  }

  public void bPub_ActionPerformed(ActionEvent evt) {
    if (buttonsClickable) pub();
  } // end of bPub_ActionPerformed



  public void bRestart_ActionPerformed(ActionEvent evt) {
    punkte = 0;
    tippUsed = false;
    usedNums.clear();
    showEndMessage(false);
    showGUI(true);
  } // end of bRestart_ActionPerformed

  // end methods
} // end of class QuizGUINeu