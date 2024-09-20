import java.security.PublicKey;

/** @author Maria Kandikova
 *  @version September 18, 2024
 * 
 *  This is an abstract class to describe a general shape 
 *  every shape has a unique id and name
 *  every shape can have an area calculated
 */
public abstract class CShape{
    private int id; /** unique id */
    private String name; /**not null */
    private static int counter=0; /**counter is shared attribute across all instances of CShape */
    /**default constructor
     * initialize the id and name to the next unique int counter
     */
    public CShape(){
        id = ++counter;
        name = "shape"+id;/**unique name for each one */
    }
    /**overloaded constructor
     * allows a name to be set by user and cannot be blank
     */
    public CShape(String name){
        this(); //invoke the default constructor first
        if(name.trim().length() > 0){ //endure there are no whitespace and is not blank
            this.name = name.trim();
        }
    }
    /**access method 
     * @return id
     */
    public int get_id(){
        return id;
    }
    /**access method
     * @return name
     */
    public String get_name(){
        return name;
    }
    /** default override for toString */
    public String toString(){
        return "Shape has id = " +id+" and name = '"+name+"'";
    }

    /**abstract class method where we calculate the area 
     * must be implemented by derived classes 
    */
    public abstract double calculateArea();

}