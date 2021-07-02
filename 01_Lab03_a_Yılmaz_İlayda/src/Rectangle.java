public class Rectangle extends Shape {

    int width;
    int height;
    boolean selected;

    public Rectangle ( int width, int height ){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter() {
        return 2 * ( width + height );
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

    public Shape contains(int x, int y ) {

        if( (x >= this.getX() ) && (x <= this.getX() + width) && (y >= this.getY() ) &&
                (y <= this.getY() + height) ) {
            return this;
        }
        else {
            return null;
        }
    }

    public String toString(){
        return "This Rectangle's width is " + this.width + ", height is " + this.height + ". Its area is " +
                this.getArea() + "and perimeter is " + this.getPerimeter() + ". It is selected:  " + this.getSelected()
                + ".\n";
    }

}