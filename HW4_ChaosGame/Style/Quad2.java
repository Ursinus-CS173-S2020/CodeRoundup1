package chaos;
import chaos.StdDraw;
import java.util.Random;


public class Quad {
    
    /**
     * Draw the Sierpinski Triangle
     * 
     * @param ax X coordinate of first point
     * @param ay Y coordinate of first point
     * @param bx X coordinate of second point
     * @param by Y coordinate of second point
     * @param cx X coordinate of third point
     * @param cy Y coordinate of third point
     * @param dx X coordinate of fourth point
     * @param dy Y coordinate of fourth point
     * @param nPoints Number of points to sample
     * 
     */
    public static void drawquadChaos(double ax, double ay, 
                                         double bx, double by,
                                         double cx, double cy,
                                         double dx, double dy,
                                         int nPoints) {
        // Step 1: Initialize the random number generator
        Random rand = new Random();
        rand.nextInt(3);
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
        double px = ax;
        double py = ay;
        int ntimes = 0;
        int temp = -1;
        while(ntimes<= nPoints){
           
            int choice = rand.nextInt(4);
            while (choice==temp){
                choice = rand.nextInt(4);
                
            }
            
            if (choice==0){
                px = (px + ax)/2;
                py = (py + ay)/2;
                ntimes++;
                StdDraw.point(px, py);
            }
            if (choice==1){
                px = (px+bx)/2;
                py = (py + by)/2;
                ntimes++;
                StdDraw.point(px,py);
            }
            if (choice == 2){
                px = (px + cx)/2;
                py = (py + cy)/2;
                ntimes++;
                StdDraw.point(px,py);
            
            }
            if (choice == 3){
                px = (px + dx)/2;
                py = (py + dy)/2;
                ntimes++;
                StdDraw.point(px,py);
                
            }
            temp = choice;
            
                        
            
            
        }
        
               
    }
    
    public static void main(String[] args) {
        drawquadChaos(0.1, 0.1, 0.1, 0.9, 0.9, 0.9, 0.9, 0.1, 20000);
    }
}
