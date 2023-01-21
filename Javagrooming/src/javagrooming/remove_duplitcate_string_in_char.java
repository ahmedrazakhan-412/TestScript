package javagrooming;
public class remove_duplitcate_string_in_char {
	public static void main(String[] args) {
		String s="karnataka";
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i+1; j < c.length; j++) {
				if (c[i]==c[j]) {
					c[j]='z';
				}
			}
		}	
		for (int k = 0; k < c.length; k++) {
			if (c[k]!='z') {
				System.out.println(c[k]);
			}
		}

	}
}
