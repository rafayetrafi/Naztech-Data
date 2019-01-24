package Controller;

import Enum.Fatiqe;
import Enum.Health;
import Enum.Nourishment;
import Model.GiantModel;
import View.GiantView;

public class GiantController {
	
	
//	Health health;
//	Fatiqe fatiqe;
//	Nourishment nourishment;
	
	
	GiantModel model = new GiantModel();
	GiantView view = new GiantView();
	
	public GiantController(GiantModel model, GiantView view) {
		super();
		this.model = model;
		this.view = view;
	}

	public void updateView()
	{
		view.displayGiant(model);
	}

	
	
	
}
