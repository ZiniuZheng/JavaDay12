package inner;
/*
 * 匿名内部类
 * 		就是局部内部类的简化写法
 * 前提：
 * 		内部类可以继承一个外部类或实现一个接口
 * 格式：
 * 		new 外部类名或者接口名(){
 * 			覆盖类或者接口中的代码（也可以自定义内容）
 * 		}
 * 简单理解：
 * 		就是建立一个带内容的外部类或者接口的子类匿名对象
 * 应用场景：
 * 		通常在使用方法是接口类型参数、并且该接口中的方法不超过三个时，可以将匿名内部类作为参数传递
 * 		简化书写，如果阅读实在费劲的话，可以写有名字的内部类
 */
public class InnerDemo5 {

	public static void main(String[] args) {
		method(new Dog());
		method(new Cat());
		class Cat implements Animal{

			@Override
			public void eat() {
				System.out.println("猫吃鱼");
				
			}
		}
		
		method(new Cat());

	}
	
	public static void method(Animal a) {
		a.eat();
	}

}
