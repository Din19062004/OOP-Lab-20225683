package hust.soict.hedspi.aims.disc;

public class Track implements Playable {
	private String title;
	private int length;
	
	public Track(String title, int length) {
		this.title = title;
		this.length = length;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public int getLength() {
		return this.length;
	}
	
	@Override
	public void play() {
		System.out.println("Play track: " + this.getTitle());
		System.out.println("Track's length: " + this.getLength());
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Track) {
			Track track = (Track) obj;
			if(this.title == track.title && this.length == track.length) {
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return "(" + "Title: " + this.title + " , Length: " + this.length + ")";
	}
}
