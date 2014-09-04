package com.kryshyna.java1.lab08;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 * @author Kryshyna Vadym
 */

/**
 * Задание:
 * Написать программу на языке Java в виде GUI апплета. 
 * Условия:
 * Создать апплет, в котором заданный четырехугольник вращается
 * вокруг своего центра тяжести. Цвет четырехугольника изменяется 
 * при вращении на 90 градусов.
 */

@SuppressWarnings("serial")
public class MyApplet extends Applet implements Runnable{
	private int x[] = new int[4];
	private int y[] = new int[4];
	private int xCenter, yCenter, size, lengthFrom0;
	private Thread thread;
	private Color [] color = {Color.RED, Color.BLUE, Color.GREEN, Color.YELLOW};
	private int numbColor = 0;
	
	void func(double i){
   		x[0] = (int)(lengthFrom0*Math.cos((i+45)*Math.PI/180))+xCenter;
   		x[1] = (int)(lengthFrom0*Math.cos((i+90+45)*Math.PI/180))+xCenter;
		x[2] = (int)(lengthFrom0*Math.cos((i+180+45)*Math.PI/180))+xCenter;
		x[3] = (int)(lengthFrom0*Math.cos((i+270+45)*Math.PI/180))+xCenter;
		y[0] = (int)(lengthFrom0*Math.sin((i+45)*Math.PI/180))+yCenter;
		y[1] = (int)(lengthFrom0*Math.sin((i+90+45)*Math.PI/180))+yCenter;
		y[2] = (int)(lengthFrom0*Math.sin((i+180+45)*Math.PI/180))+yCenter;
		y[3] = (int)(lengthFrom0*Math.sin((i+270+45)*Math.PI/180))+yCenter;
	}
	
	public void init() {
        setSize(400, 400);
    	xCenter = (int)this.getWidth()/2;
    	yCenter = (int)this.getHeight()/2;
    	size = (int)this.getWidth()/5;
    	lengthFrom0 = (int) Math.sqrt(size*size*2.0);
    	for (int i = 0; i <x.length; i++){
    		x[i] = 0;
    		y[i] = 0;
    	}
    	
    }
	
    public void start()  {
        if (thread == null) {
        	thread = new Thread(this);
        	thread.start();
        }

    }

    public void stop(){
        thread = null;
    }

	@Override
	public void run() {
        try{
        	for(double grad = 0.0; grad < 360.0; grad = grad+1){
        		if(grad>0&&grad<90){	numbColor = 0;	}
        		if(grad>90&&grad<180){	numbColor = 1;	}
        		if(grad>180&&grad<270){	numbColor = 2;	}
        		if(grad>270&&grad<360){	numbColor = 3;	}
        		
        		func(grad);
        		repaint();
        		Thread.sleep(10);
        		if(grad == 359.0){ grad = 0;	}
        	}
		} catch (InterruptedException e) {}
	}

    public void paint(Graphics g) {
    	g.setColor(color[numbColor]);
    	g.drawPolygon(x, y, x.length);

    }

}

