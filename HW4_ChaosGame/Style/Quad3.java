package chaos;
import chaos.StdDraw;
import java.util.Random;

public class Rectangle {
    public static void drawRectangleChaos(double ax, double ay, 
                                         double bx, double by,
                                         double cx, double cy,
                                         double dx, double dy,
                                         int nPoints) {
        // Step 1: Initialize the random number generator
        Random rand = new Random();
        // Step 2: Draw the points on the triangle slightly
        // larger in red
        StdDraw.setPenRadius(0.03);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(ax, ay);
        StdDraw.point(bx, by);
        StdDraw.point(cx, cy);
        StdDraw.point(dx, dy);
        // Step 3: Draw the rest of the points smaller in blue
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLUE);
        
        StdDraw.point(ax, ay);
        rand.nextInt(4);
        double px = ax;
        double py = ay;
        
        int lastChoice = 0;
          
        int count = 0;
        while (count < nPoints) {
           int choice = rand.nextInt(4);
            
           if (lastChoice != choice){
           
           if (choice == 0){
               px = (ax + px)/2;
               py = (ay + py)/2;
               lastChoice = 0;
            }
           if (choice == 1){
               px = (bx + px)/2;
               py = (by + py)/2;
               lastChoice = 1;
           }
           if (choice == 2){
               px = (cx + px)/2;
               py = (cy + py)/2;
               lastChoice = 2;
           }
           if (choice == 3){
               px = (dx + px)/2;
               py = (dy + py)/2;
               lastChoice = 3;
           }
           
           
           StdDraw.point(px, py);
           
            count++;}

           }
        
        
    }
        public static void main(String[] args) {
        drawRectangleChaos(0.1, 0.1, 0.1, 0.9, 0.9, 0.9, 0.9, 0.1, 20000);
    }
    
    
    
    }
    
    

