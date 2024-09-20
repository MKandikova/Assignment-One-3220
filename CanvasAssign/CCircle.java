/** @author Maria Kandikova
 *  @version September 18, 2024
 * 
 *  This is class circle which is a shape
 * since every shape can have an area calculated using calculateArea() then this class must implement calculateArea()
 */
public class CCircle extends CShape {
    private int r; //the length of radius must be >0

    /**constructor - overloaded
     * ensures r is valid users from the onset
     */
    public CCircle(int r){
        if(isValid(r)){
            this.r = r;
        }
        else{
            //default to one or to not set a defualt and throw an exception, forcing the user to provide a valid r value
            this.r = 1;
         }
    }
    /**
     * internal utility method to validate a side to be a positive value
     * @param s a side to be tested
     * @return true if valid, else false
     */
    private boolean isValid(int s){
        return (s>0)?true:false;
    }
    /**
     * implementing the abstract override from CShape 
     * will compute the area of a circle
     * @return area of circle (double)
     */
    public double calculateArea(){  
        return Math.PI*r*r;
    } 
    /**
     * toString override
     */
    public String toString(){
        return super.toString() + "->Circle of radius = "+r+" and area = " + String.format("%.2f", calculateArea());
    }

    
}

