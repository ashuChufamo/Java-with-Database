package humanresorcemanagementsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.io.*;
import javax.swing.JOptionPane;

public class addForm extends JFrame implements ActionListener, emploeeList
{
//    JFrame f;
    JButton submit;
    JTextField FName, LName,Id;
    JLabel lb1,lb2,lb3,lb4, lb5, lb6;    
    JRadioButton r1= new JRadioButton("male"); 
    JRadioButton r2= new JRadioButton("female");
    
    String pos[]={"teacher","guard","staff"};
    JComboBox position= new JComboBox(pos);

    public addForm() {
        submit=new JButton("Submit");
        submit.setBounds(100, 450, 100, 40);
        add(submit); 
                
        FName= new JTextField(60);
        FName.setBounds(150,100,200,40);
        LName= new JTextField(60);
        LName.setBounds(150,150,200,40);
        Id= new JTextField(60);
        Id.setBounds(150,200,200,40);
        add(FName);add(LName);add(Id);
        
        lb1=new JLabel("Fill up the form");
        lb2=new JLabel("First name");
        lb3=new JLabel("last name");
        lb4=new JLabel("ID");
        lb5=new JLabel("Sex");
        lb6=new JLabel("position");
        
        lb1.setBounds(150, 50, 180, 40);
        lb2.setBounds(10, 100, 180, 40);
        lb3.setBounds(10, 150, 180, 40);
        lb4.setBounds(10, 200, 180, 40);
        lb5.setBounds(10, 250, 100, 40);
        lb6.setBounds(10, 310, 180, 40);
        add(lb1);add(lb2);add(lb3);add(lb4);add(lb5);add(lb6);
        
        
        
        r1.setBounds(150, 250, 70, 40);
        r2.setBounds(240, 250, 70, 40);
        ButtonGroup bg= new ButtonGroup();
        //bg.add(r1);bg.add(r2);
//        add(r1);add(r2);
        
//        position.setBounds(200, 310, 200, 40);
//        add(position);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450, 700);
        setVisible(true);
        
        submit.addActionListener(this);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==submit)
        {
            emploee o=new emploee(FName.getText(),LName.getText(),Id.getText(),"Male","teacher");
            emploees.add(o);
            JOptionPane.showMessageDialog(null,"Succesful!");
        }
    }
    
}
