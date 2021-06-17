//Made by Fatima Zahra.
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class converter {
  static JFrame aFrame;
  JComboBox<String> currency = new JComboBox<>();
  JComboBox<String> currency_2 = new JComboBox<>();
  JButton convertMe;
  JButton cancel;
  JTextField amount;
  JTextField result_1;

  public void JFrame(){
    aFrame = new JFrame("Currency converter");
    final int WIDTH = 600;
    final int HEIGHT = 400;
    aFrame.setSize(WIDTH, HEIGHT);
    JPanel gui = new JPanel(new BorderLayout(3,3));
    gui.setBorder(new EmptyBorder(20,20,20,20));
    aFrame.setContentPane(gui);
    JLabel welcome = new JLabel("***Welcome to the FZAH Currency Converter***");
    welcome.setFont(new Font("Arial", Font.ITALIC, 22));
    JLabel askAmount = new JLabel("Convert this amount: ");
    amount = new JTextField(30);

    JLabel fromCurrency = new JLabel("From this currency: ");
    currency.addItem("British pound (GBP)");
    currency.addItem("U.S. dollar (USD)");
    currency.addItem("euro (EUR)");
    currency.addItem("Canadian dollar (CAD)");
    currency.addItem("Swiss franc (CHF)");
    currency.addItem("New Zealand dollar (NZD)");
    currency.addItem("Australian dollar (AUD)");
    currency.addItem("Japanese yen (JPY)");
    currency.addItem("South Korean won (KRW)");
    currency.addItem("Chinese Yuan (元/¥)");
    currency.addItem("Moroccan dirham (DH)");

    JLabel toCurrency = new JLabel("To this currency: ");
    currency_2.addItem("British pound (GBP)");
    currency_2.addItem("U.S. dollar (USD)");
    currency_2.addItem("euro (EUR)");
    currency_2.addItem("Canadian dollar (CAD)");
    currency_2.addItem("Swiss franc (CHF)");
    currency_2.addItem("New Zealand dollar (NZD)");
    currency_2.addItem("Australian dollar (AUD)");
    currency_2.addItem("Japanese yen (JPY)");
    currency_2.addItem("South Korean won (KRW)");
    currency_2.addItem("Chinese Yuan (元/¥)");
    currency_2.addItem("Moroccan dirham (DH)");

    JLabel result = new JLabel("Result ");
    result_1 = new JTextField(30);

    convertMe = new JButton("Convert");
    cancel = new JButton("Cancel");

    JLabel gap = new JLabel("\n");
    JLabel gap_1 = new JLabel("\n");
    JLabel gap_2 = new JLabel("\n");
    JLabel gap_3 = new JLabel("\n");
    JLabel gap_4 = new JLabel("\n");
    JLabel gap_5 = new JLabel("\n");


    aFrame.setLayout(new FlowLayout());
    aFrame.add(welcome);
    aFrame.add(gap_5);
    aFrame.add(askAmount);
    aFrame.add(amount);
    aFrame.add(gap_4);
    aFrame.add(fromCurrency);
    aFrame.add(currency);
    aFrame.add(gap_3);
    aFrame.add(toCurrency);
    aFrame.add(currency_2);
    aFrame.add(gap_2);
    aFrame.add(result);
    aFrame.add(result_1);
    aFrame.add(gap);
    aFrame.add(convertMe);
    aFrame.add(gap_1);
    aFrame.add(cancel);
    aFrame.setLayout(new GridLayout(17,1));
  }
  public void choice() {
    String choice1 = (String) currency.getSelectedItem();
    String choice2 = (String) currency_2.getSelectedItem();
    String userAmount  = amount.getText();

        if (convertMe.getModel().isPressed()) {
          assert choice1 != null;
          if (choice1.equals("British pound (GBP)")) {
            assert choice2 != null;
            if (choice2.equals("U.S. dollar (USD)")) {
              //result_1.setText("hello");
              convertMe.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                  String message = " Hello ";
                  result_1.setText(message);
                }
              });
              cancel.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                  String message2 = "HELLO";
                  JOptionPane.showMessageDialog(null, message2);
                }
              });
            }
          }
        }
      }
  public static void main(String[] args) {
    converter converter = new converter();
    converter.JFrame();
    aFrame.setVisible(true);
    converter.choice();
  }
}
