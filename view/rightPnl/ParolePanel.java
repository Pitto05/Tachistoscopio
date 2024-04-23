package app.tachi.view.rightPnl;

import java.awt.BorderLayout;

import javax.swing.JLabel;

public class ParolePanel extends RightPanelBase {
    public void initialize() {
        setLayout(new BorderLayout());
        setOpaque(false);
        add(new JLabel("Parole"), BorderLayout.CENTER);
    }
    
}
