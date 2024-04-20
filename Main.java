package app.tachi;

import app.tachi.controller.Controller;
import app.tachi.model.Model;
import app.tachi.view.View;

public class Main {

	public static void main(String[] args) {
		Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        
        
        int i = 100000000;
        
        do {
        	
        	System.out.println(model.toString());
        	
        }while(i>0);
        
	}

}
