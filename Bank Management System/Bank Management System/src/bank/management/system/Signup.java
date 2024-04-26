package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    Random ran = new Random();
    long first4= (ran.nextLong()% 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    JTextField textname,textfname,textemail,textaddress,textpin;
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;




    Signup(){
        super("Application Form");
            //icon
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
                //text
        JLabel label1= new JLabel("APPLICATION FORM NO.: " + first);
        label1.setBounds(200,40,600,40);
        label1.setFont(new Font("Rale way", Font.BOLD, 30)  );
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setBounds(400,90,300,30);
        label2.setFont(new Font("Rale way" , Font.PLAIN , 25));
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(350,120,300,30);
        label3.setFont(new Font("Rale way" , Font.PLAIN , 25));
        add(label3);

       JLabel label4 = new JLabel("Name:");
        label4.setForeground(Color.BLACK);
        label4.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        label4.setBounds(120,200,350,40);
        add(label4);

        textname = new JTextField(15);
        textname.setBounds(300,200,400,40);
        add(textname);


        JLabel label5= new JLabel("Father's Name:");
        label5.setForeground(Color.BLACK);
        label5.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        label5.setBounds(120,250,350,40);
        add(label5);

        textfname = new JTextField(15);
        textfname.setBounds(300,250,400,40);
        add(textfname);


        JLabel label6= new JLabel("Gender: ");
        label6.setForeground(Color.BLACK);
        label6.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        label6.setBounds(120,300,350,40);
        add(label6);


         r1 = new JRadioButton("Male");
         r1.setBounds(300, 300,80,30);
        r1.setBackground(new Color(222,255,228));
        add(r1);
        r2 = new JRadioButton("Female");
        r2.setBounds(450, 300,80,30);
        r2.setBackground(new Color(222,255,228));
        add(r2);

        ButtonGroup button = new ButtonGroup();
        button.add(r1);
        button.add(r2);

        JLabel label7 = new JLabel("Email:");
        label7.setForeground(Color.BLACK);
        label7.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        label7.setBounds(120,350,350,40);
        add(label7);

        textemail = new JTextField(15);
        textemail.setBounds(300,350,400,40);
        add(textemail);

        JLabel label8 = new JLabel("Martial Status:");
        label8.setForeground(Color.BLACK);
        label8.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        label8.setBounds(120,400,350,40);
        add(label8);

        m1 = new JRadioButton("Married");
        m1.setBounds(300, 400,100,30);
        m1.setBackground(new Color(222,255,228));
        add(m1);
        m2 = new JRadioButton("Unmarried");
        m2.setBounds(450, 400,100,30);
        m2.setBackground(new Color(222,255,228));
        add(m2);
        m3 = new JRadioButton("other");
        m3.setBounds(600, 400,100,30);
        m3.setBackground(new Color(222,255,228));
        add(m3);


        JLabel label9 = new JLabel("Address:");
        label9.setForeground(Color.BLACK);
        label9.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        label9.setBounds(120,450,350,40);
        add(label9);
        textaddress= new JTextField(15);
        textaddress.setBounds(300,450,400,40);
        add(textaddress);

        JLabel label10 = new JLabel("Pin Code:");
        label10.setForeground(Color.BLACK);
        label10.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        label10.setBounds(120,500,350,40);
        add(label10);

        textpin= new JTextField(15);
        textpin.setBounds(300,500,400,40);
        add(textpin);

        next= new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setBounds(670,650,100,50);
        next.addActionListener(this);
        add(next);




        getContentPane().setBackground(new Color(222,255,228));
        setSize(900,800);
        setLocation(360,40);
        setLayout(null);
        setVisible(true);

    }



    public static void main(String[] args) {
        new Signup();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String form= first;
        String name= textname.getText();
        String fname = textfname.getText();
        String gender = null;
        if(r1.isSelected()){
            gender="Male";
        }
        else if(r2.isSelected()){
            gender="Female";
        }
        String email=textemail.getText();
        String martial =null;
        if(m1.isSelected()){
            martial ="Married";
        } else if (m2.isSelected()) {
            martial="UnMarried";

        }
        else if(m3.isSelected()){
            martial="other";
        }
        String address= textaddress.getText();
        String pin= textpin.getText();

        try{
            if(textname.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Fill the form");

            }else{
                Con con1= new Con();
                String q = "insert into Signup values('"+form+"', '"+name+"', '"+fname+"','"+gender+"', '"+email+"', '"+martial+"','"+address+"', '"+pin+"')";
                con1.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }


        }catch(Exception err){
            err.printStackTrace();
        }
    }
}
