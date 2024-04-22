package app.tachi.view.rightPnl;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;

import app.tachi.Main;
import app.tachi.UIEventListener;
import app.tachi.controller.Controller;

public class ExpositionPanel extends RightPanelBase {
    
	private Controller listener;
	
	private JSpinner millesimi = new JSpinner();
    private JLabel numMilli = new JLabel();
    private JPanel centerPanel;
;	
	public void initialize() {
        setLayout(new BorderLayout());
        setOpaque(false);
        add(new JLabel("Tempo di esposizione"), BorderLayout.NORTH);
       
     // Creazione di un JPanel per contenere millesimi e numMilli
        centerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        centerPanel.setOpaque(false); // Assicura che il pannello interno sia trasparente

        
        numMilli.setOpaque(true); 
        numMilli.setBackground(Color.YELLOW);
        numMilli.setText("prova");
        
        
        millesimi.setPreferredSize(new Dimension(70, millesimi.getPreferredSize().height)); // Imposta la larghezza preferita per il JSpinner
        millesimi.addChangeListener(e -> {
            int value = (int) millesimi.getValue();
            spinnerValueChanged(value);
            numMilli.repaint();
        });
        
        
        centerPanel.add(millesimi);
        centerPanel.add(numMilli);
        
        add(centerPanel, BorderLayout.CENTER);
        
    }
	
	private void spinnerValueChanged(int value) {
        if (Main.controller != null) {
        	Main.controller.onSpinnerValueChanged(value);
        }
    }
	
	public JLabel getnumMilli() {
		return  numMilli;
	}
}
