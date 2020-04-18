
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
		System.out.println(name);
		
		String allNames = "";
		for (int n = 0; n < names.length; n++) {
			allNames += names[n] + " ";
		}
		System.out.println("Concatenated names from names: " + allNames);

//Question 5		
		int nameLengths[];
			for (String name : names) {
			nameLengths += name.length();
			ut.print("what?")
			
//Question 6	

			
//Question 7
			
			
//Question 8
		
	
//Question 9			
	
	}
	
		public static int countLetters(String[] array) {
		int sum = 0;
				for (String value : array) {
				sum += value.length();
				}
				return sum;
		}
		
//
		
	

}
