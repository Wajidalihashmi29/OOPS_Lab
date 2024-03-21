interface A{
	void method1();
	void method2();
}
interface B extends A{
	void method3();
}
class MyClass implements B{
	public void method1 (){
		System.out.println("Implementing method1().");
	}
	public void method2(){
		System.out.println ("Implement method2().");
	}
	public void method3(){
		System.out.println ("Implement method3()." );
	}
}
class IFExtend{
	public static void main(String arg[]){
		MyClass ob = new MyClass();
		ob.method1();
		ob.method2();
		ob.method3();
		}	
}