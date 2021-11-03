package business;

import java.awt.Color;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

/**
 *
 * @author pradnya
 */
public class VerifierNumeric extends InputVerifier {
    
    @Override
    public boolean verify(JComponent input) {
        String text = ((JTextField) input).getText();
        if (text.length() > 0) {
            try {
                int i=Integer.parseInt(text);
                input.setBackground(Color.white);
                if(i<=0)
                {
                    input.setBackground(Color.red);
                    JOptionPane.showMessageDialog(input, "Positive value required"
                            + " integer value", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
                return true;
            } catch (NumberFormatException e) {
                input.setBackground(Color.red);
                JOptionPane.showMessageDialog(input, "Integer value required"
                        + " value", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } else {
            input.setBackground(Color.white);
            return true;
        }
    }
}
