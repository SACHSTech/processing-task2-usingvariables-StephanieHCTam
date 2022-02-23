import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
  * Program Sketch.java visually draws a bird on grass that scales proportionally with any sized window. 
  * @author: Stephanie Tam
  */
  
  public void settings() {
	// size call 
    size(600, 600);
  }
  
  // Blue Background
  public void setup() {
    background(173, 230, 255);
  }

  public void draw() {

    // Grass Foreground
    fill(7, 179, 10);
    rect(0, (float)(height/1.14), width, height/7);
    
    fill(61, 2, 2);
    rect(0, (float)(height/1.05), width, height/10);

    // Bird
    fill(242, 22, 84);
    ellipse(width/2, height/2, (float)(width/1.5), (float)(height/1.7));

    fill(173, 122, 245);
    ellipse(width/2, (float)(height/1.5), (float)(width/2.5), height/4);

    // Wings
    fill(92, 0, 222);
    triangle((float)(width/1.25), (float)(height/2.1), (float)(width/1.25), (float)(height/1.6), (float)(width/1.04), (float)(height/2.1));
    
    fill(92, 0, 222);
    triangle(width/5, (float)(height/2.1), width/5, (float)(height/1.6), (float)(width/26.7), (float)(height/2.1));

    // Beak
    fill(255, 233, 38);
    triangle((float)(width/2.35), (float)(height/2.2), width/2, (float)(height/1.73), (float)(width/1.73), (float)(height/2.2));

    // Eyes
    fill(24, 0, 102);
    ellipse((float)(width/2.2), (float)(height/2.35), width/20, (float)(height/13.3));

    fill(24, 0, 102);
    ellipse((float)(width/1.86), (float)(height/2.35), width/20, (float)(height/13.3));

    // Legs
    fill(15, 0, 0);
    rect((float)(width/2.2), (float)(height/1.27), width/80, (float)(height/11.4));

    fill(15, 0, 0);
    rect((float)(width/1.82), (float)(height/1.27), width/80, (float)(height/11.4));
  }
}