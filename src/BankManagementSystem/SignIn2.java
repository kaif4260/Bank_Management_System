package BankManagementSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignIn2 extends JFrame implements ActionListener {

    String formno;
    JComboBox comboBox1,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textField,textAadhar;
    JRadioButton r1,r2,e1,e2;
    JButton next;

    SignIn2(String formno){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page no:2");
        l1.setFont(new Font("Raleway", Font.BOLD,22));
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,60,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Muslim","Hindu","Sikh","Christian","Other"};
        comboBox1 = new JComboBox(religion);
        comboBox1.setBackground(new Color(252,208,76));
        comboBox1.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox1.setBounds(350,120,320,30);
        add(comboBox1);

        JLabel l4 = new JLabel("Category:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General","OBC","EWS","SC","ST"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway",Font.BOLD,18));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","<10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel l6 = new JLabel("Education:");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(100,270,100,30);
        add(l6);

        String edu[] = {"Non-Graduate","Graduate","Post-Graduate","Other"};
        comboBox4 = new JComboBox(edu);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel l7 = new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,18));
        l7.setBounds(100,320,150,30);
        add(l7);

        String occu[] = {"Self-Employed","Business","Retired","Other"};
        comboBox5 = new JComboBox(occu);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel l8 = new JLabel("PAN No.:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,100,30);
        add(l8);

        textField = new JTextField();
        textField.setBounds(350,370,320,30);
        textField.setFont(new Font("Raleway",Font.BOLD,14));
        add(textField);

        JLabel l9 = new JLabel("Aadhar No.:");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(100,420,150,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setBounds(350,420,320,30);
        textAadhar.setFont(new Font("Raleway",Font.BOLD,14));
        add(textAadhar);

        JLabel l10 = new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway",Font.BOLD,18));
        l10.setBounds(100,470,200,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setBounds(350,470,80,30);
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        r1.setBackground(new Color(252,208,76));
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBounds(450,470,80,30);
        r2.setFont(new Font("Raleway",Font.BOLD,14));
        r2.setBackground(new Color(252,208,76));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11 = new JLabel("Existing Account:");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,520,200,30);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setBounds(350,520,80,30);
        e1.setFont(new Font("Raleway",Font.BOLD,14));
        e1.setBackground(new Color(252,208,76));
        add(e1);

        e2 = new JRadioButton("No");
        e2.setBounds(450,520,80,30);
        e2.setFont(new Font("Raleway",Font.BOLD,14));
        e2.setBackground(new Color(252,208,76));
        add(e2);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(e1);
        buttonGroup2.add(e2);

        JLabel l12 = new JLabel("Form No:");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(700,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,12));
        l13.setBounds(760,10,30,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.white);
        next.setForeground(Color.BLACK);
        next.setBounds(570,640,100,30);
        next.addActionListener(this);
        add(next);


        
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

        String religion = (String) comboBox1.getSelectedItem();
        String category = (String) comboBox2.getSelectedItem();
        String income = (String) comboBox3.getSelectedItem();
        String education = (String) comboBox4.getSelectedItem();
        String occupation = (String) comboBox5.getSelectedItem();

        String pan = textField.getText();
        String aadhar = textAadhar.getText();

        String citizen = " ";
        if (r1.isSelected()){
            citizen = "Yes";
        }else if (r2.isSelected()){
            citizen = "N0";
        }

        String exAccount = " ";
        if (e1.isSelected()){
            exAccount = "Yes";
        } else if (e2.isSelected()) {
            exAccount = "No";
        }

        try{
            if (textField.getText().equals("") || textAadhar.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the field.");
            }else {
                Con con1 = new Con();
                String q = "insert into SignIn2 values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+citizen+"','"+exAccount+"')";
                System.out.println("Executing query: " + q);
                con1.statement.executeUpdate(q);
                new SignIn3(formno);
                setVisible(false);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignIn2("");
    }
}
