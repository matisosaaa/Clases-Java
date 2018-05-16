int x1 = 100;
int y1 = 200;
int x2 = 500;
int y2 = y1;

void setup() {
  size(600, 400);
  rectMode(CENTER);
  ellipseMode(CORNER);
}

void draw() {
  background(216, 56, 234);
  stroke(0);
  strokeWeight(5);
  line(93, 200, 500, 200);
  fill(275, 75, 75);
  noFill();
  stroke(146, 255, 5);
  rect(width/2, height/2, 50, 80);
  stroke(255);
  ellipse(63, 164, 75, 75);
  ellipse(466, 164, 75, 75);
  noFill();
  triangle(275, 155, 324, 156, 300, 120);



  stroke(109, 212, 216);
  strokeWeight(25);
  point(x1, y1);
  point(x2, y2);
}
