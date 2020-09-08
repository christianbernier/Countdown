PFont myFont;
float xPos, yPos;
int seconds;
int backRed;
int backGreen;
int backBlue;
int oldSeconds;
String secondsImport;


void setup() {
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

void draw() {
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

