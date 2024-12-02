package hust.soict.hedspi.aims.book;

import java.util.List;

import hust.soict.hedspi.aims.media.Media;

import java.util.ArrayList;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	private static int nbBooks = 0;
	
	public Book(String title, String category, double cost,
			   List<String> authors) {
		super(nbBooks++, title, category, cost);
		this.authors = authors;
	}
	
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public void addAuthor(String authorName) {
		if(!authors.contains(authorName)) {
			authors.add(authorName);
			System.out.println(authorName + "has been added to the list!");
		}
		else {
			System.out.println(authorName + "has already in the list!");
		}
	}
	
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println(authorName + "has been removed from the list!");
		}
		else {
			System.out.println(authorName + "does not exist!");
		}
	}
	
	@Override
	public String toString() {
		return "Book " + super.toString()
				+ " - Authors: " + this.getAuthors();
	}
}
