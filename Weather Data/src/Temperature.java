/**
 * This class uses methods to find information in the WeatherData class and print it out.
 */
public class Temperature 
{
	/**
	 * This method finds the maximum temperature reported by all WBANs in August.
	 */
	public static void findMaxTemp()
	{
		int maxTemp = -999;
		WeatherData maxTempRecord = null;
		WeatherData.resetRecord();
		
		do
        {
            WeatherData currRecord = WeatherData.getRecord();
            
            if(currRecord.gettMax() > maxTemp)
            {
            	maxTemp = currRecord.gettMax();
            	maxTempRecord = WeatherData.getRecord();
            }
        }
        while (WeatherData.advanceRecord());
		System.out.println("The maximum temperature reported by any WBAN during August 2015 was: ");
		System.out.printf("%d degrees on August %s, 2015 in %s at %s%n", maxTempRecord.gettMax(), Integer.toString(maxTempRecord.getYearMonthDay()).subSequence(6,8), maxTempRecord.getStationName(), maxTempRecord.getLocation());
	}
	/**
	 * This method finds the minimum temperature reported by any WBAN during August.
	 */
	public static void findMinTemp()
	{
		int minTemp = 999;
		WeatherData minTempRecord = null;
		WeatherData.resetRecord();
		
		do
        {
            WeatherData currRecord = WeatherData.getRecord();
            
            if(currRecord.gettMin() < minTemp)
            {
            	minTemp = currRecord.gettMin();
            	minTempRecord = WeatherData.getRecord();
            }
        }
        while (WeatherData.advanceRecord());
		System.out.println("The minimum temperature reported by any WBAN during August 2015 was: ");
		System.out.printf("%d degrees on August %s, 2015 in %s at %s%n", minTempRecord.gettMin(), Integer.toString(minTempRecord.getYearMonthDay()).subSequence(6,8), minTempRecord.getStationName(), minTempRecord.getLocation());
	}
	/**
	 * This method calculates the average of all averages reported by any WBAN in August.
	 */
	public static void findAveTemp()
	{
		double sum = 0;
		int counter = 0;
		double aveTemp;
		WeatherData.resetRecord();
		
		do
        {
            WeatherData currRecord = WeatherData.getRecord();
            sum = sum + currRecord.gettAve();
            counter++;
        }
        while (WeatherData.advanceRecord());
		aveTemp = sum / counter;
		System.out.println("The average temperature reported by all stations during August 2015 was: ");
		System.out.printf("%.2f degrees%n", aveTemp);
	}
	/**
	 * This method calculates the average maximum temperature for each day in August and then finds the overall average.
	 */
	public static void findHotDay()
	{
		double[] maxTemp = new double[31];
		double hotTemp = 0;
		double maxHotAve = 0;
		double curHotAve;
		int day = 0;
		
		for(int j = 0; j < 31; j++)
		{
			double sum = 0;
			int counter = 0;
			hotTemp = 0;
			WeatherData.resetRecord();
			
			
			for(int k = 0; k < j; k++)
			{
				WeatherData.advanceRecord();
			}
			do
			{
				WeatherData currRecord = WeatherData.getRecord();
				sum = sum + currRecord.gettMax();
				counter++;
				
				for(int i = 0; i < 30; i++)
				{
					WeatherData.advanceRecord();
				}
			}
			while (WeatherData.advanceRecord());
			hotTemp = sum / counter;
			maxTemp[j] = hotTemp;
		}
		for(int i = 0; i < 31; i++)
		{
			curHotAve = maxTemp[i];
			
			if(curHotAve > maxHotAve)
			{
				maxHotAve = curHotAve;
				day = i + 1;
			}
		}
		System.out.println("The hottest day in Pennsylvania during August 2015 was: ");
		System.out.printf("%.2f degrees on August %d, 2015%n", maxHotAve, day);
	}
	/**
	 * This method finds the average minimum temperature for each day in August and then finds the overall average.
	 */
	public static void findColdDay()
	{
		double[] minTemp = new double[31];
		double coldTemp = 0;
		double maxColdAve = 100;
		double curColdAve;
		int day = 0;
		
		for(int j = 0; j < 31; j++)
		{
			double sum = 0;
			int counter = 0;
			coldTemp = 0;
			WeatherData.resetRecord();
			
			for(int k = 0; k < j; k++)
			{
				WeatherData.advanceRecord();
			}
			do
			{
				WeatherData currRecord = WeatherData.getRecord();
				sum = sum + currRecord.gettMin();
				counter++;
				
				for(int i = 0; i < 30; i++)
				{
					WeatherData.advanceRecord();
				}
			}
			while (WeatherData.advanceRecord());
			coldTemp = sum / counter;
			minTemp[j] = coldTemp;
		}
		for(int i = 0; i < 31; i++)
		{
			curColdAve = minTemp[i];
			
			if(curColdAve < maxColdAve)
			{
				maxColdAve = curColdAve;
				day = i + 1;
			}
		}
		System.out.println("The coldest day in Pennsylvania during August 2015 was: ");
		System.out.printf("%.2f degrees on August %d, 2015%n", maxColdAve, day);
	}
}