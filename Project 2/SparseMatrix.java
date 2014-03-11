class SparseMatrix {
  private Row indices;
  private Row values;
  private int numberOfRows;
  private int numberOfColumns;
  private int numberOfElements;
  
  private static class Row {

  }
  
  private static class Node {
  
  }
  
  SparseMatrix(int numberOfRows, int numberOfColumns) {

  }
  
  SparseMatrix(int numberOfRows, int numberOfColumns, int y[][]) {
 
  }
    
  public void displayIndices() {
 
  }
  
  public void displayValues() {
 
  }
  
  private void displayStructure(Row root){

  }
  
  public int getNumberOfRows () {
	 return -1;
  }
  
  public int getNumberOfColumns () {
	 return -1;
  }
  
  public int getNumberOfElements (){
	 return -1;
  }  
  
  public int getElement (int row, int column) {
	 return -1;
  }  
  
  public void setElement (int row, int column, int value) {

  }

  public String toString(){
	return new String();
  }

  public SparseMatrix add(SparseMatrix second) {
  // You are not permitted to call getElement or setElement in this method
  	return new SparseMatrix(1,1);
  }
  
  private void copyRow(SparseMatrix c,Row crow,Row cri,Row copy){

  }  
  
  public static void main(String args[]) {

	int[][] firstArray={
	{0,1},
	{0,0},
	{2,3},
	};
    
	SparseMatrix A=new SparseMatrix(3,2,firstArray);
	System.out.println("A:");
	System.out.println(A);
	System.out.println("Number of rows in A: " + A.getNumberOfRows() + " ---> " + (A.getNumberOfRows()==3?"Pass":"Fail"));
	System.out.println("Number of columns in A: " + A.getNumberOfColumns() + " ---> " + (A.getNumberOfColumns()==2?"Pass":"Fail"));	
	System.out.println("Number of elements in A: " + A.getNumberOfElements() + " ---> " + (A.getNumberOfElements()==6?"Pass":"Fail"));	 	
	System.out.println("A's indices:");
	A.displayIndices();	
	System.out.println("A's values:");
	A.displayValues();
	System.out.println();	
    
	SparseMatrix B=new SparseMatrix(3,2);
	B.setElement(0,0,3);
	B.setElement(0,1,2);
	B.setElement(1,0,3);
	B.setElement(1,1,2);
	B.setElement(1,1,3);   // change [1,1] from 2 to 3
	B.setElement(2,0,1);

	System.out.println("B:");
	System.out.println(B);	
	System.out.println("Number of rows in B: " + B.getNumberOfRows() + " ---> " + (B.getNumberOfRows()==3?"Pass":"Fail"));
	System.out.println("Number of columns in B: " + B.getNumberOfColumns() + " ---> " + (B.getNumberOfColumns()==2?"Pass":"Fail"));	
	System.out.println("Number of elements in B: " + B.getNumberOfElements() + " ---> " + (B.getNumberOfElements()==6?"Pass":"Fail"));
	System.out.println("B's indices:");	
	B.displayIndices();	
	System.out.println("B's values:");		
	B.displayValues();
	System.out.println();	
	
	SparseMatrix AB=A.add(B);
	System.out.println("AB:");
	System.out.println(AB);	
	System.out.println("Number of rows in AB: " + AB.getNumberOfRows() + " ---> " + (AB.getNumberOfRows()==3?"Pass":"Fail"));
	System.out.println("Number of columns in AB: " + " ---> " + (AB.getNumberOfColumns()==2?"Pass":"Fail"));
	System.out.println("Number of elements in AB: " + AB.getNumberOfElements() + " ---> " + (AB.getNumberOfElements()==6?"Pass":"Fail"));	
	System.out.println("AB's indices:");	
	AB.displayIndices();	
	System.out.println("AB's values:");		
	AB.displayValues();
	System.out.println();	
	
	int[][] resultArray={
	{3,3},
	{3,3},
	{3,3},
	};	
	boolean ResultError = false;
	for (int i=0; i < resultArray.length; i++) {
		for (int j=0; j < resultArray[i].length; j++) {
			if (AB.getElement(i,j) != resultArray[i][j]) {
				ResultError = true;
				break;
			}
		}
	}
	if (ResultError) {
		System.out.println("Fail: invalid AB.");
	}
	else {
		System.out.println("Pass: AB is correct.");
	}
	System.out.println();	
	
	A.setElement(1,0,1); firstArray[1][0] = 1;
	B.setElement(2,1,1);
	System.out.println("AB after changing A and B:");	
	System.out.println(AB);	
	ResultError = false;
	for (int i=0; i < resultArray.length; i++) {
		for (int j=0; j < resultArray[i].length; j++) {
			if (AB.getElement(i,j) != resultArray[i][j]) {
				ResultError = true;
				break;
			}
		}
	}
	if (ResultError) {
		System.out.println("Fail: invalid AB.");
	}
	else {
		System.out.println("Pass: AB is correct.");
	}	
	System.out.println();	
	
    
	SparseMatrix Empty = new SparseMatrix(3,2);
	System.out.println("Empty:");
	System.out.println(Empty);	
	System.out.println("Number of rows in Empty: " + Empty.getNumberOfRows() + " ---> " + (Empty.getNumberOfRows()==3?"Pass":"Fail"));
	System.out.println("Number of columns in Empty: " + Empty.getNumberOfColumns() + " ---> " + (Empty.getNumberOfColumns()==2?"Pass":"Fail"));
	System.out.println("Number of elements in Empty: " + Empty.getNumberOfElements() + " ---> " + (Empty.getNumberOfElements()==6?"Pass":"Fail"));
	System.out.println("Empty's indices:");	
	Empty.displayIndices();	
	System.out.println("Empty's values:");		
	Empty.displayValues();
	System.out.println();
	
	SparseMatrix AEmpty=A.add(Empty); // note that we changed A's [1,0] after we created A: A.setElement(1,0,1);
	System.out.println("AEmpty:");
	System.out.println(AEmpty);
	System.out.println();	
	System.out.println("Number of rows in AEmpty: " + AEmpty.getNumberOfRows() + " ---> " + (AEmpty.getNumberOfRows()==3?"Pass":"Fail"));
	System.out.println("Number of columns in AEmpty: " + AEmpty.getNumberOfColumns() + " ---> " + (AEmpty.getNumberOfColumns()==2?"Pass":"Fail"));	
	System.out.println("Number of elements in AEmpty: " + AEmpty.getNumberOfElements() + " ---> " + (AEmpty.getNumberOfElements()==6?"Pass":"Fail"));		
	System.out.println("AEmpty's indices:");	
	AEmpty.displayIndices();
	System.out.println();	
	System.out.println("AEmpty's values:");		
	AEmpty.displayValues();
	System.out.println();	
	
	boolean AEmptyError = false;
	for (int i=0; i < firstArray.length; i++) {
		for (int j=0; j < firstArray[i].length; j++) {
			if (AEmpty.getElement(i,j) != firstArray[i][j]) {
				AEmptyError = true;
				break;
			}
		}
	}	
	if (AEmptyError) {
		System.out.println("Fail: invalid AEmpty.");
	}
	else {
		System.out.println("Pass: AEmpty is correct.");
	}	
	System.out.println();
	
	int[][] secondArray={
		{0,1}
	};
    
	SparseMatrix C=new SparseMatrix(1,2,secondArray);
	System.out.println("C:");
	System.out.println(C);
	System.out.println("C's indices:");    
	C.displayIndices();    
	System.out.println("C's values:");    
	C.displayValues();
	SparseMatrix D=C.add(C);
	System.out.println("D:"); 
	System.out.println(D);
	System.out.println("D's indices:");  	
	D.displayIndices(); 
	System.out.println("D's values:"); 	
	D.displayValues();
	
	boolean bad = false;
	try {
		SparseMatrix badMatrix = new SparseMatrix(0,0); // illegal; row and column must both be > 0
	}
	catch(Exception e) {
		bad = true;	
	}
	finally {
		if (!bad) {
			System.out.println("Fail: new SparseMatrix(0,0) should be illegal.");	
		}
		else {
			System.out.println("Pass: new SparseMatrix(0,0) is illegal.");
		}
	}
	bad = false;
	try {
		int v = A.getElement(3,0); // illegal: A only has 3 rows so 3 is an invalid row index
	}
	catch(Exception e) {
		bad = true;	
	}
	finally {
		if (!bad) {
			System.out.println("Fail: AEmpty.getElement(3,0) should be illegal - invalid row index");	
		}
		else {
			System.out.println("Pass: AEmpty.getElement(3,0) is illegal.");
		}
	}
	
	bad = false;
	try {
		SparseMatrix E = new SparseMatrix(2,2);
		SparseMatrix r = A.add(E); //illegal: A is 3x2 and E is 2x2
	}
	catch(Exception e) {
		bad = true;	
	}
	finally {
		if (!bad) {
			System.out.println("Fail: A.add(E) should be illegal - A is 3x2 and E is 2x2");	
		}
		else {
			System.out.println("Pass: A.add(E) is illegal.");
		}
	}
	
  }
  
}
