package com.kryshyna.java2.lab02;

/**
 * @author Kryshyna Vadym
 */

public class MyTrapezium {
	int[]x;
	int[]y;
	
	MyTrapezium(int _x1, int _y1,int _x2, int _y2,int _x3, int _y3,int _x4, int _y4){
		x = new int [4];
		y = new int [4];
		x[0] = _x1; x[1] = _x2; x[2] = _x3; x[3] = _x4;
		y[0] = _y1; y[1] = _y2; y[2] = _y3; y[3] = _y4;
		
	}
	
	double lengthLine(int num){
		int n1, n2;
		if (num > 4 || num < 1){	return 0;	}
		if( num == 4){ n1 = 0; n2 = num - 1;	}
		else { n1 = num; n2 = num - 1;	}
		return Math.pow(((x[n1]-x[n2])*(x[n1]-x[n2])+(y[n1]-y[n2])*(y[n1]-y[n2])), 0.5);
	}
	
	public double perimetr(){
		return lengthLine(1)+lengthLine(2)+lengthLine(3)+lengthLine(4);
	}

	boolean isParalels(int num){
		if(num < 1 || num > 2){	return false;	}
		if(num == 1){	return (((y[1]-y[0])*(x[2]-x[3])) == ((y[2]-y[3])*(x[1]-x[0])));	}
		else{	return (((y[0]-y[3])*(x[1]-x[2])) == ((y[1]-y[2])*(x[0]-x[3])));	}
	}
	
	public double square(){
		double h;
		int a1, b1;
		double a, b, c, d;
		if(isParalels(1)){
			a = lengthLine(3);
			b = lengthLine(1);
			c = lengthLine(4);
			d = lengthLine(2);
			a1 = 1; b1 = 3;
		}else{
			a = lengthLine(4);
			b = lengthLine(2);
			c = lengthLine(1);
			d = lengthLine(3);
			a1 = 2; b1 = 4;
		}
		if(((a-b)*(a-b)+c*c-d*d)==0 &&(2*(a-b))==0){
			h = Math.pow((c*c), 0.5);
		}else{
			h = Math.pow((c*c-((((a-b)*(a-b)+c*c-d*d)/(2*(a-b)))*
			   				   (((a-b)*(a-b)+c*c-d*d)/(2*(a-b))))), 0.5);
		}
		return ((lengthLine(a1)+lengthLine(b1))/2)*h;
	}
	
	public String toString(){
		return "x1="+x[0]+" y1="+y[0]+
				"; x2="+x[1]+" y2="+y[1]+
				"; x3="+x[2]+" y3="+y[2]+
				"; x4="+x[3]+" y4="+y[3]+"; "+
				"square="+this.square()+" perimetr="+this.perimetr()+";";
	}
	
	static boolean isTrapezium(int x1, int y1,int x2, int y2,int x3, int y3,int x4, int y4)
	{
		if((((y2 - y1) * (x3 - x4)) == ((y3 - y4) * (x2 - x1)))||
				(((y1 - y4) * (x2 - x3)) == ((y2 - y3) * (x1 - x4)))){
			return true;
		}
		return false;
	}				
}
