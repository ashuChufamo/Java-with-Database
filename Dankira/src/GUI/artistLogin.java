package GUI;

import database.connection;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class artistLogin extends JFrame implements ActionListener {

    JLabel jl1, jl2, jl3, jl4;
    JButton jb1, jb2;
    JTextField jtf1, jtf2, jtf3;

    public artistLogin() {
//

        jb1 = new JButton("search");
        jb1.setBounds(200, 450, 100, 40);
        add(jb1);

        jb2 = new JButton("Buy");
        jb2.setBounds(100, 450, 100, 40);
        add(jb2);

        jtf1 = new JTextField(60);
        jtf1.setBounds(150, 100, 200, 40);
        jtf2 = new JTextField(60);
        jtf2.setBounds(150, 150, 200, 40);
        jtf3 = new JTextField(60);
        jtf3.setBounds(150, 200, 200, 40);
        add(jtf1);
        add(jtf2);
        add(jtf3);

        jl1 = new JLabel("Fill up the form");
        jl2 = new JLabel("First name");
        jl3 = new JLabel("last name");
        jl4 = new JLabel("ID");

        jl1.setBounds(150, 50, 180, 40);
        jl2.setBounds(10, 100, 180, 40);
        jl3.setBounds(10, 150, 180, 40);
        jl4.setBounds(10, 200, 180, 40);

        add(jl1);
        add(jl2);
        add(jl3);
        add(jl4);

        setSize(450, 700);
        setVisible(true);

        jb1.addActionListener(this);
        jb2.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == jb1) {
            String a = jtf1.getText();
            Connection conn;

            conn = connection.getConnection();

            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            try {

                String query = "select * from artist where username=? ";
                preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, a);
                resultSet = preparedStatement.executeQuery();
                if (resultSet.next()) {
                    System.out.println("Here you are...");
                    JOptionPane.showMessageDialog(null, "Succesful!");
                }
               // JOptionPane.showMessageDialog(null, "Not Succesful!");

            } catch (SQLException ex) {
                Logger.getLogger(userslogin.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    preparedStatement.close();
                    resultSet.close();
                } catch (Exception ex) {

                }
            }

        } else if (e.getSource() == jb2) {
            System.out.println("you bought the album sussesfully...");
            JOptionPane.showMessageDialog(null, "Succesful!");
        }
    }

}
