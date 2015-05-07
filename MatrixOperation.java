public class MatrixOperation {
	static public Matrix add (Matrix m1, Matrix m2) {
		int m1Row = m1.getRow();
		int m1Col = m1.getCol();
		if (m1Row != m2.getRow() || m1Col != m2.getCol()) {
			return null;
		}
		Matrix result = new Matrix(m1Row, m1Col);
		
		for (int r = 0; r < m1Row; r++) {
			for (int c = 0; c < m1Col; c++) {
				result.setMatrixCell(m1.getMatrixCell(r, c) + m2.getMatrixCell(r, c)
						, r, c);
			}
		}
		
		return result;
	}
	
	static public Matrix subtract (Matrix m1, Matrix m2) {
		int m1Row = m1.getRow();
		int m1Col = m1.getCol();
		if (m1Row != m2.getRow() || m1Col != m2.getCol()) {
			return null;
		}
		Matrix result = new Matrix(m1Row, m1Col);
		
		for (int r = 0; r < m1Row; r++) {
			for (int c = 0; c < m1Col; c++) {
				result.setMatrixCell(m1.getMatrixCell(r, c) - m2.getMatrixCell(r, c)
						, r, c);
			}
		}
		
		return result;
	}
	
	static public Matrix product (Matrix m1, Matrix m2) {
		
		
		Matrix product = new Matrix ();
		
		return product;
	}
}
