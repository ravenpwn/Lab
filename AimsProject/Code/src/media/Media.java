package media;

public abstract class Media {
	private static int nbMedia = 0;
	private final int id;
	private String title;
	private String category;
	private float cost;
	
	//	Setters
	public void setTitle(String title) {
		this.title = title;
	}
	
	//	Getters
	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}
	
	public float getCost() {
		return cost;
	}

	//	Constructors
	public Media(String media_title, String media_category, float media_cost) {
		if(media_title.isBlank()) {
			title = "Unknown";
			System.out.println("Warning: Media created without title.");
		} else {
			title = media_title;
		}
		category = media_category;
		cost = media_cost;
		id = nbMedia++;
	}
	
	// Method Print
	public void print() {
		String res = getTitle() + " - " + getCategory() + " - " + String.valueOf(getCost());
		System.out.println(res);
	}
}
