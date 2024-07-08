package inner;
/*静态内部类
 * 
 * 成员内部类的修饰符：
 * 		我们可以使用权限修饰符修饰成员内部类，但是如果使用私有来修饰，则无法在其他类中访问
 * 		我们可以使用static修饰成员内部类，不用再创建外部类的对象了
 * 
 * 我们可以使用abstract，final修饰成员内部类
 */
public class InnerDemo2 {

	public static void main(String[] args) {
		/*
		 * 在外部类中访问静态内部类中的非静态成员：
		 * 外部类名.内部类名 对象名 = 外部类名.内部类对象
		 * 通过创建对象访问
		 */
		Outer2.Inner2 inner2 = new Outer2.Inner2();
		int a = inner2.num;
		inner2.function();
		/*
		 * 在外部类中访问静态内部类中的静态成员
		 * 可以通过上一种，也可以直接 外部类名.内部类名.成员
		 * 我们把静态内部类看成一个类中的成员，既然是静态修饰的，就可以用类名.调用
		 */
		Outer2.Inner2.function();
	}
}

class Outer2{
	static int num1 = 2; //静态成员变量
	public void method() {
		Inner2 i = new Inner2();
	} //非静态成员方法
	
	static class Inner2{
		int num = 10;
		public static void function() {
			System.out.println("function");
			/*
			 * 如果成员内部类用static修饰就出现了访问局限性，和静态方法是一个道理，就不能访问外部类的非静态成员了
			 * 但是仍然可以访问外部类中的静态成员，这是因为静态内部类是持有外部类名的
			 */
			//method();
			int num2 = num1;
		}
	}
}
