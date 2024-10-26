package AimsPackage;

public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private double cost;
	
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	public double getCost() {
		return cost;
	}
	
	public DigitalVideoDisc(String title) {
		this.title = title;
	}
	
	public DigitalVideoDisc(String title, String category, double cost) {
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String director, double cost) {
		this.director = director;
		this.category = category;
		this.title = title;
		this.cost = cost;
	}
	
	public DigitalVideoDisc(String title, String category, String director, int length, double cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}
	
	public void displayDVDInformation() {
		System.out.println("Title: " + this.title);
		System.out.println("Category: " + this.category);
		System.out.println("Director: " + this.director);
		System.out.println("Length: " + this.length);
		System.out.println("Cost: " + this.cost);
		System.out.println();
	}
}
