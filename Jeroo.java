/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {
    // Put any methods here
    
    //this method turns the jeroo right
    public void turnRight()
{
  turn(LEFT);
  turn(LEFT);
  turn(LEFT);
  }
 // this method turns the Jeroo up or down
   public void turnVertical()
{
  turn(LEFT);
  turn(LEFT);
  }
// this method makes the jeroo hop and plant
    public void hopPlant()
{
  hop();
  plant();
  }
    

    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}
