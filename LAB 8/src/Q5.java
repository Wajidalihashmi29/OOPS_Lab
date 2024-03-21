public class Q5 {
	public static void main(String[]args) throws NameException, AgeException{
		Employee e1 = new Employee("wajid", 68);
	}
}
class Employee{
	String name;
	int age;
	Employee(String name, int age) throws NameException, AgeException{
		this.name = name;
		this.age = age;
		try {
			Integer.parseInt(name);
			throw new NameException("Name is a Number");
		}
		catch(NumberFormatException e) {
			if (age > 50) {
				throw new AgeException("Age is Above 50");
			}
		}
	}
}
class NameException extends Exception{
	public NameException(String err) {
		super(err);
	}
}

class AgeException extends Exception{
	public AgeException(String err) {
		super(err);
	}
}