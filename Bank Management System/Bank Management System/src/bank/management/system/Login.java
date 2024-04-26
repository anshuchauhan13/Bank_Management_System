package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {

    JLabel label1,label2,label3;
    JTextField text;
    JPasswordField psw;
    JButton btn1,btn2,btn3;

    //constructor
    Login(){
        super("Bank Management System");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(400,15,100,100);
        add(image);

        ImageIcon j1= new ImageIcon(ClassLoader.getSystemResource("icons/card.png"));
        Image j2 = j1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel secImage= new JLabel(j3);
        secImage.setBounds(650,260,200,200);
        add(secImage);

        label1 = new JLabel("WELCOME to ATM");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGrade" , Font.BOLD, 30));
        label1.setBounds(320,120,450,40);
        add(label1);


        label2 = new JLabel("Card No.:");
        label2.setForeground(Color.white);
        label2.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        label2 .setBounds(180,180,350,40);
        add(label2);

        text= new JTextField(15);
        text.setBounds(300,180,350,40);
        add(text);



        label3 = new JLabel( "Pin No.:");
        label3.setForeground(Color.white);
        label3.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        label3.setBounds(180,240,350,40);
        add(label3);

        psw = new JPasswordField(15);
        psw.setBounds(300,240,350,40);
        add(psw);

        btn1=new JButton("sign in");
        btn1.setBounds(350,300,100,30);
        btn1.setForeground(Color.black);
        btn1.addActionListener(this);
        add(btn1);

        btn2=new JButton("clear");
        btn2.setBounds(470,300,100,30);
        btn2.setForeground(Color.black);
        btn2.addActionListener(this);
        add(btn2);

        btn3=new JButton("sign up");
        btn3.setBounds(400,350,100,30);
        btn3.setForeground(Color.black);
        btn3.addActionListener(this);
        add(btn3);



        ImageIcon b1= new ImageIcon(ClassLoader.getSystemResource("icons/background.jpg"));
        Image b2 = b1.getImage().getScaledInstance(900,450, Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel bImage= new JLabel(b3);
        bImage.setBounds(0,0,900,450);
        add(bImage);



        setLayout(null);
        setSize(900,450);
        setLocation(400,200);

        setVisible(true);


    }


    public static void main(String[] args) {
        new Login();



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource()== btn1){
                Con c = new Con();
                String cardno= text.getText();
                String pin= psw.getText();

                String q="select * from login where cardno = '"+cardno+"' and pin = '"+pin+"' ";
                ResultSet resultSet= c.statement.executeQuery(q);
                if(resultSet.next()){
                    setVisible(false);
                    new Transaction(pin);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card number or PIN");
                }


            }else if(e.getSource()==btn2) {
                text.setText("");
                psw.setText("");


            }else if(e.getSource()==btn3){

                new Signup();
                setVisible(false);

            }
            else{
                System.out.println("hahahahhah foolish");
            }
        }catch(Exception err){
            err.printStackTrace();

        }

    }
}
