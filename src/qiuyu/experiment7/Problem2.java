package qiuyu.experiment7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Created By Qiuyu
 * @E-mail 1411770819@qq.com
 * @date 2018年5月16日
 * @problem 一个数如果恰好等于它的因子，这个数就成为“完数”。编写应用程序，求1000之内的所有完数
 * @note 此题利用递归实现，但是在测试过程中发现递归次数有限制，超出会导致溢出！————递归更快，循环更稳！
 */
public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func();

		/*
		 * if (isRound(4,2)) { System.out.println("y"); }else {
		 * System.out.println("n"); }
		 */
	}

	public static void func() {
		int small;// 待求完数的起始数字
		int big;// 待求完数的终止数字
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入待求完数的起始数字：\t");
		small = scanner.nextInt();
		System.out.print("请输入待求完数的终止数字：\t");
		big = scanner.nextInt();
		getPerfectNum(small, big);
	}

	// 得到所有完数
	public static void getPerfectNum(int small, int big) {
		if (small == 1)
			small++;
		if (small >= big)
			return;
		int i = small;
		ArrayList<Integer> factorSet = new ArrayList<>();
		if (ifPerfect(i, 2, factorSet)) {// 判断当前数字是否为完数;起始因数设置为2，以避免当判断数字为1时由于factor<num而产生的错误判断
			System.out.println("这是一个完数：" + i);
		}
		getPerfectNum(++i, big);
	}

	// 完数的判断
	public static boolean ifPerfect(int num, int factor, ArrayList<Integer> factorSet) {
		if (factor < num) {
			if (isRound(num, factor)) {
				factorSet.add(factor);
			}
			ifPerfect(num, ++factor, factorSet);
		}
		int fatorTotal = 0;// 因数的和-1
		for (int i = 0; i < factorSet.size(); i++) {
			fatorTotal += factorSet.get(i);
		}
		if ((fatorTotal + 1) == num)
			return true;
		else
			return false;
	}

	public static boolean isRound(int n, int m) {// 判断传入数字是否为整数
		if (n % m == 0)
			return true;
		else
			return false;
	}
}
