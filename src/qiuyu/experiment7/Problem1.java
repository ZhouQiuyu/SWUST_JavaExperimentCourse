package qiuyu.experiment7;

import java.util.Scanner;

/**
*@author	Created By Qiuyu
*@E-mail	1411770819@qq.com
*@date		2018��5��16��
*@problem	��������Ϸ����дһ��java����ʵ�ֹ��ܣ�
*			(1)�������������û�һ��1~100֮��������
*			(2)�û�������Ի����������Լ��Ĳ²�
*			(3)���򷵻���ʾ��Ϣ����ʾ��Ϣ�ֱ��ǣ����´��ˡ�������С�ˡ������¶��ˡ�
*			(4)�û����Ը�����ʾ��Ϣ�ٴ�����²⣬֪����ʾ��ϢΪ���¶��ˡ�
*/
public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		func();
	}
	public static void func() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����ʼ...");
		int stander=(int)(Math.random()*99+1);
		System.out.println("����������ɣ���������²�����֣�");
		//System.out.println("�������"+stander);
		guss(stander, scanner);
	}
	public static void guss(int stander,Scanner scanner) {
		int num=scanner.nextInt();
		if(num>stander){
			System.out.println("�´��ˣ�");
			guss(stander, scanner);
		}else if(num<stander){
			System.out.println("��С�ˣ�");
			guss(stander, scanner);
		}else{
			System.out.println("��ϲ�㣬�¶��ˣ�");
		}
	}
}