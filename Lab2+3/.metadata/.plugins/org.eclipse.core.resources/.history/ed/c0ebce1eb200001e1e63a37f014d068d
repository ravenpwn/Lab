package aims;

import java.util.ArrayList;

public class Store {
	private ArrayList<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	
	public DigitalVideoDisc[] getItemsInStore() {
		
		DigitalVideoDisc[] res = new DigitalVideoDisc[itemsInStore.size()];
		if(itemsInStore.size() == 0) {
			return null;
		}
		res = itemsInStore.toArray(res);
		return res;
	}

	public void addDVD(DigitalVideoDisc disc) {
		itemsInStore.add(disc);
		System.out.println("The disc has been successfully added.");
	}
	
	public void removeDVD(DigitalVideoDisc disc) {
		if (itemsInStore.size() == 0) {
			System.out.println("Cannot remove DVD, the store is empty.");
			return;
		}
		
		if (itemsInStore.remove(disc)) {
			System.out.println("The disc has been successfully removed.");
		} else {
			System.out.println("Something wrong happened. Please try again.");
		}
	}
}








