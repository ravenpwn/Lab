package exercise;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUtil {
	public static void main(String[] args) {
		ArrayUtil arrUtil = new ArrayUtil();
//		double[] sampleArray = {1789, 2035, 1899, 1456, 2013};
		double[] sampleArray = arrUtil.getArrayInput();
		double[] res = arrUtil.arraySort(sampleArray);
		double sum = arrUtil.arraySum(sampleArray);
		double average = arrUtil.arrayAverage(sampleArray);
		
		System.out.println(Arrays.toString(res));
		System.out.println(sum);
		System.out.println(average);
	}
	
	public double[] arraySort(double[] arr) {
		double [] processArr = arr.clone();
		Arrays.sort(processArr);
		return processArr;
	}
	
	public double arraySum(double[] arr) {
		double sum = Arrays.stream(arr).sum();
		return sum;
	}
	
	public double arrayAverage(double[] arr) {
		double sum = this.arraySum(arr);
		double average = sum / arr.length;
		return average;
	}
	
	public double[] getArrayInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = scanner.nextInt();
		double[] processArr = new double[size];
		System.out.println("Enter array elements (seperated with blank space): ");
		
		for (int i = 0; i < size; i++) {
            processArr[i] = scanner.nextDouble();
        }
		
		scanner.close();
		
		return processArr;
	}
}
