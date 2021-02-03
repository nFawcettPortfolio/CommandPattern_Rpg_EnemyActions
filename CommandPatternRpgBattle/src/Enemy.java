public class Enemy {
	private String name = "Undead";
	private int atk = 8;
	private int def = 10;
	private int spellAtk = 7;
	
	public void attack() {
		System.out.println(name+" attacks for "+atk +" damage.");
	}
	public void defend() {
		System.out.println(name+" blocks  "+def +" damage.");
	}
	public void castSpell() {
		System.out.println(name+" casts a spell for "+spellAtk +" damage.");
	}
}
