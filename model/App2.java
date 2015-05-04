package model;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jc258876 on 4/05/15.
 */
public class App2 {
    private static JFrame mainFrame;
    private static Tally tally;

    public static void main(String[] args) {
        mainFrame = new JFrame();
        tally = new Tally();

        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel display = new JLabel("Tally: 0");
        final JButton one = new JButton("1");
        final JButton clear = new JButton("clear");

        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tally.increment();
                display.setText(tally.toString());
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tally.reset();
                display.setText(tally.toString());
            }
        });

        mainFrame.add(display, BorderLayout.NORTH);
        mainFrame.add(one, BorderLayout.CENTER);
        mainFrame.add(clear, BorderLayout.SOUTH);
        mainFrame.pack();
        mainFrame.setSize(250, 250);
        mainFrame.setVisible(true);
        mainFrame.setLocationRelativeTo(null);

    }
}
