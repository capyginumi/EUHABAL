package src;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Authentication {
    private JPanel panelAuthentication;
    private JLabel logo;
    private JTextField inputUsername;
    private JTextField inputPassword;
    private JButton LOGINButton;
    private JLabel iconUsername;
    private JLabel iconPassword;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Authentication");
        Authentication authentication = new Authentication();
        frame.setSize(450, 600);
        frame.setContentPane(authentication.panelAuthentication);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // STARTING FROM HERE, SETS THE USERNAME AND PASSWORD ICONS

        URL location = Authentication.class.getResource("/src/images/EURideLogo.png");
        ImageIcon icon = new ImageIcon(location);
        Image logoImage = icon.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);

        authentication.logo.setIcon(new ImageIcon(logoImage));
        authentication.logo.setText("");
        authentication.logo.setHorizontalAlignment(SwingConstants.CENTER);
        authentication.logo.setVerticalAlignment(SwingConstants.CENTER);
        authentication.logo.setOpaque(false);

        URL location2 = Authentication.class.getResource("/src/images/Username.png");
        ImageIcon icon2 = new ImageIcon(location2);
        Image iconUsername = icon2.getImage().getScaledInstance(48,48, Image.SCALE_SMOOTH);

        authentication.iconUsername.setIcon(new ImageIcon(iconUsername));
        authentication.iconUsername.setText("");
        authentication.iconUsername.setOpaque(false);


        URL location3 = Authentication.class.getResource("/src/images/Password.png");
        ImageIcon icon3 = new ImageIcon(location3);
        Image iconPassword = icon3.getImage().getScaledInstance(48,48, Image.SCALE_SMOOTH);

        authentication.iconPassword.setIcon(new ImageIcon(iconPassword));
        authentication.iconPassword.setText("");
        authentication.iconPassword.setOpaque(false);

        // ENDS HERE....



        // JTEXTFIELD ARE SET TO BE TRANSPARENT
        authentication.inputUsername.setOpaque(false);
        authentication.inputUsername.setBackground(new Color(0, 0, 0, 0));

        authentication.inputPassword.setOpaque(false);
        authentication.inputPassword.setBackground(new Color(0, 0, 0, 0));








    }




    public Authentication(){


    }

}