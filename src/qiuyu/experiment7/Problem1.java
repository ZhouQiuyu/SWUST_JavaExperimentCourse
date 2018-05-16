package qiuyu.experiment7;

import java.util.Scanner;

/**
*@author	Created By Qiuyu
*@E-mail	1411770819@qq.com
*@date		2018年5月16日
*@problem	猜数字游戏，编写一个java程序，实现功能：
*			(1)程序随机分配给用户一个1~100之间的随机数
*			(2)用户在输入对话框中输入自己的猜测
*			(3)程序返回提示信息，提示信息分别是：“猜大了”，“猜小了”，“猜对了”
*			(4)用户可以根据提示信息再次输入猜测，知道提示信息为“猜对了”
*/
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func();
	}
	public static void func() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("程序开始...");
		int stander=(int)(Math.random()*99+1);
		System.out.println("随机数已生成，请输入你猜测的数字：");
		//System.out.println("随机数："+stander);
		guss(stander, scanner);
	}
	public static void guss(int stander,Scanner scanner) {
		int num=scanner.nextInt();
		if(num>stander){
			System.out.println("猜大了！");
			guss(stander, scanner);
		}else if(num<stander){
			System.out.println("猜小了！");
			guss(stander, scanner);
		}else{
			System.out.println("恭喜你，猜对了！");
		}
	}
}
