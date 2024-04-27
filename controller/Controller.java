package app.tachi.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingUtilities;

import app.tachi.Main;
import app.tachi.UIEventListener;
import app.tachi.model.Model;
import app.tachi.view.PannelloVisualizzazione;
import app.tachi.view.View;
import app.tachi.view.rightPnl.RightPanel;


public class Controller implements UIEventListener{
   
	
	private Model model;
    private View view;
    
    

    public Controller(Model model, View view) {
    	this.model = model;
    	this.view = view;
    	// Aggiunge il listener per l'evento di aggiornamento
    	//this.view.addUpdateListener(new UpdateListener());
    }

    // Inner class per gestire l'evento di aggiornamento
    class UpdateListener implements ActionListener {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    	}
    }

    public void onStart() {
    	//
    }

    public void displayParola() {
    	Model modelPerEsecuzione = new Model();
    	String[] parole = modelPerEsecuzione.getParole();
    	int durata = modelPerEsecuzione.getDuration();
    	
    	for(int i=0; i<parole.length; i++) {

    		view.getVisualPnl().setShowCircle(true);


    		// Attendi per la durata specificata
    		try {
    			Thread.sleep(durata);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}

    		view.getVisualPnl().setShowCircle(false);
    		
    		// Attendi per la durata specificata
    		try {
    			Thread.sleep(durata);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}

    		view.getVisualPnl().setWord(parole[i]);
    		
    		// Attendi per la durata specificata
    		try {
    			Thread.sleep(durata);
    		} catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    		
    		view.getVisualPnl().setWord(null);
    	}
    }

   /* // Metodo per visualizzare il cerchio per un certo periodo di tempo
    public void displayCircle(int duration) {
    	SwingUtilities.invokeLater(() -> {
    		view.displayCircle();
    	});

    	// Attendi per la durata specificata
    	try {
    		Thread.sleep(duration);
    	} catch (InterruptedException e) {
    		e.printStackTrace();
    	}

    	// Rimuovi il cerchio dopo il periodo di tempo specificato
    	SwingUtilities.invokeLater(() -> {
    		view.removeCircle();
    	});
    }*/


    
    
    //LISTENER•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••
    
    
    @Override
    public void onButtonClicked(String buttonName) {
    	// TODO Auto-generated method stub

    }

    @Override
    public void onSpinnerValueChanged(int value, String nome) {

    	if(nome == "Spinner Esposizione") {
    		String valueAsString = String.valueOf(value);
    		SwingUtilities.invokeLater(() -> {
    			view.getRPnl().getExpositionPanel().updateNumMilliLabelText(valueAsString);
    			model.setDuration(value);   
    		});
    		System.out.println(model.getDuration());
    	}

    	if(nome == "Spinner Dimensione") {
    		model.setGrandezza(value);
    		System.out.println(model.getGrandezza());
    	}


    }

    @Override
    public void onToggleButtonChanged(Boolean val, String nome) {
    	if(val==true) {
    		model.setPosFissa(false);
    	}else model.setPosFissa(true);
    }

	@Override
	public void onParoleInserite(String[] parole) {
		model.setParole(parole);
		
	}


}
