package com.test;
import java.util.Scanner;

import com.shape.*;

public class TestPolygon {
	public static void main(String[] args) {
		Square sq= new Square();
		Rectangle rec = new Rectangle();
		Scanner sc=new Scanner(System.in);
		System.out.print("side of the Square : ");
		sq.side=sc.nextFloat();
		System.out.print("Length of the Rectangle : ");
		rec.length = sc.nextFloat();
		System.out.print("Breath of the Rectangle : ");
		rec.breath = sc.nextFloat();
		System.out.println();
		sq.calcArea();
		sq.calcPeri();
		rec.calcArea();
		rec.calcPeri();
		
	}
}
