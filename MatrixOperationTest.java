/**
 * For testing purposes
 * @author Charles
 *
 */
public class MatrixOperationTest {
	static final int matrixARow = 5;
	static final int matrixACol = 5;
	
	static final int matrixBRow = 5;
	static final int matrixBCol = 5;

	public static void main(String[] args) {
		Matrix a = new Matrix (matrixARow, matrixACol);
		
		for (int r = 0; r < matrixARow; r++) {
			for (int c = 0; c < matrixACol; c++) {
				a.setMatrixCell((int) (Math.random() * 11), r, c);
			}
		}
		System.out.println("Printing out Matrix A:");
		a.printMatrix();
		
		Matrix b = new Matrix (matrixBRow, matrixBCol);
		
		for (int r = 0; r < matrixARow; r++) {
			for (int c = 0; c < matrixACol; c++) {
				b.setMatrixCell((int) (Math.random() * 11), r, c);
			}
		}
		System.out.println("Printing out Matrix B:");
		b.printMatrix();

		Matrix sum = MatrixOperation.add(a, b);
		System.out.println("Printing out sum of Matrix A and B:");
		sum.printMatrix();
	}
}
