public class Matrix {
	private int [][] matrix;
	private int row;
	private int col;
	
	public Matrix (int row, int col) {
		this.matrix = new int [row][col];
		this.row = row;
		this.col = col;
	}

	public Matrix (int [][] src, int srcRow, int srcCol) {
		this (srcRow, srcCol);
		for (int r = 0; r < srcRow; r++) {
			for (int c = 0; c < srcCol; c++) {
				this.setMatrixCell(src[r][c], r, c);
			}
		}
	}
	
	public boolean setMatrixCell(int value, int tRow, int tCol) {
		if (tRow < 0 || tCol < 0 || tRow >= row || tCol >= col) {
			return false;
		}
		matrix[tRow][tCol] = value;
		return true;
	}
	
	public int getMatrixCell(int tRow, int tCol) {
		return this.matrix[tRow][tCol];
	}
	
	public int getRow () {
		return this.row;
	}
	
	public int getCol () {
		return this.col;
	}
	
	/**
	 * Prints out the matrix in the console
	 */
	public void printMatrix() {
		for (int r = 0; r < row; r ++) {
			for (int c = 0; c < col; c++) {
				System.out.printf("%10d ", matrix[r][c]);
			}
			System.out.println();
		}
	}
}
