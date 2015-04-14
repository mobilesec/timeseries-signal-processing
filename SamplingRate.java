
import android.util.Log;

public class SamplingRate {
	
	
	/**
	 * This function is responsible for computing sampling rate 
	 * @param timeStamps
	 * @return
	 */
	public static double computeSamplingRate(double [] timeStamps)
	{
		double [] diffTS = ArrayManupulation.diff(timeStamps);
		double meanDiffTS = Math.floor(ArrayManupulation.mean(diffTS));
		Log.i("MeanTS",""+meanDiffTS);
		double samplingRate = Math.floor(1000.0/meanDiffTS); 
		Log.i("SR",""+samplingRate);
		return samplingRate;
	}
}
