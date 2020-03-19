
import chaos.StdDraw;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackh
 */
public class Quad {
    
    public static void drawQuadChaos(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy, int nPoints){
        Random rand = new Random(4);
        StdDraw.setPenRadius(0.02);
        StdDraw.setPenColor(StdDraw.RED);
        
        StdDraw.point(ax, ay);
        StdDraw.point(bx, by);
        StdDraw.point(cx, cy);
        StdDraw.point(dx, dy);
        
        StdDraw.setPenRadius(0.005);
        StdDraw.setPenColor(StdDraw.BLUE);
        
        double px = ax;
        double qy = ay;
        int counter = 0;
        
        int lastChoice = 0;
        
        
        while (counter < nPoints) {
            int dot = rand.nextInt(4);
            
            if (dot==0 && lastChoice != 0){
                px = (px + ax) / 2;
                qy = (qy + ay) / 2;
                counter ++;
                StdDraw.point(px, qy);
            }
            
            if (dot==1 && lastChoice != 1){
                px = (px + bx) / 2;
                qy = (qy + by) / 2;
                counter ++;
                StdDraw.point(px, qy);
            }
            
            if (dot==2 && lastChoice != 2){
                px = (px + cx) / 2;
                qy = (qy + cy) / 2;
                counter ++;
                StdDraw.point(px, qy);
            }
            
            if (dot==3 && lastChoice != 3){
                px = (px + dx) / 2;
                qy = (qy + dy) / 2;
                counter ++;
                StdDraw.point(px, qy);
            }
            lastChoice= dot;
        }     
    }  
    
    public static void main (String [] args){
        drawQuadChaos(0.1, 0.1, 0.1, 0.9, 0.9, 0.9, 0.9, 0.1, 20000);
    }
      
}