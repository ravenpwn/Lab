package garbage;

public class GarbageCreator {
	public static void main(String[] args) {
		while (true) {
			String garbage = new String("Garbage");
			garbage += System.nanoTime();
			System.out.println(garbage);
		}
	}
}
