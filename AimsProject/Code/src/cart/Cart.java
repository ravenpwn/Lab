package cart;

import java.util.ArrayList;
import java.util.List;
import media.DigitalVideoDisc;
import media.Media;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<Media> itemsOrdered =  new ArrayList<Media>();
	// Add Disc
	public void addMedia(Media media) {
		if (itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("Cannot add more DVDs, the cart is full.");
			return;
		}
		
		if (itemsOrdered.add(media)) {
			System.out.println("The disc has been successfully added.");
		} else {
			System.out.println("Something wrong happened. Please try again.");
		}
		
		if(itemsOrdered.size() == MAX_NUMBERS_ORDERED) {
			System.out.println("Info: The cart is full.");
		}
	}
	
	public void addMedia(Media ...media) {
		int numDisc = media.length;
		if (itemsOrdered.size() + numDisc > MAX_NUMBERS_ORDERED) {
			System.out.println("Cannot add all select DVDs, the cart does not have enough space.");
			return;
		} else {
			for (Media m: media) {
				addMedia(m);
			}
		}
		
	}
	
	// Remove Disc
	public void removeMedia(Media media) {
		if (itemsOrdered.size() == 0) {
			System.out.println("Cannot remove DVD, the cart is empty.");
			return;
		}
		
		if (itemsOrdered.remove(media)) {
			System.out.println("The disc has been successfully removed.");
		} else {
			System.out.println("Something wrong happened. Please try again.");
		}
		
		if(itemsOrdered.size() == 0) {
			System.out.println("Info: The cart is empty.");
		}
		
	}
	
	
	// Calculate the total cost
	public float totalCost() {
		float total = 0.0f;
		for (Media m : itemsOrdered) {
			total += m.getCost();
		}
		return total;
	}
	
	public Media searchById(int id) {
		for (Media m: itemsOrdered) {
			if(m.getId() == id) {
				return m;
			}
		}
		System.out.println("No media matches the search ID.");
		return null;
	}
	
	public ArrayList<Media> searchByTitle(String... titles) {
		ArrayList<Media> res = new ArrayList<Media>();
		for (Media d: itemsOrdered) {
			if(isMatch(d.getTitle(), titles)) {
				res.add(d);
			}
		}
		if(res.size() == 0) {
			System.out.println("No media matches the search titles.");
			return null;
		}
		return res;
	}
	
	// Method Print	
	public void print() {
		String cartString = "\n************************************CART************************************\n";
		System.out.println(cartString);
		if(itemsOrdered.size() == 0) {
			System.out.println("The cart is empty.");
		}
		for (int i = 0; i < itemsOrdered.size(); i++ ) {
			Media m = itemsOrdered.get(i);
			System.out.print(String.valueOf(i+1) + ". ");
			m.print();
		}
		System.out.println(cartString);
	}
	
	
	private boolean isMatch(String title, String[] searchTitles) {
		for (String t: searchTitles) {
			if(title.contains(t)) {
				return true;
			}
		}
		return false;
	}
	
	
	
	
}
