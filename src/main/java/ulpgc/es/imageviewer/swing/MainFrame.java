package ulpgc.es.imageviewer.swing;

import ulpgc.es.imageviewer.Command;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class MainFrame extends JFrame {
    private ImageDisplay imageDisplay;
    private final Map<String, Command> commands;

    public MainFrame() {
        this.commands = new HashMap<>();
        setTitle("Image Viewer");
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(createImageDisplay());
        add(createToolbar(), BorderLayout.SOUTH);
    }

    private Component createToolbar() {
        JPanel panel = new JPanel();
        panel.add(createButton("<"));
        panel.add(createButton(">"));
        return panel;
    }

    private Component createButton(String s) {
        JButton button = new JButton(s);
        button.addActionListener(e->commands.get(s).execute());
        return button;
    }

    private Component createImageDisplay() {
        SwingImageDisplay display = new SwingImageDisplay();
        this.imageDisplay = display;
        return display;
    }
}
