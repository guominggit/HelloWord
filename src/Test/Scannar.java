package Test;

import java.util.Scanner;

public class Scannar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入你的名字：");
		String xingming = in.next();
		System.out.println("请输入你的年龄：");
		int nianling = in.nextInt();
		System.out.println("请输入你的性别：");
		String xingbie = in.next();
		System.out.println("请输入你的兴趣：");
		String xingqu = in.next();

		System.out.println("姓名：" + xingming);
		System.out.println("年龄：" + nianling);
		System.out.println("性别：" + xingbie);
		System.out.println("兴趣：" + xingqu);

	}

}
