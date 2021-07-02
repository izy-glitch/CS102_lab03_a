public class Circle extends Shape {

    int radius;
    boolean selected;

    public Circle( int radius ){
        this.radius = radius;
    }

    public double getArea(){
        return ( Math.PI * Math.pow( radius , 2 ) );
    }

    public double getPerimeter(){
        return ( 2 * Math.PI * radius );
    }

    public void setLocation( int x, int y ) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public boolean getSelected() {
        return selected;
    }

    public void setSelected( boolean selected ) {
        this.selected = selected;
    }

    public Shape contains( int x, int y ) {

        if( Math.pow( ( this.getX() - x ) , 2 ) + Math.pow( (  this.getY() - y ) , 2 ) <= Math.pow( this.radius , 2 ) ){
            return this;
        }
        else {
            return null;
        }
    }

    public String toString(){
        return "This Circle's radius is " + this.radius + ". Its area is " + this.getArea() + "and perimeter is "
                + this.getPerimeter() + ". It is selected:  " + this.selected + ".\n";
    }
}