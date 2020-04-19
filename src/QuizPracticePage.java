
public class QuizPracticePage {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 3;
		System.out.println(power(a,b));
		
		String word = "Dog";
		int number = 5;
		System.out.println(multiConcat(word, number));
		
		
	}

	public static long power(int x, int y) {
		long result = x;
		
		for (int i = 1; i < y; i++) {
			result = result * x;			
		}
		return result;
	}
	
	public String multiConcat(String s, int n) {
	  String result = s;
	  if (n > 1){
	    for(int i=2; i<=n ; i++) {
	      result += s;
	    }
	  }
	  return result; 
	}
	
}
