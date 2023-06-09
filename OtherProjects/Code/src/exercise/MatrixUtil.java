package exercise;
import java.util.Scanner;

public class MatrixUtil {
	public static void main(String[] args) {
		MatrixUtil matrixUtil = new MatrixUtil();
//		double[][] matA = {{1, 2}, {3, 4}};
//		double[][] matB = {{5, 6}, {7, 8}};
		double[][] matA = matrixUtil.getMatrixInput();
		double[][] matB = matrixUtil.getMatrixInput(true);
		double[][] resultMat = matrixUtil.add(matA, matB);
		
		matrixUtil.printMat(resultMat);
	}
	
	public double[][] getMatrixInput(){
		return getMatrixInput(false);
	}
	
	public double[][] getMatrixInput(boolean isDoneGetInput) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter matrix size: ");
		int row = scanner.nextInt();
		int col = scanner.nextInt();
		double[][] processMat = new double[row][col];
		
		for (int i = 0; i < row; i++) {
			System.out.println("Enter matrix elements row " + i + " (seperated with blank space): ");
			for (int j =0; j < col; j++) {
				processMat[i][j] = scanner.nextDouble();
			}
        }
		if(isDoneGetInput) {			
			scanner.close();
		}
		return processMat;
	}
	
	public double[][] add(double[][] matA, double[][] matB) {
		double[][] resultMat = new double[0][0];
		if(matA.length == 0) {
			return resultMat;
		}
		
		resultMat = new double[matA.length][matA[0].length];
		for (int i = 0; i < matA.length; i++) {
		    for (int j = 0; j < matA[0].length; j++) {
		        resultMat[i][j] = matA[i][j] + matB[i][j];
		    }
		}
		return resultMat;
	}
	
	public void printMat(double[][] mat) {
		for (int i = 0; i < mat.length; i++) {
		    for (int j = 0; j < mat[0].length; j++) {
		        System.out.print(mat[i][j] + " ");
		    }
		    System.out.println();
		}
	}
		
}
