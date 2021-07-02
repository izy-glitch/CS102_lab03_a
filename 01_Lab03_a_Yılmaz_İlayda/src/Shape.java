public abstract class Shape implements Locatable, Selectable{

    int x = 0;
    int y = 0;
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract int getX();
    public abstract int getY();
    public abstract void setLocation(int x, int y);
    public abstract String toString();
    public abstract Shape contains(int x, int y );
    public abstract void setSelected( boolean selected );
    public abstract boolean getSelected();


}
