package headfirst.designpatterns.observer.weather;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 1031.0f, 7.0f, 53.0f, 4.0f);
		weatherData.setMeasurements(82, 70, 1031.0f, 7.0f, 53.0f, 4.0f);
		weatherData.setMeasurements(78, 90, 1031.0f, 7.0f, 53.0f, 4.0f);
		
		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(62, 90, 28.1f, 15.0f, 22.0f, 5.0f );
	}
}
