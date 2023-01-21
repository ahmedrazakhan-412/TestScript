package DriveQuestions;

public class TryCatchConcept {

	public static void main(String[] args) {
		try {
			System.out.println("I am Try Block");
			System.exit(0);
		}catch (Exception e) {
			System.out.println("I am catch Block");
		}finally {
			System.out.println("I am finally Block");
		}
	}

}
