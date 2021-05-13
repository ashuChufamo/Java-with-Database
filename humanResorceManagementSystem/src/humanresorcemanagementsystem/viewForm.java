package humanresorcemanagementsystem;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class viewForm implements emploeeList
{
        JFrame f= new JFrame();      
        String column[]={"First name","last Name","id", "sex","position"};
        
        
    public viewForm() 
    {        
        int count=0;
        
        String data[][]= {{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""},{"","","","",""}};
        for(emploee t: emploees)
        {
            String [] temp= new String[5];
            temp[0]=t.getFName();temp[1]=t.getLName();temp[2]=t.getId();temp[3]=t.getSex();temp[4]=t.getPosition();            
            data[count]=  temp;
            count+=1;
        }
        JTable jt=new JTable(data,column);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(450, 450);
        f.setVisible(true);
    }
    
        
        
}
