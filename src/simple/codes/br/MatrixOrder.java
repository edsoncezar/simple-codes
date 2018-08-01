package simple.codes.br;

/**
 * @author Edson Cezar
 *
 */
public class MatrixOrder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] matriz= new int[3][5];

		matriz [0][0]=9;
		matriz [0][1]=15;
		matriz [0][2]=14;
		matriz [0][3]=13;
		matriz [0][4]=12;
		matriz [1][0]=11;
		matriz [1][1]=10;
		matriz [1][2]=8;
		matriz [1][3]=7;
		matriz [1][4]=6;
		matriz [2][0]=5;
		matriz [2][1]=4;
		matriz [2][2]=3;
		matriz [2][3]=2;
		matriz [2][4]=1; 
		
		Comparable[] vetor = new Comparable[15];
		
		int count = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				vetor[count]= matriz[i][j];
				count++;
		    } 
	    }
		
		mergeSort(vetor);
		
		matriz= new int[3][5];
		int recovery = 0;
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				matriz[i][j] = Integer.parseInt(vetor[recovery].toString());
				recovery++;
				System.out.println("Matriz ordenada : " +matriz[i][j]);
		    } 
	    }
	}
	
	 /**
     * Mergesort algorithm.
     * @param a an array of Comparable items.
     */
    public static void mergeSort( Comparable [ ] a ) {
        Comparable [ ] tmpArray = new Comparable[ a.length ];
        mergeSort( a, tmpArray, 0, a.length - 1 );
    }
    
    /**
     * Internal method that makes recursive calls.
     * @param a an array of Comparable items.
     * @param tmpArray an array to place the merged result.
     * @param left the left-most index of the subarray.
     * @param right the right-most index of the subarray.
     */
    private static void mergeSort( Comparable [ ] a, Comparable [ ] tmpArray,
            int left, int right ) {
        if( left < right ) {
            int center = ( left + right ) / 2;
            mergeSort( a, tmpArray, left, center );
            mergeSort( a, tmpArray, center + 1, right );
            merge( a, tmpArray, left, center + 1, right );
        }
    }
    
    /**
     * Internal method that merges two sorted halves of a subarray.
     * @param a an array of Comparable items.
     * @param tmpArray an array to place the merged result.
     * @param leftPos the left-most index of the subarray.
     * @param rightPos the index of the start of the second half.
     * @param rightEnd the right-most index of the subarray.
     */
    private static void merge( Comparable [ ] a, Comparable [ ] tmpArray,
            int leftPos, int rightPos, int rightEnd ) {
        int leftEnd = rightPos - 1;
        int tmpPos = leftPos;
        int numElements = rightEnd - leftPos + 1;
        
        // Main loop
        while( leftPos <= leftEnd && rightPos <= rightEnd )
            if( a[ leftPos ].compareTo( a[ rightPos ] ) <= 0 )
                tmpArray[ tmpPos++ ] = a[ leftPos++ ];
            else
                tmpArray[ tmpPos++ ] = a[ rightPos++ ];
        
        while( leftPos <= leftEnd )    // Copy rest of first half
            tmpArray[ tmpPos++ ] = a[ leftPos++ ];
        
        while( rightPos <= rightEnd )  // Copy rest of right half
            tmpArray[ tmpPos++ ] = a[ rightPos++ ];
        
        // Copy tmpArray back
        for( int i = 0; i < numElements; i++, rightEnd-- )
            a[ rightEnd ] = tmpArray[ rightEnd ];
    }

}
