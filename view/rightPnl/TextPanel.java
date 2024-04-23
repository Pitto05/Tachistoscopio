package app.tachi.view.rightPnl;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import app.tachi.Main;
import app.tachi.UIEventListener;

class TextPanel extends RightPanelBase implements ActionListener{
	
	
    
	private JLabel sizeLabel;
	SpinnerNumberModel spinnerModel = new SpinnerNumberModel(15, // Valore iniziale
			3, // Valore minimo
			40, // Valore massimo
			1); // Passo di incremento
	private JSpinner sizeSpinner = new JSpinner(spinnerModel);
	private JLabel titleLabel;
	private JPanel settingsPanel;
	private JLabel fontLabel;
	private String[] fontNames;
	private JComboBox<String> fontComboBox;
	private JLabel colorLabel;
	private JButton colorButton;
	private JLabel caseLabel;
	private JRadioButton upperCaseRadioButton;
	private JRadioButton lowerCaseRadioButton;
	private ButtonGroup caseButtonGroup;
	
	public void initialize() {
        setLayout(new BorderLayout());
        setOpaque(false);

        // Titolo del pannello
        titleLabel = new JLabel("Impostazioni del testo");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18)); // Imposta il font e la dimensione del titolo
        add(titleLabel, BorderLayout.NORTH);
        /*
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * 
         * */
        // Pannello per gli strumenti di impostazione del testo
        settingsPanel = new JPanel(new GridLayout(0, 1));
        settingsPanel.setOpaque(false);

        // Aggiungi componenti per impostare la dimensione del testo
        sizeLabel = new JLabel("Dimensione del testo:");
        sizeSpinner.setName("Spinner Dimensione");
        settingsPanel.add(sizeLabel);
        settingsPanel.add(sizeSpinner);
        sizeSpinner.addChangeListener(e -> {
            int value = (int) sizeSpinner.getValue();
            spinnerValueChanged(value);
        });

        // Aggiungi componenti per impostare il font del testo
        fontLabel = new JLabel("Font del testo:");
        fontNames = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        fontComboBox = new JComboBox<>(fontNames); // ComboBox per selezionare il font del testo
        settingsPanel.add(fontLabel);
        settingsPanel.add(fontComboBox);
        

        // Aggiungi componenti per impostare il colore del testo
        colorLabel = new JLabel("Colore del testo:");
        colorButton = new JButton("Seleziona colore"); // Bottone per selezionare il colore del testo
        settingsPanel.add(colorLabel);
        settingsPanel.add(colorButton);

        // Aggiungi componenti per impostare il tipo di testo (Upper case o Lower case)
        caseLabel = new JLabel("Tipo di testo:");
        upperCaseRadioButton = new JRadioButton("Upper case"); // Radio button per selezionare il tipo di testo
        lowerCaseRadioButton = new JRadioButton("Lower case");
        caseButtonGroup = new ButtonGroup();
        caseButtonGroup.add(upperCaseRadioButton);
        caseButtonGroup.add(lowerCaseRadioButton);
        settingsPanel.add(caseLabel);
        settingsPanel.add(upperCaseRadioButton);
        settingsPanel.add(lowerCaseRadioButton);

        add(settingsPanel, BorderLayout.CENTER);
    }
	
	


   
	// Metodo chiamato quando il valore del JSpinner cambia
    private void spinnerValueChanged(int value) {
        if (Main.controller != null) {
        	Main.controller.onSpinnerValueChanged(value, "Spinner Dimensione");
        }
    }
	
	
	// Metodo chiamato quando un pulsante viene premuto
    private void buttonClicked(String buttonName) {
        if (Main.controller != null) {
            Main.controller.onButtonClicked(buttonName);
        }
    }
	
	
    
    public int getGrandezza() {
    	int size = (int) sizeSpinner.getValue();
    	return size;
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// Gestisci gli eventi dei pulsanti qui
        if (e.getActionCommand().equals("Seleziona colore")) {
            // Codice per gestire l'evento del pulsante "Seleziona colore"
            // Ad esempio, apri una finestra di dialogo per selezionare il colore
        }
	}
}