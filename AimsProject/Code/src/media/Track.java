package media;

public class Track {
	private String title;
	private int length;
	
	//Getters
	public String getTitle() {
		return title;
	}

	public int getLength() {
		return length;
	}
	
	// Constructors
	public Track(String track_title, int track_length) {
		title = track_title;
		length = track_length;
	}
	public Track(String track_title) {
		this(track_title, 0);
	}
}
