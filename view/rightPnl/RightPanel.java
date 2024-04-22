package app.tachi.view.rightPnl;

import javax.swing.*;

import java.awt.*;

import javax.swing.*;
import java.awt.*;


public class RightPanel extends JPanel {
    private CardLayout cardLayout;
    private TextPanel textPanel;
    private ExpositionPanel expositionPanel;
    private DisplayPanel displayPanel;

    public RightPanel() {
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        setBackground(Color.WHITE);
        createSettingsPages();
    }

    private void createSettingsPages() {
        textPanel = new TextPanel();
        textPanel.initialize();

        expositionPanel = new ExpositionPanel();
        expositionPanel.initialize();

        displayPanel = new DisplayPanel();
        displayPanel.initialize();

        add(textPanel, "Testo");
        add(expositionPanel, "Esposizione");
        add(displayPanel, "Display");
    }

    public void showPage(String pageName) {
        cardLayout.show(this, pageName);
    }
    
    public TextPanel getTextPanel() {
        return textPanel;
    }
    
    public ExpositionPanel getExpositionPanel() {
    	return expositionPanel;
    }
    
    
}


