package app.tachi.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import app.tachi.Main;

public class PannelloVisualizzazione extends JPanel {
    private String word;
    private boolean showCircle;
    private JButton bottone;

    public PannelloVisualizzazione() {
        this.word = "";
        this.showCircle = false;
        
        bottone = new JButton("Avvio");
        
        bottone.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                bottonePremuto();
            }
        });
        
        add(bottone);
    }
    
    public void bottonePremuto() {
    	if (Main.controller != null) {
        	Main.controller.displayParola();
        }
    }

    // Metodo per impostare la parola da visualizzare
    public void setWord(String word) {
        this.word = word;
        repaint(); // Richiama il metodo paintComponent per aggiornare il disegno
    }

    // Metodo per attivare/disattivare la visualizzazione del cerchio
    public void setShowCircle(boolean showCircle) {
        this.showCircle = showCircle;
        repaint(); // Richiama il metodo paintComponent per aggiornare il disegno
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        System.out.println("qui");
        // Disegna il testo al centro del pannello
        g.setColor(Color.BLACK);
        FontMetrics fm = g.getFontMetrics();
        int x = (getWidth() - fm.stringWidth(word)) / 2;
        int y = ((getHeight() - fm.getHeight()) / 2) + fm.getAscent();
        g.drawString(word, x, y);

        // Se showCircle è true, disegna un cerchio rosso al centro del pannello
        if (showCircle) {
            g.setColor(Color.RED);
            int diameter = Math.min(getWidth(), getHeight()) - 20;
            x = (getWidth() - diameter) / 2;
            y = (getHeight() - diameter) / 2;
            g.fillOval(x, y, diameter, diameter);
        }
    }
    
    
    
}
