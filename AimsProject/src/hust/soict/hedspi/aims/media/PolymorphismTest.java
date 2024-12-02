package hust.soict.hedspi.aims.media;

import hust.soict.hedspi.aims.book.*;

import hust.soict.hedspi.aims.disc.*;

import java.util.ArrayList;

public class PolymorphismTest {
	public static void main(String[] args) {
		ArrayList<Media> mediaList = new ArrayList<Media>();
		
	    ArrayList<String> authors = new ArrayList<String>();
	    authors.add("Sarah Rose Summer");
	    authors.add("Catriona Gray");
		Book b = new Book("Snow White", "Comic book", 50.99, authors);
	    
		ArrayList<Track> tracks = new ArrayList<Track>();
		Track track1 = new Track("Let it go", 30);
		Track track2 = new Track("Hero", 70);
		tracks.add(track1);
		tracks.add(track2);
		CompactDisc cd = new CompactDisc("Frozen", "Animation", 30.95, 200, "Elsa", "Diana Mendez", tracks);
		
		DigitalVideoDisc dvd = new DigitalVideoDisc("Snow white", "Animation", 40.15, 150, "Anna");
		
		mediaList.add(dvd);
		mediaList.add(cd);
		mediaList.add(b);
		
		for(Media m : mediaList) {
			System.out.println(m.toString());
		}
	}
}
