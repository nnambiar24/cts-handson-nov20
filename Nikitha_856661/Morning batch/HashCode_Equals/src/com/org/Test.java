package com.org;

import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Address> ad=new TreeSet<Address>((a1,a2)->Integer.compare(a1.getAccNo(),a2.getAccNo()));
		
		for(int i=10;i>0;i--) {
			ad.add(new Address(i,"Test: "+i));
		}
		
		ad.forEach(item->System.out.println(item));
	}

}
