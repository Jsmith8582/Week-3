
public class CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Question 1
		double[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 54, 232, -25};
		
		double firstElement = ages[0];
		double lastElement = ages[ages.length-1]; 
		System.out.println(firstElement - lastElement); //last number - the first number
		
		
		int sum = 0;
		for (double age : ages) {
			sum += age; //# 1takes each 'age' in ages, adds it to the previous number and then stores it in sum to bu used later
		}
		double average = sum / ages.length; //# 2takes the sum total numbers, since it was ran up above, then divides the amount of ints from ages to create the average of the numbers
			System.out.println(average);
		
		System.out.println(sum); //# 3
//Question 2		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob", "Spencer"};
		
		int sum1 = countLetters(names);
		System.out.println(sum1); //# 4
		int average1 = sum1 / names.length;
		System.out.println(average1); //# 5
		
		for (String name : names)
		System.out.println(name); //ln 6-12
		
		String allNames = "";
		for (int n = 0; n < names.length; n++) {
			allNames += names[n] + " ";
		}
		System.out.println("Concatenated names from names: " + allNames); //ln 13

//Question 5		
		int nameLengths = 0;
			for (String name : names) {
			nameLengths += name.length();
			}
			System.out.println(nameLengths); //ln 14
			
//Question 6	
		int namesSum = 0;
		for (int i = 0; i < names.length; i++) {
			namesSum ++;
		} 
		System.out.println(namesSum); //ln 15
//Question 7
		int n = 3;
		String word = "Hello";
		System.out.println(wordMultiplier(word, n));//not right
					
//Question 8
		String firstName = "Joshua";
		String lastName = "Smith";
		System.out.println(fullName(firstName, lastName));
	
//Question 9			
	
		
//Question 10		
		
		
//Question 11
		
		
//Question 12		
		
		
//Question 13		
		
		
		
	}
		public static String wordMultiplier(String x, int y) {
			return x + y;
		}
	
		public static String fullName(String x, String y) {
			return x + " " + y;
		}
		
		public static int countLetters(String[] array) {
			int sum = 0;
			for (String value : array) {
				sum += value.length();
			}
			return sum;
		}
		
		public static boolean greaterThan(int[] numbers) {
			int sum = 0;
			for (int value : array) {
				sum += value.length();
			}
			return sum <= 100;
		}
		
		public static double theAverage(double[] moreNumbers) {
			
		}
		
		public static double moreThanOther(double[] first, double[] second) {
			
		}
		
}
