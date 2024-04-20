package app.tachi.view;

import java.awt.event.ActionListener;

import javax.swing.*;



public class View {
	

    public View() {
       
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TachiSettingsFrame().setVisible(true);
            }
        });
    	
    }

    
}
