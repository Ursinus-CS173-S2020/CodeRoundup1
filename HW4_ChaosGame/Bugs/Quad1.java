
package chaos;
import chaos.StdDraw;
import java.util.Random;

public class Quad {
     public static void drawQuadChaos(double ax, double ay, 
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
        // TODO: Fill the rest in.  You should draw nPoints
        // total, starting with (ax, ay).  Every time, after that,
        // you should pick a random point a, b, or c, and draw
        // the point halfway in between the last point and the 
        // point you chose
        double lastX = ax;
        double lastY = ay;
        int counter = 0;
        double randX = 0;
        double randY = 0;
        double newX = 0;
        double newY = 0;
        int num = 0;
        while(counter<nPoints){
            randX = 0;
            randY = 0;
            boolean repeat = false;
            do{
            num = rand.nextInt(4);
            if(num == 0 && lastX != ax && lastY != ay){
                randX = ax;
                randY = ay;
                repeat = false;
            } else if(num == 1 && lastX != bx && lastY != by){
                randX = bx;
                randY = by;
                repeat = false;
            } else if(num == 2 && lastX != cx && lastY != cy){
                randX = cx;
                randY = cy;
                repeat = false;
            } else if(num == 3 && lastX != dx && lastY != dy){
                randX = dx;
                randY = dy;
                repeat = false;
            } else {
                repeat = true;
            }
                
            }while(repeat);
            newX = (lastX + randX) / 2;
            newY = (lastY + randY) / 2;
            StdDraw.point(newX,newY);
            num = rand.nextInt(4);
            lastX = newX;
            lastY = newY;
            counter++;
        }
    }
    
    public static void main(String[] args) {
        drawQuadChaos(0.1, 0.1, 0.1, 0.9, 0.9, 0.9, 0.9, 0.1, 20000);
        
    }
}
