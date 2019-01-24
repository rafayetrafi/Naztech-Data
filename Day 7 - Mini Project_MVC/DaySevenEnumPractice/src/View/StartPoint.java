package View;

import Controller.GiantController;
import Enum.Fatiqe;
import Enum.Health;
import Enum.Nourishment;
import Model.GiantModel;

public class StartPoint {

	public static void main(String[] args) {
		
		Health health = Health.Wounded;
		Fatiqe fatiqe = Fatiqe.Sleeping;
		Nourishment nourishment = Nourishment.Hungry;
		
		

		GiantView view = new GiantView();
		GiantModel model = new GiantModel(health, fatiqe, nourishment);
		
		
		
		GiantController controller = new GiantController(model, view);
		
		
		
		//view.displayGiant(model);
		
		
		controller.updateView();
		
		
		
	}

}
