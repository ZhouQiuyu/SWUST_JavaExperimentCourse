package qiuyu.experiment7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Created By Qiuyu
 * @E-mail 1411770819@qq.com
 * @date 2018��5��16��
 * @problem һ�������ǡ�õ����������ӣ�������ͳ�Ϊ������������дӦ�ó�����1000֮�ڵ���������
 * @note �������õݹ�ʵ�֣������ڲ��Թ����з��ֵݹ���������ƣ������ᵼ����������������ݹ���죬ѭ�����ȣ�
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
		int small;// ������������ʼ����
		int big;// ������������ֹ����
		Scanner scanner = new Scanner(System.in);
		System.out.print("�����������������ʼ���֣�\t");
		small = scanner.nextInt();
		System.out.print("�����������������ֹ���֣�\t");
		big = scanner.nextInt();
		getPerfectNum(small, big);
	}

	// �õ���������
	public static void getPerfectNum(int small, int big) {
		if (small == 1)
			small++;
		if (small >= big)
			return;
		int i = small;
		ArrayList<Integer> factorSet = new ArrayList<>();
		if (ifPerfect(i, 2, factorSet)) {// �жϵ�ǰ�����Ƿ�Ϊ����;��ʼ��������Ϊ2���Ա��⵱�ж�����Ϊ1ʱ����factor<num�������Ĵ����ж�
			System.out.println("����һ��������" + i);
		}
		getPerfectNum(++i, big);
	}

	// �������ж�
	public static boolean ifPerfect(int num, int factor, ArrayList<Integer> factorSet) {
		if (factor < num) {
			if (isRound(num, factor)) {
				factorSet.add(factor);
			}
			ifPerfect(num, ++factor, factorSet);
		}
		int fatorTotal = 0;// �����ĺ�-1
		for (int i = 0; i < factorSet.size(); i++) {
			fatorTotal += factorSet.get(i);
		}
		if ((fatorTotal + 1) == num)
			return true;
		else
			return false;
	}

	public static boolean isRound(int n, int m) {// �жϴ��������Ƿ�Ϊ����
		if (n % m == 0)
			return true;
		else
			return false;
	}
}
