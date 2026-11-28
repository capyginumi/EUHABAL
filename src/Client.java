package src;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.net.URL;

public class Client {
    private JPanel panelClient;
    private JTabbedPane tabPanelClient;
    private JRadioButton choicesButtonsCar;
    private JRadioButton choicesButtonMotorcycle;
    private JComboBox comboBox1;
    private JLabel logo;
    private JLabel iconMotorcyle;
    private JLabel iconCar;
    private JLabel iconAccountBalance;
    private JLabel iconCash;
    private JRadioButton choicesButtonCash;
    private JRadioButton choicesButtonAccountButton;
    private JLabel logoHistory;
    private JTable tableHistory;

    static void main(String[] args) {

        JFrame frame = new JFrame("Client");
        Client client = new Client();
        frame.setSize(450, 600);
        frame.setContentPane(client.panelClient);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        // STARTING FROM HERE, SETS THE ICONS FOR CAR, MOTORSCYLE, CASH, AND ACCOUNT BALANCE

        URL location = Client.class.getResource("/src/images/EURideLogo.png");
        ImageIcon icon = new ImageIcon(location);
        Image logo = icon.getImage().getScaledInstance(150,150, Image.SCALE_SMOOTH);


        client.logo.setIcon(new ImageIcon(logo));
        client.logo.setText("");
        client.logo.setOpaque(false);


        URL location2 = Client.class.getResource("/src/images/Vector.png");
        ImageIcon icon2 = new ImageIcon(location2);
        Image iconMotorcycle = icon2.getImage().getScaledInstance(39,31, Image.SCALE_SMOOTH);


        client.iconMotorcyle.setIcon(new ImageIcon(iconMotorcycle));
        client.iconMotorcyle.setText("");
        client.iconMotorcyle.setOpaque(false);


        URL locatio3 = Client.class.getResource("/src/images/Car.png");
        ImageIcon icon3 = new ImageIcon(locatio3);
        Image iconCar = icon3.getImage().getScaledInstance(39,31, Image.SCALE_SMOOTH);

        client.iconCar.setIcon(new ImageIcon(iconCar));
        client.iconCar.setText("");
        client.iconCar.setOpaque(false);


        URL locatio4 = Client.class.getResource("/src/images/cash.png");
        ImageIcon icon4 = new ImageIcon(locatio4);
        Image iconCash = icon4.getImage().getScaledInstance(39,31, Image.SCALE_SMOOTH);

        client.iconCash.setIcon(new ImageIcon(iconCash));
        client.iconCash.setText("");
        client.iconCash.setOpaque(false);


        URL locatio5 = Client.class.getResource("/src/images/AccountBalance.png");
        ImageIcon icon5 = new ImageIcon(locatio5);
        Image iconAccountBalance = icon5.getImage().getScaledInstance(39,31, Image.SCALE_SMOOTH);

        client.iconAccountBalance.setIcon(new ImageIcon(iconAccountBalance));
        client.iconAccountBalance.setText("");
        client.iconAccountBalance.setOpaque(false);

        client.logoHistory.setIcon(new ImageIcon(logo));
        client.logoHistory.setText("");
        client.logoHistory.setOpaque(false);

        // ENDS HERE....

        // GROUPED THE CHOICES BUTTON, TO PREVENT MULTIPLE SELECTION ON GROUPED BUTTONS

        ButtonGroup vehicleGroup = new ButtonGroup();

        vehicleGroup.add(client.choicesButtonsCar);
        vehicleGroup.add(client.choicesButtonMotorcycle);

        ButtonGroup paymentMethod = new ButtonGroup();
        paymentMethod.add(client.choicesButtonCash);
        paymentMethod.add(client.choicesButtonAccountButton);

        // CREATES THE HISTORY TABLE
        DefaultTableModel model = new DefaultTableModel();

        model.addColumn("Rider");
        model.addColumn("Contact");
        model.addColumn("Vehicle");
        model.addColumn("Date");
        model.addColumn("Destination");
        model.addColumn("Total");

        model.addRow(new Object[]{
                "John Doe",
                "09123456789",
                "Motorcycle",
                "11/28/2026",
                "SM City Lucena",
                50.00
        });

        client.tableHistory.setModel(model);

    }







}
