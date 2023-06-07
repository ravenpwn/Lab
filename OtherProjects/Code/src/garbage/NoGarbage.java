package garbage;

public class NoGarbage {
	public static void main(String[] args) {
		StringBuilder garbageBuilder = new StringBuilder();
        while (true) {
            garbageBuilder.setLength(0); // Reset the StringBuilder
            garbageBuilder.append("Created garbage: "); // Append the necessary information
            garbageBuilder.append(System.nanoTime()); // Append a timestamp or any useful data
            String garbage = garbageBuilder.toString();
            System.out.println(garbage);
        }
	}
}
