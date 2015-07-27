package com.example.powersystems;

public class complex {
	float real;
	float imag;
 public complex(float a,float b){
	 this.real = a;
	 this.imag = b;
	 	  }
 public complex(int a,int b){
	 this.real = (float)a;
	 this.imag = (float)b;
	  }
 public float magnitude(){
	float mag =  (float) Math.sqrt(Math.pow(real, 2)+Math.pow(imag, 2));
	return mag;	 
 }
 public float angle(){
	 float angle = (float) Math.atan(imag/real);
	 return angle;
 }
 public float[] mul(complex a , complex b){
	 this.real = ((a.real)*(b.real))-((a.imag)*(b.imag));
	 this.imag = ((a.real)*(b.imag))+((a.imag)*(b.real));
	 float[] s = {this.real,this.imag};
	return s;
		 
 }
 public float[] sum(complex a,complex b){
	 this.real = a.real + b.real;
	 this.imag = a.imag + b.imag;
	 float[] s = {this.real,this.imag};
	 return s;
 }
}
