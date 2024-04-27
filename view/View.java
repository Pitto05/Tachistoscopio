package app.tachi.view;

import java.awt.event.ActionListener;

import javax.swing.*;

import app.tachi.view.rightPnl.RightPanel;



public class View {
	
	public TachiSettingsFrame mainFrame;
	public PannelloVisualizzazione visualFrame;

    public View() {
       
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	mainFrame = new TachiSettingsFrame();
            	mainFrame.setVisible(true);
            }
        });
    	
    }
    
    public RightPanel getRPnl() {
    	return mainFrame.getRightPanel();
    }

    public PannelloVisualizzazione getVisualPnl() {
    	return visualFrame;
    }
}
