package media;

import java.util.*;

import store.Store;
public class TestMedia {
	public static void main(String[] args) {
		Track t1 = new Track("abc",10);
		Track t2 = new Track("abc",10);
		CompactDisc cd1= new CompactDisc("abcd", "def", 200);
		Media cd2 = new CompactDisc("Bbcd", "def", 150);
		cd1.addTrack(t1);
		cd1.removeTrack(t2);
		Media dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		Media book1 = new Book("Abc", "def", 15);
		Media book2 = new Book("Abc", "def", 15);
		Store ms = new Store();
		ms.addMedia(book1,dvd1,cd2,cd1);
		ms.removeMedia(book2);
		
	}
}
