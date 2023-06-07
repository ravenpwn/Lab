package cart;

import java.util.ArrayList;

import media.DigitalVideoDisc;
import media.Media;
public class CartTest {
	public static void main(String[] args) {
		
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		cart.addMedia(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		cart.addMedia(dvd2);

		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		cart.addMedia(dvd3);
		
		cart.print();
		Media dvdId1 = cart.searchById(1);
//		dvdId1.print();
		ArrayList<Media> dvdsNameA = cart.searchByTitle("a");
//		for (Media m: dvdsNameA) {
//			m.print();;
//		}
	}
}
