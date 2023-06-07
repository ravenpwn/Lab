package store;

import java.util.ArrayList;

import media.DigitalVideoDisc;
import media.Media;

public class Store {
	private ArrayList<Media> itemsInStore = new ArrayList<Media>();
	
	//	Method Get items in store
	public Media[] getItemsInStore() {
		
		Media[] res = new Media[itemsInStore.size()];
		if(itemsInStore.size() == 0) {
			return null;
		}
		res = itemsInStore.toArray(res);
		return res;
	}

	// Add media
	public void addMedia(Media media) {
		itemsInStore.add(media);
		System.out.println("The media has been successfully added.");
	}
	
	//	Remove media
	public void removeMedia(Media media) {
		if (itemsInStore.size() == 0) {
			System.out.println("Cannot remove media, the store is empty.");
			return;
		}
		
		if (itemsInStore.remove(media)) {
			System.out.println("The media has been successfully removed.");
		} else {
			System.out.println("Something wrong happened. Please try again.");
		}
	}
}








