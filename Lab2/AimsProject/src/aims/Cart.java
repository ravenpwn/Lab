package aims;

import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<DigitalVideoDisc> itemsOrdered =  new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered = 0;
	
<<<<<<< Updated upstream
=======
	// toString method
	
	public String toString() {
		String cartString = "***********************CART***********************\n";
		if(qtyOrdered == 0) {
			return "The cart is empty.";
		}
		for (int i = 0; i < qtyOrdered; i++ ) {
			DigitalVideoDisc d = itemsOrdered.get(i);
			String dCat = checkString(d.getCategory());
			String dD = checkString(d.getDirector());
			String dL = checkString(String.valueOf(d.getLength()));
			String dCost = checkString(String.valueOf(d.getCost()));
			cartString += String.valueOf(i) + ". DVD - " + String.format("%1$15s", d.getTitle()) + " - " + dCat 
						+ " - " + dD + " - " + dL + " - " + dCost +"$\n";
		}
		return cartString;
	}
	
	// Add Disc
>>>>>>> Stashed changes
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
	
	private String checkString(String str) {
		String res = (str.isEmpty() || str.equals("0")) ? "Unknown" : str;
		res = String.format("%1$15s", res);
		return res;
	}
	
	
	
	
}
