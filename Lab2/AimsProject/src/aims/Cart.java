package aims;
import java.util.ArrayList;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private ArrayList<DigitalVideoDisc> itemsOrdered =  new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered == 20) {
			System.out.println("Cannot add more DVDs, the cart is full.");
			return;
		}
		
		if (itemsOrdered.add(disc)) {
			qtyOrdered +=1;
			System.out.println("The disc has been successfully added.");
		} else {
			System.out.println("Something wrong happened. Please try again.");
		}
		
		if(qtyOrdered == 20) {
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
	
	public float totalCost() {
		float total = 0.0f;
		for (DigitalVideoDisc d : itemsOrdered) {
			total += d.getCost();
		}
		return total;
	}
	
}
