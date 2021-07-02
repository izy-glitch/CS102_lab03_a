import java.util.ArrayList;

public class ShapeContainer{

    ArrayList<Shape> shapeCont;

    public ShapeContainer(){
        shapeCont = new ArrayList<Shape>();
    }

    public void add ( Shape s ){
        shapeCont.add( s );
    }

    public double getArea(){
        double totalArea = 0;
        for( int i = 0; i < this.shapeCont.size(); i++ ){
            totalArea = totalArea + ( this.shapeCont.get( i ) ).getArea();
        }

        return totalArea;
    }

    public double getPerimeter(){
        double totalPer = 0;
        for( int i = 0; i < this.shapeCont.size(); i++ ){
            totalPer = totalPer + ( this.shapeCont.get( i ) ).getPerimeter();
        }

        return totalPer;
    }

    public Shape firstShape(int x, int y)
    {
        for( int i = 0; i < shapeCont.size(); i++) {
            if( ( shapeCont.get(i) ).contains( x, y ) != null ) {
                ( shapeCont.get(i) ).setSelected( true );
                return shapeCont.get(i);
            }
        }
        return null;
    }


    public void remove() {
        for ( int i = 0; i < shapeCont.size(); i++){
            if ( ( shapeCont.get(i) ).getSelected() == true ){
                shapeCont.remove( i) ;
            }
        }
    }

    public String toString(){
        String output = "";
        for( int i = 0; i < this.shapeCont.size(); i++ ){
            output = output + ( this.shapeCont.get( i ) ).toString();
        }

        return output;
    }
}