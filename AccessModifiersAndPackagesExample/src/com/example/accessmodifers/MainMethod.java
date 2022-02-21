package com.example.accessmodifers;

import java.util.ArrayList;
import java.util.List;

import in.example.accessmodifiers.Addition;

public class MainMethod {

	public static void main(String[] args) {
		Calculator cl = new Calculator();
		cl.add();
		cl.hello();
		cl.hi();
		System.out.println("...........................");
		Addition ad = new Addition();
		ad.add1();
		System.out.println("...........................");

		Summation sm = new Summation();
		sm.java();
		
		//List<Integer> ll = new ArrayList<>();
	}

}
