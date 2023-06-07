package cart;

import java.util.ArrayList;
import java.util.List;
import media.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<DigitalVideoDisc> itemsOrdered =  new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered = 0;
	
	// Method Print	
	public void print() {
		String cartString = "\n************************************CART************************************\n\n";
		if(qtyOrdered == 0) {
			System.out.println("The cart is empty.");
		}
		for (int i = 0; i < qtyOrdered; i++ ) {
			DigitalVideoDisc d = itemsOrdered.get(i);
			String dCat = checkString(d.getCategory(), 15);
			String dD = checkString(d.getDirector(), 15);
			String dL = checkString(String.valueOf(d.getLength()), 3);
			String dCost = checkString(String.valueOf(d.getCost()), 5);
			cartString += String.valueOf(i+1) + ". DVD - " + String.format("%1$15s", d.getTitle()) + " - " + dCat 
						+ " - " + dD + " - " + dL + " - " + dCost +"$\n"
						;
		}
		cartString += "\n********************************CART************************************";
		System.out.println(cartString);
	}
	
	// Add Disc
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Cannot add more DVDs, the cart is full.");
			return;
		}
		
		if (itemsOrdered.add(disc)) {
			qtyOrdered +=1;
			System.out.println("The disc has been successfully added.");
		} else {
			System.out.println("Something wrong happened. Please try again.");
		}
		
		if(qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("Info: The cart is full.");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc[] discs) {
		int numDisc = discs.length;
		if (qtyOrdered + numDisc > MAX_NUMBERS_ORDERED) {
			System.out.println("Cannot add all select DVDs, the cart does not have enough space.");
			return;
		} else {
			for (DigitalVideoDisc d: discs) {
				addDigitalVideoDisc(d);
			}
		}
		
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if (qtyOrdered + 2 > MAX_NUMBERS_ORDERED) {
			System.out.println("The cart does not have enough space.");
			return;
		} else {
			addDigitalVideoDisc(disc1);
			addDigitalVideoDisc(disc2);
		}
	}
	
	// Remove Disc
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 0) {
			System.out.println("Cannot remove DVD, the cart is empty.");
			return;
		}
		
		if (itemsOrdered.remove(disc)) {
			qtyOrdered -=1;
			System.out.println("The disc has been successfully removed.");
		} else {
			System.out.println("Something wrong happened. Please try again.");
		}
		
		if(qtyOrdered == 0) {
			System.out.println("Info: The cart is empty.");
		}
		
	}
	
	
	// Calculate the total cost
	public float totalCost() {
		float total = 0.0f;
		for (DigitalVideoDisc d : itemsOrdered) {
			total += d.getCost();
		}
		return total;
	}
	
	public DigitalVideoDisc searchById(int id) {
		for (DigitalVideoDisc d: itemsOrdered) {
			if(d.getId() == id) {
				return d;
			}
		}
		System.out.println("No DVD matches the search ID.");
		return null;
	}
	
	public ArrayList<DigitalVideoDisc> searchByTitle(String... titles) {
		ArrayList<DigitalVideoDisc> res = new ArrayList<DigitalVideoDisc>();
		for (DigitalVideoDisc d: itemsOrdered) {
			if(isMatch(d.getTitle(), titles)) {
				res.add(d);
			}
		}
		if(res.size() == 0) {
			System.out.println("No DVD matches the search titles.");
			return null;
		}
		return res;
	}
	
	private String checkString(String str, int len) {
		String res = str.equals("0") ? "Unknown" : str;
		res = String.format("%1$" + len + "s", res);
		return res;
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
