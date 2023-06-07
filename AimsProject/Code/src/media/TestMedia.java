package media;

public class TestMedia {
	public static void main(String[] args) {
		Track t1 = new Track("abc",10);
		Track t2 = new Track("abc",10);
		CompactDisc cd1= new CompactDisc("abcd", null, null, 10, 100);
		cd1.addTrack(t1);
		cd1.removeTrack(t2);
	}
}
