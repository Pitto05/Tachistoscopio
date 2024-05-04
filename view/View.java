package app.tachi.view;

import java.awt.event.ActionListener;

import javax.swing.*;

import app.tachi.view.rightPnl.RightPanel;



public class View {
	
	public TachiSettingsFrame mainFrame;
	//public VisualFrame visualFrame;
	//public PannelloVisualizzazione visualPnl;

    public View() {
       
    	SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	mainFrame = new TachiSettingsFrame();
            	mainFrame.setVisible(true);
            	
            }
        });
    	
    }
    
    public VisualFrame getVisualFrame() {
		return mainFrame.getLeftPanel().getFrameVisualizzazione();
	}


	public RightPanel getRPnl() {
    	return mainFrame.getRightPanel();
    }

    
}
