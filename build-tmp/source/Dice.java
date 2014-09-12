import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Dice extends PApplet {

PImage electric;
public void setup()
{
	size(600,600);
	electric = loadImage("ElectricStorm.jpg");
	noLoop();
}
public void draw()
{

	image(electric,0,0,600,600);
    stroke((int)(Math.random()*39)+44,(int)(Math.random()*14)+104,(int)(Math.random()*136)+120);
	Die one = new Die(110,260);
	Die two = new Die(410,260);
	Die three = new Die(260,110);
	Die four = new Die(260,410);
	Die five = new Die(260,260);
	Die six = new Die(110,110);
	Die seven = new Die(110,410);
    Die eight = new Die (410,110);
    Die nine = new Die(410,410);
    one.show();
    two.show();
    three.show();
    four.show();
    five.show();
    six.show();
    seven.show();
    eight.show();
    nine.show();
    textAlign(CENTER);
    textSize(50);
    fill(0,220,50);
    text("total dots: " + (one.rollNum + two.rollNum + three.rollNum + four.rollNum + five.rollNum + six.rollNum + seven.rollNum + eight.rollNum + nine.rollNum), 300,50);
}
public void mousePressed()
{
	redraw();
}
class Die //models one single dice cube
{
	int myX, myY, rollNum ;
	Die(int x, int y) //constructor
	{
		roll();
        myX = x;
        myY = y;
        rollNum = (int)(Math.random()*6)+1;
	}
	public void roll()
	{
		rollNum = (int)(Math.random()*6)+1;
	}
	public void show()
	{
	  fill(0,0,220,120);
	  rect(myX,myY,80,80);
      if(rollNum == 1)
	  {
		fill(0);
		ellipse(myX+40,myY+40,30,30);
	  }
	  if(rollNum == 2)
	  {
	  	fill(0);
	  	ellipse(myX+20,myY+40,25,25);
	  	ellipse(myX+60,myY+40,25,25);

	  }
	  if(rollNum == 3)
	  {
	  	fill(0);
	  	ellipse(myX+40,myY+40,20,20);
	  	ellipse(myX+60,myY+20,20,20);
	  	ellipse(myX+20,myY+60,20,20);
	  }
	  if(rollNum == 4)
	  {
	  	fill(0);
	  	ellipse(myX+20,myY+20,25,25);
	  	ellipse(myX+60,myY+20,25,25);
	  	ellipse(myX+60,myY+60,25,25);
	  	ellipse(myX+20,myY+60,25,25);
	  }
	  if(rollNum == 5)
	  {
	  	fill(0);
	  	ellipse(myX+40,myY+40,18,18);
	  	ellipse(myX+20,myY+20,18,18);
	  	ellipse(myX+60,myY+20,18,18);
	  	ellipse(myX+60,myY+60,18,18);
	  	ellipse(myX+20,myY+60,18,18);
	  }
	  if(rollNum == 6)
	  {
	  	fill(0);
	  	ellipse(myX+20,myY+20,15,15);
	  	ellipse(myX+20,myY+60,15,15);
	  	ellipse(myX+20,myY+40,15,15);
	  	ellipse(myX+60,myY+20,15,15);
	  	ellipse(myX+60,myY+60,15,15);
	  	ellipse(myX+60,myY+40,15,15);
	  }
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Dice" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
