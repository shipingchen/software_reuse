

public class InheritanceTester 
{
       public static void main(String[] args) 
      {  
             Rectangle rect = new Rectangle(10, 5);
             System.out.println("To draw a 10x5 rectangle: ");
             rect.draw();
       
             Square square = new Square(5);
             System.out.println("To draw a 5x5 square: ");
             square.draw();
    }
}


