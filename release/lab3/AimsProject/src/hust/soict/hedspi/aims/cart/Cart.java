package hust.soict.hedspi.aims.cart;

import hust.soict.hedspi.aims.disc.*;

public class Cart {
	private static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemOrdered[qtyOrdered] = disc;
			System.out.println("The disc has been added.");
			qtyOrdered++;
		}
		else {
			System.out.println("The cart is almost full!");
			System.out.println();
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED - 2) {
			itemOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			itemOrdered[qtyOrdered] = dvd2;
			qtyOrdered++;
			System.out.println("The two DVDs have been added!");
		}
		else if(qtyOrdered == MAX_NUMBERS_ORDERED - 2) {
			itemOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			System.out.println("The first DVD has been added.");
			System.out.println("The cart is almost full! Cannot add the second DVD to cart.");
			System.out.println();
		}
		else {
			System.out.println("The cart is almost full!");
			System.out.println();
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		for(DigitalVideoDisc dvd : dvdList) {
			if(qtyOrdered < MAX_NUMBERS_ORDERED) {
				itemOrdered[qtyOrdered] = dvd;
				qtyOrdered++;
				System.out.println("The DVD has been added.");
			}
			else {
				System.out.println("The cart is almost full!");
			}
		}
		System.out.println();
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int index = -1;
		if(this.qtyOrdered < 0) {
			System.out.println("The cart is empty!");
			System.out.println();
		}
		else {
			for(int i = 0; i < this.qtyOrdered; i++) {
				if(this.itemOrdered[i].equals(disc)) {
					index = i;
					break;
				}
			}
			
			if(index != -1) {
				for(int i = index; i < qtyOrdered - 1; i++) {
					this.itemOrdered[i] = this.itemOrdered[i + 1];
				}
				this.itemOrdered[this.qtyOrdered - 1] = null;
				this.qtyOrdered--;
				System.out.println("The disc has been removed.");
				System.out.println();
			}
			
			else {
				System.out.println("The disc is not in the cart!");
				System.out.println();
			}
			
		}
	}
	
	public double totalCost() {
		double sum = 0;
		for(int i = 0; i < this.qtyOrdered; i++) {
			sum += this.itemOrdered[i].getCost();
		}
		return sum;
	}
	
	//Method to print the cart
	public void print() {
		System.out.println("************************CART************************");
		System.out.println("Ordered Items");
		for(int i = 0; i < qtyOrdered; i++) {
			System.out.println((i + 1) + ". " + itemOrdered[i].toString());
		}
		System.out.println("Total cost: " + totalCost() + "$");
		System.out.println("****************************************************");
	}
	
	//Method to search DVD by title
	public void search(String keywords) {
		int matchItem = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemOrdered[i].isMatch(keywords)) {
				matchItem++;
				System.out.println(itemOrdered[i].toString());
			}
		}
		if(matchItem == 0) {
			System.out.println("No item found!");
		}
	}
	
	//Method to search DVD by ID
	public void search(int ID) {
		int matchItem = 0;
		for(int i = 0; i < qtyOrdered; i++) {
			if(itemOrdered[i].getId() == ID) {
				matchItem++;
				System.out.println(itemOrdered[i].toString());
			}
		}
		if(matchItem == 0) {
			System.out.println("No item found!");
		}
	}
}

