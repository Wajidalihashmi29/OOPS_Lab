class Student {
	public String Name;
	public int Roll_No;
	public Student(){}
	public Student(String N, int R){
		Name = N;
		Roll_No = R;
		System.out.println("Name : "+Name+"	"+"Roll_no : "+Roll_No);
		}
	public void print(String P, int K){
		Name = P;
		Roll_No = K;
		System.out.println("Name : "+Name+"	"+"Roll_no : "+Roll_No);
		}
	}
public class Q1{
	public static void main(String[] args){
		Student[] Stu;
		Stu = new Student[10];
		Stu[0] = new Student("des", 99);
		Stu[1] = new Student("ese", 89);
		Stu[2] = new Student("rfgd", 97);
		Stu[3] = new Student("rgs", 98); 
		Stu[4] = new Student("wrgfw", 45);
		Stu[5] = new Student("rfd", 90);
		Stu[6] = new Student("abc", 82); 
        Stu[7] = new Student("fsf", 93);
        Stu[8] = new Student("fd", 95);
        Stu[9] = new Student("afs", 96);
        try  {
        	Stu[10] = new Student();
        	Stu[10].print("oly", 111);
        	}
        catch (ArrayIndexOutOfBoundsException e){
        	System.out.println("\nDo not cross size of array " + e); 
        	}
        }
	}