/** @author Maria Kandikova
 *  @version September 18, 2024
 * 
 *  This is class Oval which is a shape
 * since every shape can have an area calculated using calculateArea() then this class must implement calculateArea()
 */
public class COval extends CShape {
    /**the length (a) of major radius and the length (b) of minor radius are >0 */
    private int a; 
    private int b;

    /**constructor - overloaded
     * ensures a and b are valid users from the onset
     */
    public COval(int a, int b){
        if(isValid(a) && isValid(b)){
            this.a = a;
            this.b = b;
        }
        else{
            //default to one or to not set a defualt and throw an exception, forcitng the user to provide a valid a and b values
            this.a = 1;
            this.b = 1;
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
     * implementing the abstract override from CShape 
     * will compute the area of a Oval
     * @return area of oval (double)
     */
    public double calculateArea(){  
        return Math.PI*a*b;
    } 
    /**
     * toString override
     */
    public String toString(){
        return super.toString() + "->Oval of major radius length = "+a+" and minor radius length = "+b+" and area = "+ String.format("%.2f", calculateArea());
    }

    
}

