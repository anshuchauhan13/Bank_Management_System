package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JRadioButton a1,a2,a3,a4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String formno;
    Signup3( String formno){
        this.formno= formno;


        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(120,10,100,100);
        add(image);
        JLabel lab1 = new JLabel("Page 3");
        lab1.setBounds(300,30,300,30);
        lab1.setFont(new Font("Rale way" , Font.BOLD , 25));
        add(lab1);

        JLabel lab2 = new JLabel("Account Details");
        lab2.setBounds(300,60,300,30);
        lab2.setFont(new Font("Rale way" , Font.BOLD , 25));
        add(lab2);

        JLabel lab3 = new JLabel("Accout Type:");
        lab3.setBounds(60,150,300,30);
        lab3.setFont(new Font("Rale way" , Font.BOLD , 25));
        add(lab3);

        a1= new JRadioButton("Saving Account");
        a1.setBounds(80,220,300,25);
        a1.setBackground(new Color(222, 255, 228));
        a1.setFont(new Font("Rale way" , Font.PLAIN , 25));
        add(a1);
        a2= new JRadioButton("Current Account");
        a2.setBounds(80,260,300,25);
        a2.setBackground(new Color(222, 255, 228));
        a2.setFont(new Font("Rale way" , Font.PLAIN , 25));
        add(a2);
        a3= new JRadioButton("Fixed Deposit Account");
        a3.setBounds(380,220,400,25);
        a3.setBackground(new Color(222, 255, 228));
        a3.setFont(new Font("Rale way" , Font.PLAIN , 25));
        add(a3);
        a4= new JRadioButton("Recurring Deposit Account");
        a4.setBounds(380,260,400,25);
        a4.setBackground(new Color(222, 255, 228));
        a4.setFont(new Font("Rale way" , Font.PLAIN , 25));
        add(a4);

        ButtonGroup btn =new ButtonGroup();
        btn.add(a1);
        btn.add(a2);
        btn.add(a3);
        btn.add(a4);

        JLabel lab4 = new JLabel("Card Number:");
        lab4.setBounds(60,320,300,30);
        lab4.setFont(new Font("Rale way" , Font.BOLD , 25));
        add(lab4);

        JLabel lab7 = new JLabel("(your 16-digit card number)");
        lab7.setBounds(60,350,300,30);
        lab7.setFont(new Font("Rale way" , Font.BOLD , 10));
        add(lab7);

        JLabel lab8 = new JLabel("XXXX-XXXX-XXXX-8421");
        lab8.setBounds(380,320,300,30);
        lab8.setFont(new Font("Rale way" , Font.BOLD , 20));
        add(lab8);
        JLabel lab9 = new JLabel("(It would appear on atm card/cheque book and statement)");
        lab9.setBounds(380,350,300,30);
        lab9.setFont(new Font("Rale way" , Font.BOLD , 10));
        add(lab9);

        JLabel lab5 = new JLabel("PIN:");
        lab5.setBounds(60,390,300,30);
        lab5.setFont(new Font("Rale way" , Font.BOLD , 25));
        add(lab5);
        JLabel lab10 = new JLabel("XXXX");
        lab10.setBounds(380,390,300,30);
        lab10.setFont(new Font("Rale way" , Font.BOLD , 25));
        add(lab10);

        JLabel lab6 = new JLabel("Service Required");
        lab6.setBounds(60,430,300,30);
        lab6.setFont(new Font("Rale way" , Font.BOLD , 25));
        add(lab6);

        c1= new JCheckBox("Internet Banking");
        c1.setBounds(80,460,300,30);
        c1.setFont(new Font("Rale way" , Font.PLAIN , 20));
        c1.setBackground(new Color(222,255,228));
        add(c1);
        c2= new JCheckBox("Mobile Banking");
        c2.setBounds(80,490,300,30);
        c2.setFont(new Font("Rale way" , Font.PLAIN , 20));
        c2.setBackground(new Color(222,255,228));
        add(c2);
        c3= new JCheckBox("ATM Services");
        c3.setBounds(80,520,300,30);
        c3.setFont(new Font("Rale way" , Font.PLAIN , 20));
        c3.setBackground(new Color(222,255,228));
        add(c3);
        c4= new JCheckBox("Email Alerts");
        c4.setBounds(400,460,300,30);
        c4.setFont(new Font("Rale way" , Font.PLAIN , 20));
        c4.setBackground(new Color(222,255,228));
        add(c4);
        c5= new JCheckBox("Cheque Book");
        c5.setBounds(400,490,300,30);
        c5.setFont(new Font("Rale way" , Font.PLAIN , 20));
        c5.setBackground(new Color(222,255,228));
        add(c5);
        c6= new JCheckBox("E-Statement");
        c6.setBounds(400,520,300,30);
        c6.setFont(new Font("Rale way" , Font.PLAIN , 20));
        c6.setBackground(new Color(222,255,228));
        add(c6);

        c7= new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge. ",true);
        c7.setBounds(60,550,600,30);
        c7.setFont(new Font("Rale way" , Font.BOLD , 12));
        c7.setBackground(new Color(222,255,228));
        add(c7);
        JLabel lab12 = new JLabel("Form No.:");
        lab12.setForeground(Color.BLACK);
        lab12.setFont(new Font("AvantGrade" , Font.BOLD, 14));
        lab12.setBounds(600,20,100,40);
        add(lab12);
        JLabel lab13 = new JLabel(formno);
        lab13.setForeground(Color.BLACK);
        lab13.setFont(new Font("AvantGrade" , Font.BOLD, 14));
        lab13.setBounds(700,20,100,40);
        add(lab13);

        submit= new JButton("submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setBounds(650,600,80,40);
        submit.addActionListener(this);
        add(submit);
        cancel= new JButton("cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setBounds(550,600,80,40);
        cancel.addActionListener(this);
        add(cancel);






        getContentPane().setBackground(new Color(222, 255, 228));
        setSize(800,700);
        setLocation(360,40);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup3("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String account = null;
        if (a1.isSelected()) {
            account = "Saving account";
        } else if (a2.isSelected()) {
            account = "Current account";
        } else if (a3.isSelected()) {
            account = "Fixed Deposit account";
        } else if (a4.isSelected()) {
            account = "Reccuring deposit account";
        }
        Random ran = new Random();
        long First7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(First7);
        long First3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(First3);
        String fac = "";
        if (c1.isSelected()) {
            fac += "Internet Banking";
        } else if (c2.isSelected()) {
            fac += "Mobile Banking";
        } else if (c3.isSelected()) {
            fac += "ATM CARD";
        } else if (c4.isSelected()) {
            fac += "Email Alerts";
        } else if (c5.isSelected()) {
            fac += "Cheque Book";
        } else if (c6.isSelected()) {
            fac += "E statemen";
        }
        try{
            if(e.getSource()==submit){
                if(account.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all feilds");


                }else{
                    Con c1= new Con();
                    String q1="insert into signupthree values('"+formno+"', '"+account+"', '"+cardno+"', '"+pin+"', '"+fac+"'  )";
                    String q2="insert into login values('"+formno+"', '"+cardno+"', '"+pin+"')";
                    c1.statement.executeUpdate(q1);
                    c1.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Account Created Successfully \n" + "Card number\n " + cardno + "pin \n" + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }
            else if(e.getSource()==cancel){
                System.exit(0);

            }


        }catch(Exception err){
            err.printStackTrace();
        }



    }
}
