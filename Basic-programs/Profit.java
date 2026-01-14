public class Profit{
	public static void main(String[] args){
		double cp=129, sp=191;
		double profit = sp-cp;
		double pp = (profit/cp)*100;
		System.out.println("The Cost price is INR "+cp+" and Selling price is INR "+sp);
		System.out.printf("/n The Profit is INR %.0f and profit percentage is %.2f ",profit,pp);
}}
