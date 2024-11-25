package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.*;

public class CartTest {
	public static void main(String[] args) {
		//Create a new cart
		Cart cart = new Cart();
		
		//Create new dvd objects and add them to the cart
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation", "Roger Allers", 87, 19.95);
		cart.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", 
				"Science Fiction", "Geogre Lucas", 87, 24.95);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", 
				"Animation", 18.99);
		cart.addDigitalVideoDisc(dvd2, dvd3);
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Frozen", 
				"Animation", 24.99);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("The Lion King III",
				"Animation", 30.55);
		DigitalVideoDisc[] list = {dvd4, dvd5};
		cart.addDigitalVideoDisc(list);
		
		//Test the print method
		cart.print();
		
		//Test the search method (by title)
		cart.search("lion"); //Two items found
		cart.search("snow"); //No item found
		
		//Test the search method (by ID)
		cart.search(1); //One item found
		cart.search(9); //No item found
	}
}
