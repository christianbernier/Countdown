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

public class Countdown extends PApplet {

PFont myFont;
float xPos, yPos;
int seconds;
int backRed;
int backGreen;
int backBlue;
int oldSeconds;
String secondsImport;


public void setup() {
  size(500, 500);
  secondsImport = loadStrings("seconds.txt")[0];
  xPos = 150;
  yPos = height/2;
  backRed = 255;
  backGreen = 255;
  backBlue = 255;
  seconds = parseInt(secondsImport);
  oldSeconds = seconds;
}

public void draw() {
  background(backRed, backGreen, backBlue);
  myFont = createFont("Aharoni-Bold-48", 48);
  if(seconds > oldSeconds/4*3){
   fill(0);
  } else{
    if(seconds >oldSeconds/2){
     fill(255, 255, 0); 
    } else{
     if(seconds >oldSeconds/4){
      fill(247, 126, 5);
     } else{
      fill(255, 0, 0); 
     }
    }
  }
  //fill(0);
  textFont(myFont, 36);
  frameRate(1);

  text(seconds + " Second(s)", xPos, yPos);
  println("text");
  seconds = seconds - 1;
  if (seconds<=0) {
    seconds = oldSeconds;
  }
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Countdown" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
