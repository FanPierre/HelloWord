package test;

import java.util.ArrayList;
import java.util.HashSet;

/**
*@author Pierre Zhang
*@date 2019年1月22日
*@desc 天空不留下鸟的痕迹，但我已飞过
 *
 * 验证hashSet数组不可以有重复值
*/
public class test {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println("list:"+list);
		ArrayList<Object> list2 = new ArrayList<>();
		list2.add("1");
		list2.add("2");
		list2.add("4");
		System.out.println("list2:"+list2);
		HashSet<Object> hashSet = new HashSet<>();
		hashSet.addAll(list);
		hashSet.addAll(list2);
		System.out.println("hashSet:"+hashSet);
		
	}
	

}
