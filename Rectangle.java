package ThingForMarchal;

public class Rectangle {
    public int width = 1;
    public int height = 1;
    public int area = width*height;
    Rectangle(){

    }
    Rectangle(int w,int h)throws IllegalArgumentException {if(w>0&&h>0){width = w; height = h; area = w*h;}else{ throw new IllegalArgumentException("YOU DON GOOFED");}}
    public boolean isSquare(){return width==height;}
    public void quadratize(){
        double ar = Math.round(area);
        width = (int)Math.round(Math.sqrt(ar));
        height = (int)Math.round(Math.sqrt(ar));
    }

    public static void main(String args[]){
        Rectangle rect = new Rectangle();
        System.out.println(rect.isSquare());
        rect = new Rectangle(2,3);
        System.out.println(rect.isSquare());
        rect.quadratize();
        System.out.println(rect.isSquare());
    }
}
