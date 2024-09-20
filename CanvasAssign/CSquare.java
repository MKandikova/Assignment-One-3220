/** @author Maria Kandikova
 *  @version September 18, 2024
 * 
 *  This is class square which is a shape
 * since every shape can have an area calculated using calculateArea() then this class must implement calculateArea()
 */

public class CSquare extends CShape {
    private int l; //a length of the side must be >0

    /**constructor - overloaded
     * ensures l and w are valid users from the onset
     */
    public CSquare(int l){
        if(isValid(l)){
            this.l = l;
        }
        else{
            //default to one or to not set a defualt and throw an exception, forcitng the user to provide a valid l and w values
            this.l = 1;
        }
    }
    /**
     * internal utility method to validate a side to be a positive value
     * @param s a side to be tested
     * @return tue if valid, else false
     */
    private boolean isValid(int s){
        return (s>0)?true:false;
    }
    /**
     * implimenting the abstract override from CShape 
     * will compute the area of a square
     * @return area of square (double)
     */
    public double calculateArea(){  
        return l*l;
    } 
    /**
     * toString override
     */
    public String toString(){
        return super.toString() + "->Square of length = "+l+" and area = "+calculateArea();
    }
}
