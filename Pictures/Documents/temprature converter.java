import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.actionListner;

public class temprature converter{
public static void main(String[] args) {
jframe frame = new JFrame ("Degree celcius to fahrenheite converter");
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setSize(300,150);
JPanel panel = new JPanel();
frame.add(panel);
JLabel celsiusLabel = new JLabel("Enter Celsius:");
panel.add(celsiusLabel);
JTextField celsiusTextField = new JTextField(10);
panel.add(celsiusTextField);
JButton convertButton = new JButton("Convert");
panel.add(convertButton);
JLabel resultLabel = new JLabel("");
panel.add(resultLabel);
convertButton.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
try {
double celsius = Double.parseDouble(celsiusTextField.getText());
double fahrenheit = (celsius * 9/5) + 32;
resultLabel.setText(String.format("%.2f°C is %.2f°F", celsius, fahrenheit));
} catch (NumberFormatException ex) {
resultLabel.setText("Invalid input");
}
}
});
frame.setVisible(true);
}
}

