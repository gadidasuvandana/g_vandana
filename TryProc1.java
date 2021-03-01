import processing.core.PApplet;

public class TryProc1 extends PApplet {
    int x1, x2, x3, x4 = 0;
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;

    public static void main(String args[]) {
        PApplet.main("TryProc1");
    }

    public void settings() {
        size(WIDTH, HEIGHT);
    }
    public void draw() {
        int DIA = 10;
        int h = WIDTH / 5;
        ellipse(x1, h, DIA, DIA);
        x1++;
        ellipse(x2,2*h,DIA,DIA);
        x2=x2+2;
        ellipse(x3,3*h,DIA,DIA);
        x3=x3+3;
        ellipse(x4,4*h,DIA,DIA);
        x4=x4+4;
    }


}
