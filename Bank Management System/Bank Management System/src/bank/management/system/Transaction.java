package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.jar.JarEntry;

public class Transaction extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    Transaction(String pin){
        this.pin=pin;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1400,800,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,1400,800);
        add(image);

        JLabel lab1=new JLabel("Please select your transaction");
        lab1.setBounds(490,400,400,35);
        lab1.setFont(new Font("System",Font.BOLD,17));
        lab1.setForeground(Color.black);
        image.add(lab1);

        b1=new JButton("Deposit");
        b1.setForeground(Color.white);
        b1.setBackground(Color.black);
        b1.setBounds(430,450,130,20);
        b1.addActionListener(this);
        image.add(b1);

        b2=new JButton("Withdrawl");
        b2.setForeground(Color.white);
        b2.setBackground(Color.black);
        b2.setBounds(430,475,130,20);
        b2.addActionListener(this);
        image.add(b2);

        b3=new JButton("Enquiry");
        b3.setForeground(Color.white);
        b3.setBackground(Color.black);
        b3.setBounds(430,500,130,20);
        b3.addActionListener(this);
        image.add(b3);

        b4=new JButton("Statement");
        b4.setForeground(Color.white);
        b4.setBackground(Color.black);
        b4.setBounds(430,525,130,20);
        b4.addActionListener(this);
        image.add(b4);

        b5=new JButton("Fast Cash");
        b5.setForeground(Color.white);
        b5.setBackground(Color.black);
        b5.setBounds(640,450,130,20);
        b5.addActionListener(this);
        image.add(b5);
        b6=new JButton("change PIN");
        b6.setForeground(Color.white);
        b6.setBackground(Color.black);
        b6.setBounds(640,475,130,20);
        b6.addActionListener(this);
        image.add(b6);

        b7=new JButton("Generate PIN");
        b7.setForeground(Color.white);
        b7.setBackground(Color.black);
        b7.setBounds(640,500,130,20);
        b7.addActionListener(this);
        image.add(b7);

        b8=new JButton("Exit");
        b8.setForeground(Color.white);
        b8.setBackground(Color.black);
        b8.setBounds(640,525,130,20);
        b8.addActionListener(this);
        image.add(b8);




        setSize(1550,1000);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);
    }



    public static void main(String[] args) {

        new Transaction("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()==b1){
                new Deposit(pin);
                setVisible(false);

            }else if(e.getSource()==b2){
                new Withdrawl(pin);
                setVisible(false);


            }
            else if(e.getSource()==b3){
                new BalanceEnquiry(pin);
                setVisible(false);

            }
            else if(e.getSource()==b4){

            }
            else if(e.getSource()==b5){

            }else if(e.getSource()==b6){

            }
            else if(e.getSource()==b7){


            }else if(e.getSource()==b8){
                setVisible(false);

            }



        }catch(Exception err){

        }
    }
}
