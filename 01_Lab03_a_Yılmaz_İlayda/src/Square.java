public class Square extends Rectangle {

    int side;

    public Square( int side ){
        super( side, side );
        this.side = side;
        setLocation( x, y );
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

    public String toString(){
        return "This Square's sides are " + this.side + ". Its area is " + this.getArea() + "and perimeter is "
                + this.getPerimeter() + ". It is selected:  " + this.getSelected() + ".\n";
    }


}
