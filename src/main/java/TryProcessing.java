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
        if(i%4==0)
        {
            firstRow();
            secondRow();
            thirdRow();
            fourthRow();
        }
        else if(i%4==1)
        {
            secondRow();
            thirdRow();
            fourthRow();
        }
        else if(i%4==2)
        {
            thirdRow();
            fourthRow();
        }
        else {
            fourthRow();
        }
        i++;
    }
    public void firstRow()
    {
        ellipse(x,HEIGHT/5,DIAMETER,DIAMETER);
        x++;
    }
    public void secondRow()
    {
        ellipse(y,2*HEIGHT/5,DIAMETER,DIAMETER);
        y++;
    }
    public void thirdRow()
    {
        ellipse(z,3*HEIGHT/5,DIAMETER,DIAMETER);
        z++;
    }
    public void fourthRow()
    {
        ellipse(a,4*HEIGHT/5,DIAMETER,DIAMETER);
        a++;
    }

}

