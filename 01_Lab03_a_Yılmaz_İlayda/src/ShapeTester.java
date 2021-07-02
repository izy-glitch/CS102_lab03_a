import java.util.Scanner;
import java.util.ArrayList;

public class ShapeTester {

    public static void mainMenu(){

        System.out.println("************** MAIN MENU ***************");
        System.out.println("1.Create an empty set of shapes.");
        System.out.println("2.Add a shape.");
        System.out.println("3.Compute & print out the total surface area of the entire set of shapes.");
        System.out.println("4.Compute & print out the total perimeter of the entire set of shapes.");
        System.out.println("5.Information about the shapes.");
        System.out.println("6.Quit.");
    }

    public static void shapeMenu(){

        System.out.println("***** SHAPE MENU *****");
        System.out.println("1.Add a new rectangle.");
        System.out.println("2.Add a new square.");
        System.out.println("3.Add a new circle.");
        System.out.println("4.Add a new triangle.");
        System.out.println("5.Back to the Main Menu. ");

    }

    public static void main(String[] args){

        Rectangle rectShape;
        Square squareShape;
        Circle circleShape;
        Triangle triShape;
        int mainInput = 0;
        int shapeInput = 0;
        Scanner mainScan = new Scanner( System.in );
        Scanner shapeScan = new Scanner( System.in );
        ShapeContainer shapeSet = new ShapeContainer();

        do{
            mainMenu();

            System.out.println("Select the operation to be performed: ");
            mainInput = mainScan.nextInt();

            if( mainInput == 1 ){
                shapeSet = new ShapeContainer();
            }
            else if ( mainInput == 2 ){
                do{
                    shapeMenu();

                    System.out.println("Select the operation to be performed: ");
                    shapeInput = mainScan.nextInt();

                    if ( shapeInput == 1 ){
                        System.out.print("Enter the width: " );
                        int width = shapeScan.nextInt();
                        System.out.print("Enter the height: " );
                        int height = shapeScan.nextInt();
                        rectShape = new Rectangle( width, height );
                        shapeSet.add( rectShape );
                    }
                    else if ( shapeInput == 2 ){
                        System.out.print("Enter the side: " );
                        int side = shapeScan.nextInt();
                        squareShape = new Square( side );
                        shapeSet.add( squareShape );
                    }
                    else if ( shapeInput == 3 ){
                        System.out.print("Enter the radius: " );
                        int radius = shapeScan.nextInt();
                        circleShape = new Circle( radius );
                        shapeSet.add( circleShape );
                    }
                    else if ( shapeInput == 4 ){
                        System.out.print("Enter one of the sides : " );
                        int a = shapeScan.nextInt();
                        System.out.print("Enter another one of the sides : " );
                        int b = shapeScan.nextInt();
                        System.out.print("Enter the last one of the sides : " );
                        int c = shapeScan.nextInt();
                        triShape = new Triangle( a, b, c );
                        shapeSet.add( triShape );
                    }
                }while( shapeInput != 5 );
            }
            else if ( mainInput == 3 ){
                System.out.println("Total area of the set: " + shapeSet.getArea());
            }
            else if ( mainInput == 4 ){
                System.out.println("Total perimeter of the set: " + shapeSet.getPerimeter());
            }
            else if ( mainInput == 5 ){
                System.out.println( shapeSet.toString() );
            }
        }while ( mainInput != 6 );
    }
}
