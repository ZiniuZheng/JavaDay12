package permission2;

import permission.PermissionDemo;

public class PermissionDemo4 {

	public static void main(String[] args) {
		PermissionDemo pd = new PermissionDemo();
		//只有public能使用
		pd.publicMethod();
		//pd.protectedMethod();
		//pd.defaultMethod();
		//pd.privateMethod();

	}

}
