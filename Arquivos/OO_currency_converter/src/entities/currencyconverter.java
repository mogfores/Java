package entities;

public class currencyconverter {
	
	public static double IOF = 1.06;

	public double price;
	public double how_many;
	
	
	public double amount() {
		return price * how_many * IOF;
	}
}
