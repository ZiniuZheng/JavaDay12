package permission;
/*
 * 权限修饰符：
 * 		public 当前类，相同包下不同的类，不同包下的子类，不同包下的非子类
 * 		protected 当前类，相同包下不同的类，不同包下的子类
 * 		default 当前类，相同包下不同的类
 * 		private 当前类
 * 
 * 		protected: 既能在当前包下使用，又能让子类对象使用
 * 		default: 只能在当前包下使用
 */
public class PermissionDemo {
	public void publicMethod() {
		System.out.println("publicMethod");
	}
	
	protected void protectedMethod() {
		System.out.println("protectedMethod");
	}
	
	void defaultMethod() {
		System.out.println("defaultMethod");
	}
	
	private void privateMethod() {
		System.out.println("privateMethod");
	}
	
	public static void main(String[] args) {
		PermissionDemo pd = new PermissionDemo();
		//所有都能使用
		pd.publicMethod();
		pd.protectedMethod();
		pd.defaultMethod();
		pd.privateMethod();
	}
}
