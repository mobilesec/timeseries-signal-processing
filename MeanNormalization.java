
/**
 * This class is responsible for removing mean value from the 
 * acceleration time series. It is used in all of our gait papers. 
 * It tested and working absolutly fine. 
 * @version 1.0
 * @author Muhammad Muaaz
 *
 */
public class MeanNormalization {


	public static double[] zeroMeanNormalization(double [] x) throws IllegalArgumentException
	{
		if ( x.length <=1 ){

			throw new IllegalArgumentException("X must have more than one value");
		}

		// find the mean value of Array.
		
		double mean = ArrayManupulation.mean(x);
		double [] y = new double [x.length];
		
		for (int i = 0 ; i < x.length ; i++){
			
			y[i] = x[i] - mean;
		}
		
		return y;
	}

}
