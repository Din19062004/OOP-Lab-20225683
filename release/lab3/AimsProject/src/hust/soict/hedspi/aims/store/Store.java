package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.*;

public class Store {
	private DigitalVideoDisc itemInStore[] = new DigitalVideoDisc[20];
	private int qtyItem;
	
	public void addDVD(DigitalVideoDisc dvd) {
		itemInStore[qtyItem] = dvd;
		qtyItem++;
		System.out.println("The dvd has been added.");
		System.out.println();
	}
	
	public void removeDVD(DigitalVideoDisc dvd) {
		int index = -1;
		if(qtyItem < 0) {
			System.out.println("The store is empty.");
			System.out.println();
		}
		else {
			for(int i = 0; i < qtyItem; i++) {
				if(itemInStore[i].equals(dvd)) {
					index = i;
					break;
				}
			}
			if(index == -1) {
				System.out.println("The dvd hasn't in the store yet!");
				System.out.println();
			}
			else {
				for(int i = 0; i < qtyItem - 1; i++) {
					itemInStore[i] = itemInStore[i + 1];
					itemInStore[qtyItem - 1] = null;
					qtyItem--;
				}
				System.out.println("Remove successfully!");
				System.out.println();
			}
		}
	}
}
