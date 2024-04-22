package app.tachi;

import app.tachi.controller.Controller;
import app.tachi.model.Model;
import app.tachi.view.View;
import app.tachi.view.rightPnl.RightPanel;

public class Main {

	public static Controller controller;
	
	public static void main(String[] args) {
		Model model = new Model();
        View view = new View();
        RightPanel rightPnl = new RightPanel();
        
        controller = new Controller(model, view, rightPnl);
        
        
        
        
	}

}
