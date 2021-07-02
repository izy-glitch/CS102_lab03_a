public class Triangle extends Shape {


    int a;
    int b;
    int c;
    int s = ( a * b * c) / 2;

    int x;
    int y;
    boolean selected;

    public Triangle ( int a, int b, int c ){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getArea(){
        return Math.pow( s * ( s - a ) * ( s - b ) * ( s - c ) , 1/2 ) ;
    }

    public double getPerimeter(){
        return ( a + b + c );
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

        double r = getArea() / s;

        if( Math.pow( ( this.getX() - x ) , 2 ) + Math.pow( (  this.getY() - y ) , 2 ) <= Math.pow( r , 2 ) ) {
            return this;
        }
        else {
            return null;
        }
    }

    public String toString(){
        return "This Triangle's sides are " + this.a + ", " + this.b + ", " + this.c +". Its area is " +
                this.getArea() + "and perimeter is " + this.getPerimeter() + ". It is selected:  " + this.getSelected()
                + ".\n";
    }




}