package permission;

public class PermissionDemo2 {

	public static void main(String[] args) {
		PermissionDemo pd = new PermissionDemo();
		//只有private不能使用
		pd.publicMethod();
		pd.protectedMethod();
		pd.defaultMethod();
		//pd.privateMethod();
	}
}
