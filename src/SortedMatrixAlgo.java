

public class SortedMatrixAlgo {

	static int mat[][] = { 	{10,11,12,14} , 
							{13,15,16,18} , 
							{17,19,20,21}};
	static int columns = 3;
	static int rows = 4;
	static int sorted[] = new int[rows*columns];
	public static void main(String[] args) {
		int i =0,j =0;
		int l = 0;
		for(int k=columns-1; k>1; k--) {
			while(mat[k-1][i] < mat[k][j]) {
				sorted[l++] = mat[k-1][i];
				System.out.println("mat["+(k-1)+"]["+i+"] " + mat[k-1][i] + ", mat["+(k)+"]["+j+"]" + mat[k][j] + " : Value " + sorted[l-1]);
				if(j<columns)
				j++;
				else
					break;
			}
		i++;
		}
		for(int k =0; k<columns * rows; k++) {
			System.out.println(sorted[k]);
		}
	}
}
