package Mid;

public class Weapon {

	private String Name;
	private int Damage;
	
  public Weapon(String Name, int Damage ) {
	  this.Name = Name;
	  this.Damage = Damage;
  }
	
	public String toString() {
		
		return "Weapon Name: " + Name+"\nWeapon Damage: "+Damage;
		
	}
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getDamage() {
		return Damage;
	}
	public void setDamage(int damage) {
		Damage = damage;
	}
}
