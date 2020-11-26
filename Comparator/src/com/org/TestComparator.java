package com.org;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Items> list=new ArrayList<Items>();
		
		list.add(new Items(104,"Apple Ipod",2098));
		list.add(new Items(102,"Mac Book",110298));
		list.add(new Items(112,"Iphone",67096));
		
		for(Items item:list) {
			System.out.println(item);
		}
		
		System.out.println("AFTER SORTING using sorting as seperate class(ascending order)");
		
		Collections.sort(list, new Sorting());
		
		for(Items item:list) {
			System.out.println(item);
		}
		
		System.out.println("AFTER SORTING using anonymous/inline class(ascending order)");
		
		Comparator<Items> sortId1=new Comparator<Items>(){
		
			public int compare(Items o1, Items o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
	};
	
	Collections.sort(list, sortId1);
	
	for(Items item:list) {
		System.out.println(item);
	}
	
	System.out.println("AFTER SORTING ID using anonymous/inline class(descending order)");
	
	Comparator<Items> sortId2 = new Comparator<Items>(){
	
		public int compare(Items o1, Items o2) {
			// TODO Auto-generated method stub
			return o2.getId()-o1.getId();
		}
};

		Collections.sort(list, sortId2);

		for(Items item:list) {
			System.out.println(item);
		}
	
	
		System.out.println("AFTER SORTING ID using anonymous/inline class(ascending order)");
		
		Comparator<Items> sortId=new Comparator<Items>(){
		
			public int compare(Items o1, Items o2) {
				// TODO Auto-generated method stub
				return o1.getId()-o2.getId();
			}
		};
	
		Collections.sort(list, sortId);
	
		for(Items item:list) {
			System.out.println(item);
		}
		
System.out.println("AFTER SORTING Name using anonymous/inline class(descending order)");
		
		Comparator<Items> sortName1=new Comparator<Items>(){
		
			public int compare(Items o1, Items o2) {
				// TODO Auto-generated method stub
				return o1.getItenName().compareTo(o2.getItenName());
			}
		};
	
		Collections.sort(list, sortName1);
	
		for(Items item:list) {
			System.out.println(item);
		}

System.out.println("AFTER SORTING Name using anonymous/inline class(ascending order)");
		
		Comparator<Items> sortName2=new Comparator<Items>(){
		
			public int compare(Items o1, Items o2) {
				// TODO Auto-generated method stub
				return o2.getItenName().compareTo(o1.getItenName());
			}
		};
	
		Collections.sort(list, sortName2);
	
		for(Items item:list) {
			System.out.println(item);
		}
		
System.out.println("AFTER SORTING Name using anonymous/inline class(ascending order)");
		
		Comparator<Items> sortPrice1=new Comparator<Items>(){
		
			public int compare(Items o1, Items o2) {
				// TODO Auto-generated method stub
				return (int)(o1.getPrice()-o2.getPrice());
			}
		};
	
		Collections.sort(list, sortPrice1);
	
		for(Items item:list) {
			System.out.println(item);
		}
		
System.out.println("AFTER SORTING Name using anonymous/inline class(descending order)");
		
		Comparator<Items> sortPrice2=new Comparator<Items>(){
		
			public int compare(Items o1, Items o2) {
				// TODO Auto-generated method stub
				return (int)(o2.getPrice()-o1.getPrice());
			}
		};
	
		Collections.sort(list, sortPrice2);
	
		for(Items item:list) {
			System.out.println(item);
		}
		
	}
}
