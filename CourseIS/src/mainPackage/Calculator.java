package mainPackage;

public class Calculator {
	
	public static double countnight;
	public static double countpeople;
	public static double constantatransport;
	public static double constantafood;
	public static double priceonetourist;
	public static double pricetransport;
	public static double pricefood;
	public static double procent;
	public static double tourcost;
	
	public double SetToutCost(double countnight, double countpeople, double constantatransport, double constantafood, double priceonetourist, double pricetransport, double pricefood, double procent) {
		double settourcost = 0;
		settourcost = ((priceonetourist * countnight * countpeople) + (pricetransport * countpeople * constantatransport) + (pricefood * countpeople * countnight * constantafood)) * procent;
		return settourcost;
		
	}

}