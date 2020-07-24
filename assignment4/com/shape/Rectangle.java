package com.shape;

public class Rectangle implements Polygon{
	public float length;
	public float breath;

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("AREA OF RECTANGLE : "+(length+breath));
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("PERIMETER OF RECTANGLE : "+(2*(length+breath)));
		
	}

}
