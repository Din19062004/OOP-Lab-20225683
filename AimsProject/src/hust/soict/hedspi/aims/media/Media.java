package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
	private int id;
	private String title;
	private String category;
	private double cost;
	public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
	public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();
	
	public Media(int id, String title, String category, double cost) {
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

	public double getCost() {
		return cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Media) {
			Media media = (Media) obj;
			if(this.title == media.title) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "Title: " + this.title
				+ " - Category: " + this.category
				+ " - Cost: " + this.cost + "$";
	}
	
	public boolean isMatch(String keywords) {
		String[] splitKeywords = keywords.toLowerCase().split("\\s+");
		String toLowerTitle = this.title.toLowerCase();
		for(String s : splitKeywords) {
			if(toLowerTitle.contains(s)) {
				return true;
			}
		}
		return false;
	}
}
