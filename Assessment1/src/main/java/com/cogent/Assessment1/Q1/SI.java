package com.cogent.Assessment1.Q1;

public class SI {
	
	static float p = 5; //principle
	static float r = 5; //rate
	int t;
	
	SI( int time){
		t=time;			//Time
	}
	void diplay(){
		float total = (p*r*t)/100;
		System.out.println("The total amount to be paid after Load duration ends is: $"+total);
	}
}
