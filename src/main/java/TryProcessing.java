import processing.core.PApplet;
public class TryProcessing extends PApplet {
    public static final int WIDTH =640;
    public static final int HEIGHT =480;
    public static final int DIAMETER = 50;
    int x;
    int y;
    int z;
    int a;
    int i;

    public static void main(String[] args) {


        PApplet.main("TryProcessing",args);}
        @Override
        public void settings()
        {
            System.out.println("Settings called");
            super.settings();
            int WIDTH = 640;
            int HEIGHT = 480;
            size(WIDTH, HEIGHT);
        }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
            firstRow();
            secondRow();
            thirdRow();
            fourthRow();
    }
    public void firstRow()
    {
        ellipse(x,HEIGHT/5,DIAMETER,DIAMETER);
        x+=1;
    }
    public void secondRow()
    {
        ellipse(y,2*HEIGHT/5,DIAMETER,DIAMETER);
        y+=2;
    }
    public void thirdRow()
    {
        ellipse(z,3*HEIGHT/5,DIAMETER,DIAMETER);
        z+=3;
    }
    public void fourthRow()
    {
        ellipse(a,4*HEIGHT/5,DIAMETER,DIAMETER);
        a+=4;
    }

}

