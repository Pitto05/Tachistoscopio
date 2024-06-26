package app.tachi.view.rightPnl;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;

import app.tachi.Main;
import app.tachi.UIEventListener;
import app.tachi.controller.Controller;

public class ExpositionPanel extends RightPanelBase {
    
	//private Controller listener;
	
	
    private JLabel numMilli = new JLabel();
    private JPanel centerPanel;
    SpinnerNumberModel spinnerModel = new SpinnerNumberModel(250, // Valore iniziale
            												250, // Valore minimo
            												10000, // Valore massimo
            												250); // Passo di incremento
    private JSpinner millesimi = new JSpinner(spinnerModel);
    private JToggleButton toggleButton = new JToggleButton("Si/No");
    
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
        
        
        millesimi.setName("Spinner Esposizione");
        millesimi.setPreferredSize(new Dimension(70, millesimi.getPreferredSize().height)); // Imposta la larghezza preferita per il JSpinner
        millesimi.addChangeListener(e -> {
            int value = (int) millesimi.getValue();
            spinnerValueChanged(value);
            
        });
        
        toggleButton.setText("No");
        toggleButton.setSelected(false);
        toggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    toggleButton.setText("On");
                    // Azioni da eseguire quando lo switch è acceso
                    toggleButtonChanged(true, null);
                } else {
                    toggleButton.setText("Off");
                    // Azioni da eseguire quando lo switch è spento
                    toggleButtonChanged(false, null);
                }
            }

			
        });
        
        
        centerPanel.add(millesimi);
        centerPanel.add(numMilli);
        centerPanel.add(toggleButton);
        
        add(centerPanel, BorderLayout.CENTER);
        
    }
	
	private void spinnerValueChanged(int value) {
        if (Main.controller != null) {
        	Main.controller.onSpinnerValueChanged(value, millesimi.getName());
        }
    }
	
	private void toggleButtonChanged(boolean b, String nome) {
		if (Main.controller != null) {
        	Main.controller.onToggleButtonChanged(b, null);
        }
	}
	
	public void updateNumMilliLabelText(String newText) {
        numMilli.setText(newText);
    }
	
	public JLabel getnumMilli() {
		return  numMilli;
	}
}
