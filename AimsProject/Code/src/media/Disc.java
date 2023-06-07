package media;

public class Disc extends Media {
	private int length;
	private String director;
	
	//	Getters
	public int getLength() {
		return length;
	}

	public String getDirector() {
		return director;
	}

	//	Constructors
	public Disc(String disc_title, String disc_category, String disc_director, int disc_length, float disc_cost) {
		super(disc_title, disc_category, disc_cost);
		director = disc_director;
		length = disc_length;
	}
	public Disc(String disc_title) {
		this(disc_title, "Unknown", "Unknown", 0, 0);
	}
	public Disc(String disc_title, String disc_category, float disc_cost) {
		this(disc_title, disc_category, "Unknown", 0, disc_cost);
	}
	public Disc(String disc_title, String disc_category, String disc_director, float disc_cost) {
		this(disc_title, disc_category, disc_director, 0, disc_cost);
	}
	
}
