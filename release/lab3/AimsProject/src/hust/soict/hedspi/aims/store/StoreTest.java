package hust.soict.hedspi.aims.store;

import hust.soict.hedspi.aims.disc.*;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");

        // Thêm DVD vào store
        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.addDVD(dvd3);

        // Xóa DVD khỏi store
        store.removeDVD(dvd2); // Xóa "Star Wars"
        store.removeDVD(new DigitalVideoDisc("Avatar")); // Xóa DVD không tồn tại
	}
}
