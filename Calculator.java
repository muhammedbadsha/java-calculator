import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;





    public class Calculator implements ActionListener{
    // private static final String Font = null;
    boolean isOpratorClicked=false;
    String oldValue;
    JFrame jf;
    JLabel displayLabel;
    JButton sevenButton;
    JButton eightButton;
    JButton nineButton;
    JButton fourButton;
    JButton fiveButton;
    JButton sixButton;
    JButton oneButton;
    JButton twoButton;
    JButton threeButton;
    JButton zeroButton;
    JButton dotButton;
    JButton equaltoButton;
    JButton clearButton;
    JButton addingButton;
    JButton divitionButton;
    JButton substractionButton;
    JButton multiButton;

    Calculator(){
         jf=new JFrame("Calculator");
        jf.setLayout(null);
        jf.setSize(600,600);
       
        jf.setLocation(200,150 );
       
        displayLabel=new JLabel();
        displayLabel.setBounds(30, 50, 280, 30);
        displayLabel.setBackground(Color.GRAY);
        displayLabel.setOpaque(true);
        displayLabel.setHorizontalAlignment(SwingConstants.CENTER);
        displayLabel.setForeground(Color.WHITE);
        jf.add(displayLabel);

         sevenButton=new JButton("7");
       sevenButton.setBounds(30, 100, 60, 60);
        sevenButton.setFont(new Font("Ariel",Font.PLAIN,40));
       jf.add(sevenButton);
       sevenButton.addActionListener(this);


         eightButton=new JButton("8");
       eightButton.setBounds(100, 100,60,60);
       jf.add(eightButton);
       eightButton.setFont(new Font("Ariel",Font.PLAIN,40));
       eightButton.addActionListener(this);


        nineButton=new JButton("9");
       nineButton.setBounds(170, 100, 60, 60);
       jf.add(nineButton);
       nineButton.setFont(new Font("Ariel",Font.PLAIN,40));
       nineButton.addActionListener(this);


        divitionButton=new JButton("/");
       divitionButton.setBounds(240,100,60,60);
       jf.add(divitionButton);
       divitionButton.setFont(new Font("Ariel",Font.PLAIN,40));
       divitionButton.addActionListener(this);



        fourButton=new JButton("4");
        fourButton.setBounds(30,180,60,60);
        jf.add(fourButton);
        fourButton.setFont(new Font("Ariel",Font.PLAIN,40));
        fourButton.addActionListener(this);



       fiveButton=new JButton("5");
       fiveButton.setBounds(100, 180,60,60);
       jf.add(fiveButton);
       fiveButton.setFont(new Font("Ariel",Font.PLAIN,40));
       fiveButton.addActionListener(this);



       sixButton=new JButton("6");
       sixButton.setBounds(170, 180, 60, 60);
       jf.add(sixButton);
       sixButton.setFont(new Font("Ariel",Font.PLAIN,40));
       sixButton.addActionListener(this);



       substractionButton=new JButton("-");
       substractionButton.setBounds(240, 180,60,60);
       jf.add(substractionButton);
       substractionButton.setFont(new Font("Ariel",Font.PLAIN,40));
       substractionButton.addActionListener(this);



       oneButton=new JButton("1");
       oneButton.setBounds(30,260,60,60);
       jf.add(oneButton);
       oneButton.setFont(new Font("Ariel",Font.PLAIN,40));
       oneButton.addActionListener(this);


      twoButton=new JButton("2");
      twoButton.setBounds(100, 260,60,60);
      jf.add(twoButton);
      twoButton.setFont(new Font("Ariel",Font.PLAIN,40));
      twoButton.addActionListener(this);


      threeButton=new JButton("3");
      threeButton.setBounds(170, 260, 60, 60);
      jf.add(threeButton);
      threeButton.setFont(new Font("Ariel",Font.PLAIN,40));
      threeButton.addActionListener(this);


       addingButton=new JButton("+");
      addingButton.setBounds(240, 260, 60, 60);
      jf.add(addingButton);
     addingButton.setFont(new Font("Ariel",Font.PLAIN,40));
     addingButton.addActionListener(this);

      clearButton=new JButton("clear");
     clearButton.setBounds(320, 260, 120, 60);
      jf.add(clearButton);
      clearButton.setFont(new Font("Ariel",Font.PLAIN,40));
      clearButton.addActionListener(this);



     dotButton=new JButton(".");
      dotButton.setBounds(30,340,60,60);
      jf.add(dotButton);
     dotButton.setFont(new Font("Ariel",Font.PLAIN,40));
     dotButton.addActionListener(this);



     zeroButton=new JButton("0");
     zeroButton.setBounds(100, 340,60,60);
     jf.add(zeroButton);
     zeroButton.setFont(new Font("Ariel",Font.PLAIN,40));
    zeroButton.addActionListener(this);


     equaltoButton=new JButton("=");
     equaltoButton.setBounds(170, 340, 60, 60);
     jf.add(equaltoButton);
     equaltoButton.setFont(new Font("Ariel",Font.PLAIN,40));
    equaltoButton.addActionListener(this);

   
    multiButton=new JButton("*");
      multiButton.setBounds(240,340,60,60);
      jf.add(multiButton);
      multiButton.setFont(new Font("Ariel",Font.PLAIN,40));
    multiButton.addActionListener(this);

    


 

        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    

    public static void main(String[] args) {
        new Calculator();

    }
   
       
  





    @Override
    public void actionPerformed(ActionEvent e) {
   if(e.getSource()==sevenButton){
       if(isOpratorClicked){
           displayLabel.setText("7");
           isOpratorClicked=false;
       }else{
           displayLabel.setText(displayLabel.getText()+"7");
       }
   }else if(e.getSource()==eightButton){
           if(isOpratorClicked){
               displayLabel.setText("8");
               isOpratorClicked=false;

           }else{
               displayLabel.setText(displayLabel.getText()+"8");
           }
}else if(e.getSource()==equaltoButton){
   String newValue=displayLabel.getText();
   float oldValueF=Float.parseFloat(oldValue);
   float newValueF=Float.parseFloat(newValue);
   float result=oldValueF+newValueF;
   displayLabel.setText(result+"");
}else if(e.getSource()==clearButton){
    displayLabel.setText(" ");
}else if(e.getSource()==addingButton){
 
 isOpratorClicked=true; 
 oldValue=displayLabel.getText();
}


    }
}
