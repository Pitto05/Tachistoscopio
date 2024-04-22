package app.tachi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import app.tachi.UIEventListener;
import app.tachi.model.Model;
import app.tachi.view.View;
import app.tachi.view.rightPnl.RightPanel;


public class Controller implements UIEventListener{
   
	
	private Model model;
    private View view;
    private RightPanel rightPnl;
    

    public Controller(Model model, View view, RightPanel rightPnl) {
        this.model = model;
        this.view = view;
        this.rightPnl = rightPnl;
        

        // Aggiunge il listener per l'evento di aggiornamento
        //this.view.addUpdateListener(new UpdateListener());
    }

    // Inner class per gestire l'evento di aggiornamento
    class UpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            
        	
        	
        }
    }

	@Override
	public void onButtonClicked(String buttonName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onSpinnerValueChanged(int value) {
		String valueAsString = String.valueOf(value);
		model.setGrandezza(value);
		rightPnl.getExpositionPanel().getnumMilli().setText(valueAsString);
		rightPnl.getExpositionPanel().repaint();
		System.out.println("ooooooo");
	}

    
}
