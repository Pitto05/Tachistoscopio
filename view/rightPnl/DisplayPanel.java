package app.tachi.view.rightPnl;

import java.awt.BorderLayout;

import javax.swing.JLabel;

class DisplayPanel extends RightPanelBase {
    public void initialize() {
        setLayout(new BorderLayout());
        setOpaque(false);
        add(new JLabel("Impostazioni del Display"), BorderLayout.CENTER);
    }
    
}

