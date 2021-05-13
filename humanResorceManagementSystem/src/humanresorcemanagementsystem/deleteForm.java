package humanresorcemanagementsystem;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class deleteForm extends JFrame implements emploeeList, ActionListener
{
    JLabel lb1,lb2;
    JButton finish;
    JTextField id;

    public deleteForm() 
    {
        lb1=new JLabel("You can delete an emploee by his id");
        lb2=new JLabel("Password");
        id= new JTextField(60);
        lb1.setBounds(50, 50, 230, 40);
        lb2.setBounds(10, 150, 150, 40);
        id.setBounds(170, 150, 200, 40);
        finish=new JButton("Finish");
        finish.setBounds(150, 300, 100, 40);
        add(finish);
        
        add(lb1);add(lb2);
        add(id);
        setTitle("delete Form");
        setLayout(null);
        setSize(400, 450);
        setVisible(true);
        
        finish.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource()==finish)
        {
        for(emploee t: emploees)
        {
            if (t.getId().equalsIgnoreCase(id.getText()))
            {
                emploees.remove(t);
                JOptionPane.showMessageDialog(null,"Succesful!");
            }
        }}
    }
    
}
