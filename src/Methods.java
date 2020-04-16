
public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		String firstName = "Joshua";
		String lastName = "Smith";
		String fullName = createFullName(firstName, lastName);
		
		System.out.println(fullName);
		
		String nickName = "Josh";
		String middleName = "Kosh";
		String fullName2 = createFullName(nickName, middleName);
		System.out.println(fullName2);
		
		String Whatever = "Mumbo Jumbo";
		String Whocares = "Banana Jama";
		String Mud = createFullName(Whatever, Whocares);
		System.out.println(Mud);
		
		firstName = "Jack";
		lastName = "Daniels";
		System.out.println(createFullName(firstName, lastName));
	}
//	{
//		System.out.println("Choose your Character!");
//		System.out.println("1) Samus") ;
//		System.out.println("2) Donkey Kong");
//		System.out.println("3) Captain Falcon");
//		System.out.println("4) Kirby");
//			
//	}
		public static String createFullName(String x, String y) {
			return x + " " + y;
		}
		

			
		
}
