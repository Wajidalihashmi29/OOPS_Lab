class NonNumericException extends Exception{
	public NonNumericException (String str) {
		super(str);
	}
}

public class Q3 {
	public static void main(String[] args) throws NonNumericException{
		for (int i = 0; i < args.length; i++) {
			try {
				Integer.parseInt(args[i]);
			}
			catch (NumberFormatException e) {
				throw new NonNumericException("Non Numeric Argument");
			}
		}
	}
}