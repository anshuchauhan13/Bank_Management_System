package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JLabel l1,l2;
    String pin;
    JButton b1,b2;
    JTextField text1;
    BalanceEnquiry(String pin){
        this.pin=pin;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
        Image i2= i1.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
        ImageIcon i3= new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(0,0,1500,800);
        add(image);

        l1= new JLabel("Your Current Balance is");
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(550,420,400,35);
        l1.setForeground(Color.black);
        image.add(l1);

        l2= new JLabel();
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(500,470,250,25);
        l2.setForeground(Color.black);
        image.add(l2);




        b2= new JButton("Back");
        b2.setBounds(640,510,100,30);
        b2.setBackground(Color.black);
        b2.setForeground(Color.white);
        b2.addActionListener(this);
        image.add(b2);


        int balace =0;
        try{
            Con c =new Con();
            ResultSet resultSet= c.statement.executeQuery("select * from bank where pin = '"+pin+"' ");
            while(resultSet.next()) {
                if (resultSet.getString("type").equals("Deposit")) {
                    balace += Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balace -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch(Exception err){
            err.printStackTrace();
        }
        l2.setText("" + balace);

        setLocation(0,0);
        setSize(1500,1000);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b2){
            setVisible(false);
            new Transaction(pin);
        }

    }
}
