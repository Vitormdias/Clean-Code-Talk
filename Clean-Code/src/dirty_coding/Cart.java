package dirty_coding;

public class Cart {
	private String ttle;
	private double dscnt;
	private double t = 0;
	private Item[] items;
	public String getTtle() {
		return ttle;
	}
	public void setTtle(String ttle) {
		this.ttle = ttle;
	}
	public double getDscnt() {
		return dscnt;
	}
	public void setDscnt(double dscnt) {
		this.dscnt = dscnt;
	}
	public double getT() {
		setT();
		return t;
	}
	int i = 0;
	public void setT() {
		int j;
		for(j=0;j<i;j++) 
		{
			t += items[j].getPrce() * items[j].getQtt();
		}
		t -= dscnt;
	}
	public Item[] getItems() {
		return items;
	}
	public void setItems() {
		items = new Item[qtIt];
	}
	public void addItem(Item item) {
		if(i < qtIt)
		items[i++] = item;
	}
	private int qtIt;
	public int getQtIt() {
		return qtIt;
	}
	public void setQtIt(int qtIt) {
		this.qtIt = qtIt;
	}
	
}
