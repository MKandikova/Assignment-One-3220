import java.util.Random;
/** @author Maria Kandikova
 *  @version September 18, 2024
 * 
 *  This is class canvas to 
 */

public class CCanvas {

    private CShape[] shapes; // array to hold shapes
    private Random rand;

    /** Constructor */
    public CCanvas() {
        shapes = new CShape[10]; // to store 10 random shapes
        rand = new Random(); 
        generateRandomShapes(); // generates random shapes
    }

    /** Method to generate random shapes */
    private void generateRandomShapes() {
        for (int i = 0; i < shapes.length; i++) {
            int shapeType = rand.nextInt(4); // 0 for Circle, 1 for Rectangle, 2 for Square, 3 for Oval
            switch (shapeType) {
                case 0:
                    shapes[i] = new CCircle(rand.nextInt(100) + 1); // Random radius between 1 and 100
                    break;
                case 1:
                    shapes[i] = new CRectangle(rand.nextInt(100) + 1, rand.nextInt(100) + 1); // Random length and width
                    break;
                case 2:
                    shapes[i] = new CSquare(rand.nextInt(100) + 1); // Random side length between 1 and 100
                    break;
                case 3:
                    shapes[i] = new COval(rand.nextInt(100) + 1, rand.nextInt(100) + 1); // Random semi-major and semi-minor axes
                    break;
            }
        }
    }

    /** Method to display the shapes and calculate the total area */
    public void displayCanvas() {
        System.out.println(">> Canvas has the following random shapes:\n");
        double totalArea = 0;

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + (i + 1) + ": " + shapes[i]);
            totalArea += shapes[i].calculateArea();
        }

        System.out.printf("\nTotal area of all shapes is: %.2f\n", totalArea);
    }

    public static void main(String[] args) {
        CCanvas canvas = new CCanvas();
        canvas.displayCanvas();
    }
}
