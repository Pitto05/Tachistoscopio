package app.tachi.view.leftPnl;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

import app.tachi.view.PannelloVisualizzazione;
import app.tachi.view.TachiSettingsFrame;
import app.tachi.view.VisualFrame;

public class LeftPanel extends JPanel {
    
	VisualFrame frameVisualizzazione;
	
	public LeftPanel() {
        //setLayout(new GridLayout(0, 1, 100, 100));
    	//setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    	setLayout(null);
        createButtons();
        //setPreferredSize(new Dimension(275, 670)); // Imposta la dimensione preferita per il pannello di sinistra
    }

    private void createButtons() {
        JButton textButton = new JButton("Testo");
        JButton expositionButton = new JButton("Esposizione");
        JButton displayButton = new JButton("Display");
        JButton paroleButton = new JButton("Parole");
        JButton startButton = new JButton("Avvio");
        
       
     // Impostazione della dimensione e posizione per i bottoni
        textButton.setBounds(10, 10, 250, 40);
        expositionButton.setBounds(10, 60, 250, 40);
        displayButton.setBounds(10, 110, 250, 40);
        paroleButton.setBounds(10, 160, 250, 40);
        startButton.setBounds(10, 593, 250, 40);

        
     
        

        // Creazione di un bordo vuoto con margine
        Border emptyBorder = BorderFactory.createEmptyBorder(10, 20, 10, 20); // Imposta i margini (top, left, bottom, right)

        // Applicazione del bordo e del colore di sfondo bianco ai bottoni

        //textButton.setBorder(emptyBorder);
        //generalButton.setBackground(Color.WHITE);
        textButton.setOpaque(true);
        //textButton.setContentAreaFilled(false);
        textButton.setBorderPainted(false);

        //expositionButton.setBorder(emptyBorder);
        //expositionButton.setBackground(Color.WHITE);
        expositionButton.setOpaque(true);
        //expositionButton.setContentAreaFilled(false);
        expositionButton.setBorderPainted(false);

        //displayButton.setBorder(emptyBorder);
        //displayButton.setBackground(Color.WHITE);
        displayButton.setOpaque(true);
        //displayButton.setContentAreaFilled(false);
        displayButton.setBorderPainted(false);
        
        paroleButton.setOpaque(true);
        paroleButton.setBorderPainted(false);
        
        
        startButton.setBorder(emptyBorder);
        startButton.setBackground(Color.BLACK); // Imposta il colore di sfondo nero per il pulsante fullscreen
        startButton.setForeground(Color.WHITE); // Imposta il colore del testo bianco per il pulsante fullscreen
        startButton.setOpaque(true);
        startButton.setBorderPainted(false);

        ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String command = e.getActionCommand();
                TachiSettingsFrame frame = (TachiSettingsFrame) SwingUtilities.getWindowAncestor(LeftPanel.this);
                frame.getRightPanel().showPage(command);
            }
        };
        
        

        textButton.addActionListener(listener);
        expositionButton.addActionListener(listener);
        displayButton.addActionListener(listener);
        paroleButton.addActionListener(listener);
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Creazione di una nuova finestra utilizzando la classe NewFrame
                
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
                    	frameVisualizzazione = new VisualFrame();
                    	frameVisualizzazione.setVisible(true);
                    }
                });
            }
        });

        add(textButton);
        add(expositionButton);
        add(displayButton);
        add(paroleButton);
        add(startButton);
    }

	public VisualFrame getFrameVisualizzazione() {
		return frameVisualizzazione;
	}
    
    
}
