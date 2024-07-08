package permission2;

import permission.PermissionDemo;

public class PermissionDemo3 extends PermissionDemo{

	public static void main(String[] args) {
		PermissionDemo3 pd3 = new PermissionDemo3();
		//private和default都不能使用
		pd3.publicMethod();
		pd3.protectedMethod();
		//pd3.defaultMethod();
		//pd3.privateMethod();
	}
}
