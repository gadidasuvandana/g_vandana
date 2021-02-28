import processing.core.PApplet;
public class TryProcessing extends PApplet{
    int x1,x2,x3,x4=0;
    public static final int WIDTH = 1000;
    public static final int HEIGHT = 1000;
    public static void main(String[] args){
    PApplet.main("TryProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        System.out.println("Printed from setup function");
        //ellipse(WIDTH/2,HEIGHT/2,100,100);
    }

    @Override
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
