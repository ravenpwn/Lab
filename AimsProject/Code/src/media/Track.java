package media;

public class Track implements Playable {
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
	
	//	Method Play
	public void play() {
		System.out.println("Playing track: " + getTitle());
		System.out.println("Track length: " + String.valueOf(getLength()));
	}
}

