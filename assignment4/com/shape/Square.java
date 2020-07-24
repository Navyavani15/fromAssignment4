package com.shape;

public class Square implements Polygon{
public float side;
	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		System.out.println("AREA OF SQUARE : "+(side*side));
		
	}

	@Override
	public void calcPeri() {
		// TODO Auto-generated method stub
		System.out.println("PERIMETER OF SQUARE : "+(4*side));
	}

}
