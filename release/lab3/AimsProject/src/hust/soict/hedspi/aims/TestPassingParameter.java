package hust.soict.hedspi.aims;
import hust.soict.hedspi.aims.disc.*;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	public static void swap(Object o1, Object o2) {
		Object temp = o1;
		o1 = o2;
		o2 = temp;
	}
	
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
	
	public static void newSwap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		String dvd1OldTitle = dvd1.getTitle();
		String dvd1OldCategory = dvd1.getCategory();
		String dvd1OldDirector = dvd1.getCategory();
		int dvd1OldLength = dvd1.getId();
		double dvd1OldCost = dvd1.getCost();
		int dvd1OldId = dvd1.getId();
		
		dvd1.setTitle(dvd2.getTitle());
		dvd1.setCategory(dvd2.getCategory());
		dvd1.setDirector(dvd2.getDirector());
		dvd1.setLength(dvd2.getLength());
		dvd1.setCost(dvd2.getCost());
		dvd1.setId(dvd2.getId());
		
		dvd2.setTitle(dvd1OldTitle);
		dvd2.setCategory(dvd1OldCategory);
		dvd2.setDirector(dvd1OldDirector);
		dvd2.setLength(dvd1OldLength);
		dvd2.setCost(dvd1OldCost);
		dvd2.setId(dvd1OldId);
	}
}
