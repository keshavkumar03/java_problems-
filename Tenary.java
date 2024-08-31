public class Tenary {
    public static void main(String[] args) {
		boolean x;
		x = (5<4)?true:false;
		System.out.println(x);

        int age = 12;
		String a = "Allowed to vote";
		String b = "Not allowed to vote";
		String accessallowed = (age > 18) ? a : b;
		System.out.println(accessallowed);
	}
}
