
//Parent Class e.g. class being inherited form
abstract class AbstractClass {
	public abstract void abstractMethod();
	//has no body, body is inherited from subclass
	
	public void regularMethod() {
	//abstact classes can have regular methods
		System.out.print("I am a regular method");
	}
	
}
