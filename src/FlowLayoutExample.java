import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FlowLayoutExample extends JFrame {
    JLabel name = new JLabel("name");
    JTextField ftName = new JTextField(10);
    JButton btok = new JButton("ok");

    public FlowLayoutExample() {
        setLayout(new FlowLayout());
        add(name);
        add(ftName);
        add(btok);

        setSize(600, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}