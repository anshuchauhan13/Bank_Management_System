package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox combo,newcombo,educcombo,opcombo;
    String formno;
    JButton next2;

    JTextField incometxt,pantxt,adhartxt;
    Signup2(String formno){
        super("Application Form");
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image= new JLabel(i3);
        image.setBounds(120,10,100,100);
        add(image);
        this.formno=formno;

        JLabel l1 = new JLabel("Page 2");
        l1.setBounds(300,40,300,30);
        l1.setFont(new Font("Rale way" , Font.BOLD , 25));
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setBounds(300,80,300,30);
        l2.setFont(new Font("Rale way" , Font.BOLD , 25));
        add(l2);


        JLabel l3 = new JLabel("Religion:");
        l3.setForeground(Color.BLACK);
        l3.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        l3.setBounds(80,140,350,40);
        add(l3);

        String religion[]={"Hindu", "Muslim", "Sikh"," Christian", "Other"};
        combo = new JComboBox(religion);
        combo.setBackground(new Color(222,255,228));
        combo.setFont(new Font("Rale way", Font.BOLD,14 ));
        combo.setBounds(300,140,400,40);
        add(combo);


        JLabel l4 = new JLabel("Category:");
        l4.setForeground(Color.BLACK);
        l4.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        l4.setBounds(80,200,350,35);
        add(l4);

        String category[]={"General", "OBC", "SC/ST" ,"Other"};
        newcombo = new JComboBox(category);
        newcombo.setBackground(new Color(222,255,228));
        newcombo.setFont(new Font("Rale way", Font.BOLD,14 ));
        newcombo.setBounds(300,200,400,35);
        add(newcombo);

        JLabel l5 = new JLabel("Income:");
        l5.setForeground(Color.BLACK);
        l5.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        l5.setBounds(80,260,350,40);
        add(l5);

        incometxt= new JTextField();
        incometxt.setFont(new Font("Rale way", Font.BOLD,14 ));
        incometxt.setBounds(300,260,400,35);
        add(incometxt);


        JLabel l6 = new JLabel("Educational:");
        l6.setForeground(Color.BLACK);
        l6.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        l6.setBounds(80,320,350,40);
        add(l6);

        String education[]={"Non-Graduate","Graduate", "Post-Graduate", "Dcotrate", "Other"};
        educcombo = new JComboBox(education);
        educcombo.setBackground(new Color(222,255,228));
        educcombo.setFont(new Font("Rale way", Font.BOLD,14 ));
        educcombo.setBounds(300,320,400,35);
        add(educcombo);

        JLabel l7 = new JLabel("Occupation");
        l7.setForeground(Color.BLACK);
        l7.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        l7.setBounds(80,380,350,40);
        add(l7);

        String occupation[]={"Student","Employee", "Business", "SelF-Employee","Retired", "Other"};
        opcombo = new JComboBox(occupation);
        opcombo.setBackground(new Color(222,255,228));
        opcombo.setFont(new Font("Rale way", Font.BOLD,14 ));
        opcombo.setBounds(300,380,400,35);
        add(opcombo);

        JLabel l8= new JLabel("PAN Number");
        l8.setForeground(Color.BLACK);
        l8.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        l8.setBounds(80,440,350,40);
        add(l8);
        pantxt= new JTextField();
        pantxt.setFont(new Font("Rale way", Font.BOLD,14 ));
        pantxt.setBounds(300,440,400,35);
        add(pantxt);

        JLabel l9 = new JLabel("Aadhar Number:");
        l9.setForeground(Color.BLACK);
        l9.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        l9.setBounds(80,500,350,40);
        add(l9);

        adhartxt= new JTextField();
        adhartxt.setFont(new Font("Rale way", Font.BOLD,14 ));
        adhartxt.setBounds(300,500,400,35);
        add(adhartxt);

        JLabel l10 = new JLabel("Form No.:");
        l10.setForeground(Color.BLACK);
        l10.setFont(new Font("AvantGrade" , Font.BOLD, 14));
        l10.setBounds(600,20,100,40);
        add(l10);
        JLabel l11 = new JLabel(formno);
        l11.setForeground(Color.BLACK);
        l11.setFont(new Font("AvantGrade" , Font.BOLD, 20));
        l11.setBounds(700,20,100,40);
        add(l11);



        next2= new JButton("Next");
        next2.setBackground(Color.black);
        next2.setForeground(Color.white);
        next2.addActionListener(this);
        next2.setBounds(600,600,100,50);

        add(next2);




        getContentPane().setBackground(new Color(222, 255, 228));
        setSize(800,700);
        setLocation(360,40);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Signup2("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String religion=(String) combo.getSelectedItem();
           String category=(String) newcombo.getSelectedItem();
           String income=incometxt.getText();
           String education= (String) educcombo.getSelectedItem();
           String occupation=(String)opcombo.getSelectedItem();
           String pan =pantxt.getText();
           String adhar=adhartxt.getText();

        try{

            if(pantxt.getText().equals("") || adhartxt.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill out the PAN and Aadhar number.");
            }
            else {
                Con c1= new Con();
                String q2 = "insert into signuptwo values('"+formno+"', '"+religion+"', '"+category+"', '" + income + "', '" + education + "', '" + occupation + "', '" + pan + "', '" + adhar + "')";
                c1.statement.executeUpdate(q2);
                new Signup3(formno);
                setVisible(false);
            }

        }
        catch(Exception err){
            err.printStackTrace();
        }
    }
}
