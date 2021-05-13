package humanresorcemanagementsystem;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class updateForm extends JFrame implements emploeeList, ActionListener{
    JLabel lb1,lb2,lb3,lb4;
    JButton FName, LName,Id;
    JTextField id,id2;

    public updateForm() {
        lb1=new JLabel("You can update an emploee by his id");
        lb2=new JLabel("give the update");
        lb3=new JLabel("choose what to update");
        lb4=new JLabel("give former id");
        
        id= new JTextField(60);
        id2= new JTextField(60);
        lb1.setBounds(50, 50, 230, 40);
        lb2.setBounds(10, 190, 150, 40);
        lb3.setBounds(100, 250, 150, 40);
        lb4.setBounds(10, 110, 150, 40);
        id.setBounds(170, 110, 200, 40);
        id2.setBounds(170, 190, 200, 40);
        
        FName=new JButton("First name");
        FName.setBounds(10, 300, 100, 40);
        add(FName);
        LName=new JButton("last name");
        LName.setBounds(120, 300, 100, 40);
        add(LName);
        Id=new JButton("id");
        Id.setBounds(240, 300, 100, 40);
        add(Id);
        
        add(lb1);add(lb2);add(lb3);add(lb4);
        add(id);add(id2);
        setTitle("delete Form");
        setLayout(null);
        setSize(400, 450);
        setVisible(true);
        
        FName.addActionListener(this);
        LName.addActionListener(this);
        Id.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
         if (e.getSource()==FName)
        {
        for(emploee t: emploees)
        {
            if (t.getId().equalsIgnoreCase(id.getText()))
            {
                t.setFNname(id2.getText());
                JOptionPane.showMessageDialog(null,"update Succesful!");
            }
        }}
        else  if (e.getSource()==FName)
        {
        for(emploee t: emploees)
        {
            if (t.getId().equalsIgnoreCase(id.getText()))
            {
                t.setFNname(id2.getText());
                JOptionPane.showMessageDialog(null,"update Succesful!");
            }
        }}
         else  if (e.getSource()==FName)
        {
        for(emploee t: emploees)
        {
            if (t.getId().equalsIgnoreCase(id.getText()))
            {
                t.setFNname(id2.getText());
                JOptionPane.showMessageDialog(null,"update Succesful!");
            }
        }}
    }
    
}
