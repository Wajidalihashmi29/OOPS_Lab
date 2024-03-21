/*
	public class Class1 {

		 private InnerClass1 ic;
		 
		 public Class1() {
			 ic = new InnerClass1();
		 }
		 
		 public void displayStrings() {
			 System.out.println(ic.getString() + ".");
			 System.out.println(ic.getAnotherString() + ".");
		 }
		 
		 static public void main(String[] args) {
			 Class1 c1 = new Class1();
			 c1.displayStrings();
		 }
		 
		 private class InnerClass1 {
			 public String getString() {
				 return "InnerClass1: getString invoked";
			 }
			 public String getAnotherString() {
				 return "InnerClass1: getAnotherString invoked";
			 }
		 }

		}

*/

public class Colleges {  
String collegeId;  
Colleges(String collegeId){  
this.collegeId = "IIT " + collegeId;   
}  
public static void main(String[] args) {  
// TODO Auto-generated method stub  
Colleges clg = new Colleges(); //this can't create colleges constructor now.  
}  
  
  
}  





















