package listSort;

public class Prop {

	String host;
	int price;
	int rev;
	int minNight;
	

	public Prop(String host, int price, int rev, int minNight) {
		this.host = host;
		this.price = price;
		this.minNight = minNight;
	}
	
	public String getHost() {
		return host;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getValues() {
		 String listingString =  "Host: " + host + "\n" + 
	                "Price per Night: " + price + "\n" + 
	                "Number of Reviews: " + rev + "\n" + 
	                "Minimum Nights: " + minNight;
		 return listingString;
	}
}
