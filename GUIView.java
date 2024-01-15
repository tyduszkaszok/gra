import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUIView {
    private JFrame frame;
    private JLabel label;
    private JPanel panel;

    public GUIView() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Kółko i krzyżyk");
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.getContentPane().setBackground(new Color(197, 88, 113));

        label = new JLabel("Miłej gierki");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.TOP);
        label.setForeground(new Color(74, 0, 178));
        label.setFont(new Font("Courier New", Font.BOLD, 16));

        panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0)); // FlowLayout z centrowaniem
        panel.setBackground(Color.BLACK);

        Border border = BorderFactory.createLineBorder(new Color(139, 0, 178), 5);
        label.setBorder(border);

        frame.setLayout(new BorderLayout());
        frame.add(label, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.setVisible(true);
    }



    public void display() {
        frame.setVisible(true);
    }
}
