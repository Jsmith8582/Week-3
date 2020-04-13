
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] Schools = new String [4];
				
		Schools[0] = "Dixie State College";
		Schools[1] = "Dixie Technical College";
		Schools[2] = "Promineo Tech";
		Schools[3] = "Dixie State University";
//		Normal for Loop
		for (int S = 0; S < Schools.length; S++) {
			System.out.println(Schools[S]);
			}
		System.out.println("   ");
//		Enhanced for Loop
		for (String School : Schools) {
			System.out.println(School);
		}
		
		System.out.println("   ");
		
		String [] Groceries = new String [6];
		
		Groceries [0] = "Sugar";
		Groceries [1] = "Spice";		
		Groceries [2] = "Everything Nice";
		Groceries [3] = "Cocoa";
		Groceries [4] = "Butter";
		Groceries [5] = "Chocolate Chips";
		
		for (String GroceryList : Groceries) {
			System.out.println(GroceryList);
		}
		
//		int [] MultiplesOf2 = new int [6];
//		
//		for (int N = 1; N < MultiplesOf2.length; N++) {
//			MultiplesOf2[N - 1] = N * 2;
//			System.out.println("Number: " + MultiplesOf2[N - 1]);
//		}
		
		char  LetterGrade = 'A';
	    double NumericGrade = 65;

	    if (NumericGrade <=100 && NumericGrade >=90) {
	    			LetterGrade = 'A';
	    		} else if (NumericGrade <=89 && NumericGrade >= 80) {
	    			LetterGrade = 'B';
	    		} else if (NumericGrade <=79 && NumericGrade >= 70) {
	    			LetterGrade = 'C';
	    		} else if (NumericGrade <=69 && NumericGrade >= 60) {
	    			LetterGrade = 'D';
	    		} else if (NumericGrade <=59 && NumericGrade >= 0) {
	    			LetterGrade = 'F';
	    		}
		
		
		
	}

}
