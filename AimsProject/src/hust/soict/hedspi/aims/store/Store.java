package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.media.*;

import java.util.ArrayList;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	public void addMedia(Media media) {
		if(itemsInStore.contains(media)) {
			System.out.println("Has already in the list!");
		}
		else {
			itemsInStore.add(media);
			System.out.println("Add successfully!");
		}
	}
	
	public void removeMedia(Media media) {
		if(itemsInStore.contains(media)) {
			itemsInStore.remove(media);
			System.out.println("Remove successfully");
		}
		else {
			System.out.println("Not in the list yet!");
		}
	}
	
	public Media searchItemInStore(String keywords) {
		for(Media m : itemsInStore) {
			if(m.getTitle().contains(keywords)) {
				System.out.println("Found: " + m.toString());
				return m;
			}
		}
		System.out.println("No item found");
		return null;
	}
}
