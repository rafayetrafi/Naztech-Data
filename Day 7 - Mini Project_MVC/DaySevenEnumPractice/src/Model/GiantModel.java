package Model;

import Enum.Fatiqe;
import Enum.Health;
import Enum.Nourishment;

public class GiantModel{
	
	//private Health health;
	
	
	private Health health;
	private Fatiqe fatiqe;
	private Nourishment nourishment;
	
	
	public GiantModel()
	{
		
	}
	
	
	
	public GiantModel(Health health, Fatiqe fatiqe, Nourishment nourishment) {
		super();
		this.health = health;
		this.fatiqe = fatiqe;
		this.nourishment = nourishment;
	}
	public Health getHealth() {
		return health;
	}
	public void setHealth(Health health) {
		this.health = health;
	}
	public Fatiqe getFatiqe() {
		return fatiqe;
	}
	public void setFatiqe(Fatiqe fatiqe) {
		this.fatiqe = fatiqe;
	}
	public Nourishment getNourishment() {
		return nourishment;
	}
	public void setNourishment(Nourishment nourishment) {
		this.nourishment = nourishment;
	}
	
	@Override
	public String toString() {
		return "GiantModel [health=" + health + ", fatiqe=" + fatiqe + ", nourishment=" + nourishment + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
