package updatecurrentweather;

public class WeatherStation {

	public static void main(String[] args) {

		// subject ����
		WeatherData weatherData = new WeatherData();

		// Observers ����
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForcastDisplay ForcastDisplay = new ForcastDisplay(weatherData);
		
		// ���� �ùķ��̼� weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f, 16);
		weatherData.setMeasurements(78, 90, 29.2f, 18);
		 
	}
}