package eu.nsjg.programmingitems.simple;

public enum SimpleProgramingItem {

	CALCULATE("Sorozatsz�m�t�s: ", new Calculate()),
	DECIDE("Eld�nt�s: ", new Decide()), 
	SELECT("Kiv�laszt�s: ", new Select()),
	FIND("Keres�s: ", new Find()),
	COUNT("Megsz�ml�s: ", new Count()),
	MAX_VALUE("Maximum �rt�k: ",new Maxvalue());
	
	private final String description;
	private final SimpleProgramingItemStrategy item;

	private SimpleProgramingItem(String description, SimpleProgramingItemStrategy item) {
		this.description = description;
		this.item = item;
	}

	public String getDescription() {
		return description;
	}
	
	public SimpleProgramingItemStrategy getItem() {
		return item;
	}
}
	
	
	
