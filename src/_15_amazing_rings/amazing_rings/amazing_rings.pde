int ellipseX1 = 100;
int ellipseX2 = 500;
int  speed = 1;


void setup(){
  size(600,600);
}

void draw(){
 background(102,130,12);
  
 noFill();
  
  for(int i = 0; i < 30;i++){
   ellipse(ellipseX1,300,300-i*10,300-i*10);
 }
  for(int i = 0; i <30;i++){
   ellipse(ellipseX2,300,300-i*10,300-i*10);
 } 
  
  
  ellipseX1+=speed;
  ellipseX2-=speed;
  
  if(ellipseX1 > width || ellipseX1 < 0){
    speed = -speed;
  }
 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
};
