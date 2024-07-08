package Package;

import java.util.*;
/*
 * 不同包之间的互相访问
 * 		使用类的全名
 * 		使用关键字import将类导入
 * 
 * 注意：*代表的是通配符，代表导入了这个包下所有的类，并没有导入子包下的类
 * 
 * 类的全名：包名.类名
 */
public class PackageDemo2 {

	public static void main(String[] args) {
		//相同包下的类可以直接访问，不需要做其他的操作
		PackageDemo pd = new PackageDemo();
		
		java.util.ArrayList list = new java.util.ArrayList();
		
		ArrayList list2 = new ArrayList();
	}
}

class Demo2{
	
}
