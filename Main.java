/**
 * Make the letter H as described in the Readme.md
 * IMPORTANT:  You can only use:
 *      hop()
 *      plant()
 *      turn(LEFT)
 *  Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    public static void runJerooCode() 
       // Write code here to make a letter here
       {
Jeroo mia = new Jeroo(0,0,EAST,50);
mia.hop();
mia.turn(LEFT);
mia.turn(LEFT);
mia.turn(LEFT);
mia.hop();
mia.plant();
mia.hop();
mia.plant();
mia.hop();
mia.plant();
mia.hop();
mia.plant();
  mia.hop();
mia.plant();
mia.turn(LEFT);
mia.turn(LEFT);
mia.hop();
mia.hop();
mia.turn(LEFT);
  mia.turn(LEFT);
  mia.turn(LEFT);
  mia.hop();
  mia.plant();
  mia.hop();
  mia.plant();
  mia.hop();
  mia.plant();
  mia.turn(LEFT);
  mia.hop();
mia.plant();
  mia.hop();
  mia.plant();
  mia.turn(LEFT);
  mia.turn(LEFT);
mia.hop();
  mia.hop();
  mia.hop();
  mia.plant();
  mia.hop();
  mia.plant();
  mia.hop();
  
  
  
  
  }
    
    
    

    

}
