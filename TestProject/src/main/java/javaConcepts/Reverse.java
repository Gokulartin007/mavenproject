package javaConcepts;

public class Reverse {

	public void ReverseString(String Name) {

		System.out.println(Name.length());
		StringBuilder sb = new StringBuilder(Name);
		StringBuilder reversed = sb.reverse();
		System.out.println("Using inbuild function " + reversed);

		// Using without function #1

		char[] Ar = Name.toCharArray();
		System.out.println(Name.length());
		System.out.println(Ar.length);
		System.out.println("Using without function #1");
		for (int i = Ar.length - 1; i >= 0; i--) {
			System.out.print(Ar[i]);
		}

		System.out.println("");

		// Using without function #2
		System.out.println("Using without function #2 ");
		for (int i = Name.length() - 1; i >= 0; i--) {
			System.out.print(Name.charAt(i));

		}
		System.out.println("");
	}

	public void specialChar(String Name) {
		String replaced = Name.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println("Removed special char -> " + replaced);

		String SpecialChar = Name.replaceAll("[a-zA-Z0-9]", "");
		System.out.println("Removed char -> " + SpecialChar);

		String test = Name.replaceAll("[$,]", "");
		System.out.println("Removed $ , -> " + test);
	}

	public void SpaceChar(String Name) {
		String Removed = Name.replaceAll(" ", "");
		String trimmedString = Name.trim();
		System.out.println(trimmedString);

		System.out.println("Removed white space " + Removed);
	}

	public void SpaceCharWithoutMethod(String Name) {
		char[] arr=Name.toCharArray();
		for (int i = 0; i < arr.length; i++) {

			if (arr[i]==' ') {
				continue;
			}else
				System.err.print(arr[i]);
			
		}
		
	}

	// asked in UST Global
	public void oddeven(String Name) {

		int len = Name.length();
		System.out.println(len);
		// String a = null;
		for (int i = 0; i < len; i++) {
			if (i % 2 == 0) {
				// System.out.println("inside lop");
				System.out.print("a");
				// a="a";
			} else
				System.out.print("e");
			// a="e";
		}
		// return a;
	}

	public static void palindrome(String Name) {
		System.out.println("palindrome string");
		String reverse = "";
		for (int i = Name.length() - 1; i >= 0; i--) {
			reverse = reverse + Name.charAt(i);
		}

		if (Name.equals(reverse)) {
			System.out.println(Name + " is Palindrome");
		} else
			System.out.println(Name + " is not an Palindrome");

	}

	public static void main(String[] args) {

		palindrome("varsha");

		// to access non-static method we need to create the instance/object of class
		Reverse reverse = new Reverse();
		reverse.specialChar("gokul@gmail.,com$");
		reverse.SpaceCharWithoutMethod("gokul sam");
		reverse.oddeven("gokul");
	}

}
