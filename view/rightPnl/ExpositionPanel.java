package app.tachi.view.rightPnl;

import java.awt.BorderLayout;

import javax.swing.JLabel;

public class ExpositionPanel extends RightPanelBase {
    public void initialize() {
        setLayout(new BorderLayout());
        setOpaque(false);
        add(new JLabel("Tempo di esposizione"), BorderLayout.NORTH);
    }
}
