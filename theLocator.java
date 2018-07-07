import java.util.Scanner;

public class theLocator {
  
  public static void main(String[] args) {
    
	int row = 0; // variable for the number of rows
	int column = 0; // variable for the number of columns
    
	Scanner reader = new Scanner(System.in); // initializes the user input
    System.out.println("Enter the number of rows and columns of the array:");
    row = reader.nextInt(); // program gets the number of rows
    column = reader.nextInt(); // program gets the number of columns
    
	double[][] input = new double[row][column]; // array created
    
	System.out.println("Enter the array:"); // array values asked
    
	for (int a = 0; a < row; a++) {
      for (int b = 0; b < column; b++) {
        input[a][b] = reader.nextDouble(); // array values inserted into the array
      }
    }
    
	Location maximum = Location.locateLargest(input);

    System.out.println("The location of the largest element is " + maximum.maxValue + " at ("
        + maximum.row + ", " + maximum.column + ")");
  }

}


class Location {
  
  int row;
  int column;
  double maxValue;
	// constructors
  public Location(int row, int column, double maxValue) {
    this.row = row;
    this.column = column;
    this.maxValue = maxValue;
  }

  /**
   * METHOD to find location of largest value in an array
   * 
   * @param a -> array entered by user
   * @return returns an new object from the class 'location'
   */
  public static Location locateLargest(double[][] a) {

    int row = 0; // initialization of largest value's parameters
    int column = 0;
    double max = a[row][column]; // largest value
    for (int i = 0; i < a.length; i++) { // checking every value to find the largest
      for (int j = 0; j < a[i].length; j++) {
        if (max < a[i][j]) {
          max = a[i][j];
          row = i;
          column = j;
        }
      }
    }
    // returns the largest value's parameters
    return new Location(row, column, max);
  }


}
