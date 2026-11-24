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
        Authentication authentication = new Authentication();


        URL location = Authentication.class.getResource("/images/EURideLogo.png");
        ImageIcon icon = new ImageIcon(location);
        Image logoImage = icon.getImage().getScaledInstance(100,100, Image.SCALE_SMOOTH);

        authentication.logo.setIcon(new ImageIcon(logoImage));
        authentication.logo.setText("");
        authentication.logo.setHorizontalAlignment(SwingConstants.CENTER);
        authentication.logo.setVerticalAlignment(SwingConstants.CENTER);
        authentication.logo.setOpaque(false);




        //URL location2 = Authentication.class.getResource("/images/inputusername.png");
        //ImageIcon icon2 = new ImageIcon(location2);
        //Image bgInputUsername = icon2.getImage().getScaledInstance(387, 60, Image.SCALE_SMOOTH);



        authentication.inputUsername.setOpaque(false);
        authentication.inputUsername.setBackground(new Color(0, 0, 0, 0));

        authentication.inputPassword.setOpaque(false);
        authentication.inputPassword.setBackground(new Color(0, 0, 0, 0));








        JFrame frame = new JFrame("Authentication");
        frame.setSize(450, 600);
        frame.setContentPane(authentication.panelAuthentication);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }




    public Authentication(){


    }

}