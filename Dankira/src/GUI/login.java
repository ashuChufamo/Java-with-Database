package GUI;

import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class login extends JFrame implements ActionListener
{


    JButton jb1, jb2;
    JTextField userText;
    JLabel lb1,lb2,lb3;
    JPasswordField passwordText;

    public login()
    {
        lb1=new JLabel("Enter UserName and Password");
        lb2=new JLabel("UserName");
        lb3=new JLabel("Password");
        userText= new JTextField(60);
        passwordText = new JPasswordField(60);
        jb1= new JButton("Log in");
        jb2= new JButton("Clear");
        lb1.setBounds(10, 20, 200, 40);
        lb2.setBounds(10, 100, 200, 40);
        lb3.setBounds(10, 150, 200, 40);
        userText.setBounds(90,100,200,30);
        passwordText.setBounds(90, 150, 200, 30);
        jb1.setBounds(10, 200, 100, 40);
        jb2.setBounds(150, 200, 135, 40);
        add(jb1);
        add(jb2);
        add(lb1);
        add(lb2);
        add(lb3);
        add(userText);
        add(passwordText);
        setTitle("Login Form for admin");
        setLayout(null);
//        setBackground(Color.yellow);
//        setSize(400, 400);
        setVisible(true);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        
    }
   
   

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==jb1)
        {
//            String us="ashu";
//            String ps= "1234";
            String getus=userText.getText();
            String getpass= passwordText.getText();
            if(userslogin.userslogin(getus,getpass))
            {
                afterLogin afterLogin = new afterLogin();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"incorrect account");          
            }
        }
        else if(e.getSource()==jb2)
        {
            userText.setText(null);
            passwordText.setText(null);
        }
    }
   
}