package JavaPatterns;
public class LoadingPattern {
	public static void main(String[] args) {
		int space = 1;
		int star = 7;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			space++;
			star=star-2;
		}
		space--;
		star=star+2;
		for (int i = 1; i <=4; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*");
			}
			System.out.println();
			space--;
			star=star+2;
		}
	}
}
