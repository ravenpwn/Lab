package aims;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<DigitalVideoDisc> itemsOrdered =  new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered = 0;
	
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
	
	public float totalCost() {
		float total = 0.0f;
		for (DigitalVideoDisc d : itemsOrdered) {
			total += d.getCost();
		}
		return total;
	}
	
}
