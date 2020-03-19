/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaos;
import chaos.StdDraw;
import java.util.Random;


public class Quad {
    
    public static void drawQuadChaos(double ax, double ay,
                                     double bx, double by,
                                     double cx, double cy,
                                     double dx, double dy,
                                     int nPoints) {
        Random rand = new Random();
        StdDraw.setPenRadius(0.03);
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.point(ax, ay);
        StdDraw.point(bx, by);
        StdDraw.point(cx, cy);
        StdDraw.point(dx, dy);
        
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLUE);
        
        double px = ax;
        double py = ay;
        int PriorChoice = -1;
        for (int PointsDrawn = 0; PointsDrawn < nPoints; PointsDrawn++) {
            int choice = rand.nextInt(4);
            if (choice != PriorChoice) {  
                PriorChoice = choice;
                if (choice == 0) {
                    px = (px + ax)/2;
                    py = (py + ay)/2;
                }
                else if (choice == 1) {
                    px = (px + bx)/2;
                    py = (py + by)/2;
                }
                else if (choice == 2) {
                    px = (px + cx)/2;
                    py = (py + cy)/2;
                }
                else if (choice == 3) {
                    px = (px + dx)/2;
                    py = (py + dy)/2;
                }
                StdDraw.point(px, py);
            } 
        }
        
}
    public static void main(String[] args) {
        drawQuadChaos(0.1, 0.1, 0.1, 0.9, 0.9, 0.1, 0.9, 0.9, 20000);
    }
}
