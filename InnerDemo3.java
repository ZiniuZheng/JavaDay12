package inner;
/*
 * 局部内部类（方法内部类）
 * 		- 方法内部类只能在定义该内部类的方法内实例化，不可以在此方法外对其实例化
 * 		- 方法内部类对象不能使用该内部类所在方法的非final局部变量
 * 		- 与成员内部类不同，方法内部类更像一个局部变量，可以用于修饰方法内部类的只有final和abstract
 * 		- 静态方法是没有this引用的，因此在静态方法内的内部类遭受同样的待遇，即：只能访问外部类的静态成员。
 * 
 */
public class InnerDemo3 {

	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
	}
}

class Outer{
	static int num2 = 1;
	public static void method() {
		int num = 10;
		
		abstract class Inner{
			public void function() {
				int num1 = num;
				System.out.println("function");
			}
		}
		
		class Inner1 extends Inner{
			
		}
		Inner i = new Inner1();
		i.function();
	}
	public void test() {
		//Inner i = new Inner();
		//System.out.println(num);
	}
}
