package humanresorcemanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class afterLogIn extends JFrame implements ActionListener
{
    JButton jb1, jb2, jb3, jb4;
    public afterLogIn ()
    {
        jb1= new JButton("Add");
        jb2= new JButton("delete");
        jb3= new JButton("update");
        jb4= new JButton("view/print");
        
        jb1.setBounds(10, 70, 100, 40);
        jb2.setBounds(200, 70, 100, 40);
        jb3.setBounds(10, 190, 100, 40);
        jb4.setBounds(200, 190, 100, 40);
        
        add(jb1);
        add(jb2);
        add(jb3);
        add(jb4);
        
        setTitle("admin form");
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        jb1.addActionListener(this);
        jb2.addActionListener(this);
        jb3.addActionListener(this);
        jb4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
      if (e.getSource()==jb1)
        {
            new addForm();
        }
        else if(e.getSource()==jb2)
        {
            new deleteForm();
        }
      
        else if(e.getSource()==jb3)
        {
           new updateForm();
        }
      
        else if(e.getSource()==jb4)
        {
            new viewForm();
        }
    }
    
    
}
