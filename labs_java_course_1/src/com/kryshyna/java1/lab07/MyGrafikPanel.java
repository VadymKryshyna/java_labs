package com.kryshyna.java1.lab07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

/**
 * @author Kryshyna Vadym
 */

//Реализация класса панели окна
@SuppressWarnings("serial")
public class MyGrafikPanel extends JPanel{
	int choose;
	public void paint(Graphics g){

      double x = 0, y = 0, i = 0, k1 = this.getWidth()/30, k2 = this.getHeight()/11, step = 0.001;
      g.drawLine(20,this.getHeight()/2 , this.getWidth()-20, this.getHeight()/2);
      g.drawLine(this.getWidth()/2, 20, this.getWidth()/2, this.getHeight()-20);
      g.drawLine(this.getWidth()-20, this.getHeight()/2, this.getWidth()-30, this.getHeight()/2-2);
      g.drawLine(this.getWidth()-20, this.getHeight()/2, this.getWidth()-30, this.getHeight()/2+2);
      g.drawLine(this.getWidth()/2, 20, this.getWidth()/2-2, 30);
      g.drawLine(this.getWidth()/2, 20, this.getWidth()/2+2, 30);
      g.drawString("0", this.getWidth()/2+2, this.getHeight()/2+12);
      g.drawString("X", this.getWidth()-30, this.getHeight()/2+15);
      g.drawString("Y", this.getWidth()/2-15, 30);

      switch (choose)
      {
          case 1:{
          	g.setColor(Color.BLUE);
          	for (i=-4*Math.PI;i<4*Math.PI;i+=step){
          		x = i;
          		y = Math.sin(x+1)*3;
          		x = x * k1;
          		y = y * k2;
          		g.drawLine((int)x+this.getWidth()/2, (int)y+this.getHeight()/2, (int)x+this.getWidth()/2, (int)y+this.getHeight()/2);
          	}

          	break;
          }
          case 2:{
          	g.setColor(Color.GREEN);
          	for (i = -4*Math.PI; i < 4*Math.PI;i+=step){
          		x = i;
          		y = Math.sin(x+2)*2;
          		x = x*k1;
          		y = y*k2;
          		g.drawLine((int)x+this.getWidth()/2, (int)y+this.getHeight()/2, (int)x+this.getWidth()/2, (int)y+this.getHeight()/2);
          	}
          	break;
          }
          case 3:{
          	g.setColor(Color.RED);
          	for (i = -4*Math.PI; i < 4*Math.PI; i+=step){
          		x = i;
          		y = Math.sin(x+1)*3 + Math.sin(x+2)*2;
          		x = x*k1;
          		y = y*k2;
          		g.drawLine((int)x+this.getWidth()/2, (int)y+this.getHeight()/2, (int)x+this.getWidth()/2, (int)y+this.getHeight()/2);
          	}
          	break;
          }
          case 4:{   	
          	g.setColor(Color.BLUE);
          	for (i = -4*Math.PI; i < 4*Math.PI; i+=step){
          		x = i;
          		y = Math.sin(x+1)*3;
          		x = x*k1;
          		y = y*k2;
          		g.drawLine((int)x+this.getWidth()/2, (int)y+this.getHeight()/2, (int)x+this.getWidth()/2, (int)y+this.getHeight()/2);
          	}
          	g.setColor(Color.GREEN);
          	for (i = -4*Math.PI; i < 4*Math.PI; i+=step){
          		x = i;
          		y = Math.sin(x+2)*2;
          		x = x*k1;
          		y = y*k2;
          		g.drawLine((int)x+this.getWidth()/2, (int)y+this.getHeight()/2, (int)x+this.getWidth()/2, (int)y+this.getHeight()/2);
          	}
          	g.setColor(Color.RED);
          	for (i = -4*Math.PI; i < 4*Math.PI; i+=step){
          		x = i;
          		y = Math.sin(x+1)*3 + Math.sin(x+2)*2;
          		x = x*k1;
          		y = y*k2;
          		g.drawLine((int)x+this.getWidth()/2, (int)y+this.getHeight()/2, (int)x+this.getWidth()/2, (int)y+this.getHeight()/2);
          	}
          	
          	break;
          }
          case 5:{	break;	}
      }
	}
}

