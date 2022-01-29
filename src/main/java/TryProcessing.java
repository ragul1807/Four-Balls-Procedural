import processing.core.PApplet;


public class TryProcessing extends PApplet {
    public static final int WIDTH =640;
    public static final int HEIGHT =480;
    public static final int DIAMETER = 50;
    int[] arr =new int[4];

    public static void main(String[] args) {


        PApplet.main("TryProcessing",args);}
        @Override
        public void settings()
        {
            System.out.println("Settings called");
            super.settings();
            size(WIDTH, HEIGHT);
        }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        for(int i=0;i<4;i++)
        {
            int h=calculateHeight(i);
            drawEllipse(i,arr,h);
        }
    }

    private int calculateHeight(int i) {
        return (i+1)*HEIGHT/5;
    }

    private void drawEllipse(int i, int[] arr, int height) {
        ellipse(arr[i],height,DIAMETER,DIAMETER);
        arr[i] += i+1;
    }



}

