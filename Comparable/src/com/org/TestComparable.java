package com.org;

import java.util.*;


public class TestComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Items> list=new ArrayList<Items>();
		
		list.add(new Items(101,"Apple Ipod",2098));
		list.add(new Items(102,"Mac Book",110298));
		list.add(new Items(103,"Iphone",67096));
		
		for(Items item:list) {
			System.out.println(item);
		}
		
		System.out.println("AFTER SORTING!!!!");
		
		Collections.sort(list);
		
		for(Items item:list) {
			System.out.println(item);
		}
		
		
	}

}

