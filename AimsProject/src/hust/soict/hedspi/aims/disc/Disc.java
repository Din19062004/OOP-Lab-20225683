package hust.soict.hedspi.aims.disc;

import hust.soict.hedspi.aims.media.Media;

public class Disc extends Media {
	private int length;
	private String director;
	
	public Disc(int id, String title, String category, double cost,
			    int length, String director) {
		super(id, title, category, cost);
		this.length = length;
		this.director = director;
	}
	
	public int getLength() {
		return this.length;
	}
	
	public String getDirector() {
		return this.director;
	}
	
	@Override
	public String toString() {
		return super.toString() + 
				" - Length: " + this.length +
				" - Director: " + this.director;
	}
}
