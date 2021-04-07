
public class Rectangle extends Shape  {
    int length, height;

    public Rectangle() {}
    public Rectangle(final int length, 
                     final int height) {
        this.length = length;
        this.height = height;
    }

    @Override
    void draw() {
        for(int i=0; i<this.height; ++i) {
            for(int j=0; j<this.length; ++j){
                System.out.print("X");
            }
            System.out.println();
        }
    }
}
