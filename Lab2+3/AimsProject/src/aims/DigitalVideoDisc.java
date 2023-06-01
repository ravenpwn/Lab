package aims;

public class DigitalVideoDisc {
	private static int nbDigitalVideoDiscs = 0;
	public final int id;
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;
	
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
	public float getCost() {
		return cost;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public DigitalVideoDisc(String dvd_title, String dvd_category, String dvd_director, int dvd_length, float dvd_cost) {
		super();
		if(dvd_title.isBlank()) {
			title = "Unknown";
			System.out.println("Warning: DVD created without title.");
		} else {
			title = dvd_title;
		}
		category = dvd_category;
		director = dvd_director;
		length = dvd_length;
		cost = dvd_cost;
		id = nbDigitalVideoDiscs++;
	}
	
	public DigitalVideoDisc(String dvd_title) {
		this(dvd_title, "Unknown", "Unknown", 0, 0);
	}
	
	public DigitalVideoDisc(String dvd_title, String dvd_category, float dvd_cost) {
		this(dvd_title, dvd_category, "Unknown", 0, dvd_cost);
	}
	public DigitalVideoDisc(String dvd_title, String dvd_category, String dvd_director, float dvd_cost) {
		this(dvd_title, dvd_category, dvd_director, 0, dvd_cost);
	}
	
	public void print() {
		String res = title + " - " + category + " - " + director + " - " + String.valueOf(length) + " - " + String.valueOf(cost);
		System.out.println(res);
	}
	
	
}