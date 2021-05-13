
package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class afterLogin extends JFrame implements ActionListener{
     JButton jb1, jb2, jb3, jb4;
    public afterLogin ()
    {
        jb1= new JButton("artist");
        jb2= new JButton("user");
        
        
        jb1.setBounds(10, 70, 100, 40);
        jb2.setBounds(200, 70, 100, 40);
        
        
        add(jb1);
        add(jb2);
       
        setBackground(Color.yellow);
        setTitle("admin form");
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jb1.addActionListener(this);
        jb2.addActionListener(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource()==jb1)
        {
            new artistLogin();
        }
        else if(e.getSource()==jb2)
        {
            new userLogin();
        }
      
    }}