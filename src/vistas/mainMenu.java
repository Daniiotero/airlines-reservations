package vistas;

import javax.swing.*;


public class mainMenu {
    public JPanel Page1;
    private JButton button1;
    private JButton authButton;

    public mainMenu ()  {

        /*authButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/
    }


    /*private void ShowPanel (Page1 p) {
        p.setSize(680, 420);

        content.removeAll();
        content.add(p, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();

    }*/


    public static void main(String[] args) {
        JFrame frame = new JFrame("mainMenu");
        frame.setContentPane(new mainMenu().Page1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
