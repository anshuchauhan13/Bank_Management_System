package bank.management.system;
import java.util.Date;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JButton b1,b2;
    JTextField text1;
    Deposit(String pin){
        super("Deposit");
        this.pin=pin;
       ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/atm2.png"));
       Image i2= i1.getImage().getScaledInstance(1500,800,Image.SCALE_DEFAULT);
       ImageIcon i3= new ImageIcon(i2);
       JLabel image= new JLabel(i3);
       image.setBounds(0,0,1500,800);
       add(image);

       JLabel  l1= new JLabel("Enter the amount you want to deposite");
       l1.setFont(new Font("System",Font.BOLD,16));
       l1.setBounds(490,420,400,35);
       l1.setForeground(Color.black);
       image.add(l1);

       text1= new JTextField();
       text1.setBounds(500,470,250,25);
       text1.setFont(new Font("Rale Way",Font.BOLD,22));
       image.add(text1);

       b1= new JButton("Deposit");
       b1.setBounds(530,510,80,30);
       b1.setBackground(Color.black);
       b1.setForeground(Color.white);
       b1.addActionListener(this);
       image.add(b1);

        b2= new JButton("Back");
        b2.setBounds(620,510,80,30);
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
         new Deposit("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = text1.getText();
            Date date = new Date();
            if(e.getSource() == b1){
                if(text1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"enter the valid amount");
                }
                else{
                    Con c1 = new Con();
                    c1.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"', 'Deposit' , '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs." + amount + " successfully deposited.");

                    setVisible(false);
                    new Transaction(pin);
                }
            }
            else if(e.getSource()==b2){
                setVisible(false);

            }
        }catch(Exception err){
            err.printStackTrace();

        }



    }
}
