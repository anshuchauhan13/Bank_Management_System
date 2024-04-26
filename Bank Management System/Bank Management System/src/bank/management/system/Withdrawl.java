package bank.management.system;


import com.sun.jdi.PathSearchingVirtualMachine;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    JTextField text1;
    Withdrawl(String pin){
        this.pin =pin;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,1500,800);
        add(image);

        JLabel  l1= new JLabel("Enter the amount you want to Withdrawl");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(490,420,400,35);
        l1.setForeground(Color.black);
        image.add(l1);
        JLabel  l2= new JLabel("(Maximum withdrawl amount is Rs.10000)");
        l2.setFont(new Font("System",Font.BOLD,10));
        l2.setBounds(530,440,400,35);
        l2.setForeground(Color.black);
        image.add(l2);

        text1= new JTextField();
        text1.setBounds(500,470,250,25);
        text1.setFont(new Font("Rale Way",Font.BOLD,22));
        image.add(text1);

        b1= new JButton("Withdrawl");
        b1.setBounds(530,510,100,30);
        b1.setBackground(Color.black);
        b1.setForeground(Color.white);
        b1.addActionListener(this);
        image.add(b1);

        b2= new JButton("Back");
        b2.setBounds(640,510,100,30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        image.add(b2);



        setSize(1550,1000);
        setLocation(0,0);
        setLayout(null);
        setVisible(true);



    }

    public static void main(String[] args) {
        new Withdrawl("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource()==b2){
            setVisible(false);
            new Transaction(pin);
        }
        try {
            String amount= text1.getText();
            Date date= new Date();

                if(text1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Please enter a valid amount.");
            }
            else {
                Con c = new Con();
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin= '" + pin + "' ");
                int balance=0;
                while (resultSet.next()) {

                    if (resultSet.getString("type").equals("Desposit")) {
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    } else {
                        balance -= Integer.parseInt((resultSet.getString("amount")));
                    }
                }

                if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, " Insufficient Balance");


                    }


                    c.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'withdrawl' , '"+amount+"')");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + "debited successfully");
                    setVisible(false);
                    new Transaction(pin);
                }


        }catch(Exception err){
            err.printStackTrace();

        }






    }
}