package vistas;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Connection;
import conexion.conex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;


public class mainMenu {
    private JButton authButton;
    private JPanel panel2;

    public mainMenu ()  {
        authButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("login");
                frame.setContentPane(new login().panel1);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("mainMenu");
        frame.setContentPane(new mainMenu().panel2);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
