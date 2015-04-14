


/**
 * This class is reponsible for performing [-1, 1] data scaling. 
 * It can be extended to achieve different kind of scaling functions.
 * @author Muhammad Muaaz
 *@version 1.0
 */

public class DataScaling {

	//default constructor
	public DataScaling() {
				
	}

	/**
	 * This function is to scale data [-1,1]
	 * @param _data
	 * @return scaledData
	 */
	public static double [] scaleData(double [] _data) {
		
		double []scaledData = new double [_data.length];
		double minVal = ArrayManupulation.minimum(_data);
		double maxVal = ArrayManupulation.maximum(_data);
		
		for(int i = 0; i < _data.length; i++) {
		
			scaledData[i] = 2*((_data[i]-minVal)/(maxVal-minVal)) -1;
		}
		return scaledData;
	}
}
