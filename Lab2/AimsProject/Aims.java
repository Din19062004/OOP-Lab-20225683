package AimsPackage;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99);
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Frozen", "Animation", 19.20);
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);

		System.out.println("Total cost is: " + anOrder.totalCost());
		//Test the method removeDigitalVideoDisc(DigitalVideoDisc disc)
		anOrder.removeDigitalVideoDisc(dvd1);   //Remove dvd1 (successfully remove)
		anOrder.removeDigitalVideoDisc(dvd2);   //Remove dvd2 (successfully remove)
		anOrder.removeDigitalVideoDisc(dvd4);   //Remove dvd4 (not in the current cart)
		anOrder.removeDigitalVideoDisc(dvd3);   //Remove dvd3 (successfully remove)
	}
}
