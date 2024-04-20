package app.tachi.view.rightPnl;

import javax.swing.*;

import java.awt.*;

import javax.swing.*;
import java.awt.*;


public class RightPanel extends JPanel {
    private CardLayout cardLayout;

    public RightPanel() {
        cardLayout = new CardLayout();
        setLayout(cardLayout);
        setBackground(Color.WHITE);
        createSettingsPages();
    }

    private void createSettingsPages() {
        TextPanel textPanel = new TextPanel();
        textPanel.initialize();

        ExpositionPanel expositionPanel = new ExpositionPanel();
        expositionPanel.initialize();

        DisplayPanel displayPanel = new DisplayPanel();
        displayPanel.initialize();

        add(textPanel, "Testo");
        add(expositionPanel, "Esposizione");
        add(displayPanel, "Display");
    }

    public void showPage(String pageName) {
        cardLayout.show(this, pageName);
    }
}


