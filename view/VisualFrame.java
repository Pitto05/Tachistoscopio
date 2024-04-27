package app.tachi.view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;

import javax.swing.Box;
import javax.swing.JFrame;

import app.tachi.view.leftPnl.LeftPanel;
import app.tachi.view.rightPnl.RightPanel;

public class VisualFrame extends JFrame{
	private PannelloVisualizzazione visualPnl;
	
	public VisualFrame() {
        setTitle("Tachistoscopio");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1200, 800); 
        setResizable(true);
        setLocationRelativeTo(null);

        visualPnl = new PannelloVisualizzazione();        
       
     // Imposta il layout del frame su BorderLayout
        setLayout(new BorderLayout());

        // Aggiunge il pannello come componente centrale
        add(visualPnl, BorderLayout.CENTER);
        
    }
	
	
}
