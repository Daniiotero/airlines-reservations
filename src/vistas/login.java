package vistas;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import conexion.conex;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {

    conex con = new conex();
    Connection cn= conex.ConnectDB();

    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField txtUserLogin;
    private JPasswordField txtPassLogin;
    private JPanel Register;
    private JTextField txtUserRegister;
    private JTextField txtEmailRegister;
    private JPasswordField txtPassRegister;
    private JButton registerButton;
    private JButton loginButton;

    public login(){

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=txtUserLogin.getText();
                String password=txtPassLogin.getText();

            //COMPROBACIONES
            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the fields");
            }else{
                //buscamos coincidencias en la base de datos para iniciar sesión
                try{
                    String selectUser = "SELECT * FROM users WHERE username = '" + username + "'";
                    if (selectUser.isEmpty())

                        //mirar como gestionar error al seleccionar usuario
                }catch(Exception exception){

                }
            }
            }
        });

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username=txtUserRegister.getText();
                String email=txtEmailRegister.getText();
                String password = txtPassRegister.getText();
            //comprobaciones
            if(username.isEmpty() || email.isEmpty() || password.isEmpty()){
                JOptionPane.showMessageDialog( null,"Please fill all the fields");
            }else{
                //introducimos datos en la DB
                try {
                    String insertDataRegister = "INSERT INTO user(username, email, password) VALUES ('"+username+"','"+email+"','"+password+"')";
                    PreparedStatement ps = (PreparedStatement) cn.prepareStatement(insertDataRegister);
                    ps.executeUpdate();
                        cleanRegisterForm();
                    JOptionPane.showMessageDialog(null, "User registered successfully");
                }catch(Exception exception){
                    JOptionPane.showMessageDialog(null,"An error occurred"+exception);
                }
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("login");
        frame.setContentPane(new login().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    void cleanRegisterForm() {
        txtUserRegister.setText("");
        txtEmailRegister.setText("");
        txtPassRegister.setText("");
        txtUserLogin.setText("");
        txtPassLogin.setText("");
    }

    
}
