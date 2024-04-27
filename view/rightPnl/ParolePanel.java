package app.tachi.view.rightPnl;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import app.tachi.Main;

public class ParolePanel extends RightPanelBase {
    
	public void initialize() {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // Organizza i componenti in una colonna
        setOpaque(false);

        JLabel label = new JLabel("Parole");
        label.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra il JLabel nella colonna
        add(label);

        JTextField textField = new JTextField(20);
        textField.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra la JTextField nella colonna
        add(textField);

        JButton submitButton = new JButton("Carica Parole");
        submitButton.setAlignmentX(Component.CENTER_ALIGNMENT); // Centra il pulsante nella colonna

        // Azione da eseguire quando viene premuto il pulsante
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Ottenere il testo dalla casella di testo
                String inputText = textField.getText();

                // Dividere il testo in parole utilizzando lo spazio come delimitatore
                String[] words = inputText.split("\\s+");
                
                Main.controller.onParoleInserite(words);

                // Stampa delle parole per debug
                System.out.println("Array di stringhe inserito:");
                System.out.println(Arrays.toString(words));
            }
        });
        add(submitButton);
    }
    
}
