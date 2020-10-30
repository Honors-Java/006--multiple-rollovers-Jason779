void setup() {
	size(400, 400);
  
}

void draw() {
	background(255);
	stroke(0); 
  //Fill a background color
 background(240)
  //start creating the lines
line(200,0,200,400);
line(0,200,400,200);
 
  //Build your conditional statement 
	if (mouseX < width/2 && mouseY < height/2){
    fill(0);
    rect(0,0,200,200);
  }
 
 if (mouseX < width/2 && mouseY > height/2){
    fill(0);
    rect(0,200,200,200);
  }

  if (mouseX > width/2 && mouseY > height/2){
    fill(0);
    rect(200,200,200,200);
  }

  if (mouseX > width/2 && mouseY < height/2){
    fill(0);
    rect(200,0,200,200);
  }

  
}