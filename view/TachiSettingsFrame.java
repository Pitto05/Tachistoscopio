package app.tachi.view;

import javax.swing.*;

import app.tachi.view.leftPnl.LeftPanel;
import app.tachi.view.rightPnl.RightPanel;

import java.awt.*;
import java.awt.event.*;

public class TachiSettingsFrame extends JFrame {
    private LeftPanel leftPanel;
    private RightPanel rightPanel;

    public TachiSettingsFrame() {
        setTitle("Tachistoscopio");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(850, 670); 
        setResizable(false);
        setLocationRelativeTo(null);

        // Creazione dei pannelli
        leftPanel = new LeftPanel();
        rightPanel = new RightPanel();
        
        /*
        +	// Creazione dello split pane per dividere lo spazio
        +	JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        +	splitPane.setDividerLocation(200); // Imposta la posizione iniziale del divisore
		+
        +	add(splitPane);
        */
        
     // Creazione del contenitore per i pannelli
        Box container = Box.createHorizontalBox();

        // Impostazione della dimensione preferita per i pannelli
        leftPanel.setPreferredSize(new Dimension(275, 670)); // Imposta la dimensione preferita per il leftPanel
        rightPanel.setPreferredSize(new Dimension(575, 670)); // Imposta la dimensione preferita per il rightPanel

        // Aggiunta dei pannelli al contenitore
        container.add(leftPanel);
        container.add(rightPanel);

        // Aggiunta del contenitore al frame
        add(container);
        
    }

 // Metodo per ottenere il pannello destro
    public RightPanel getRightPanel() {
        return rightPanel;
    }
}

