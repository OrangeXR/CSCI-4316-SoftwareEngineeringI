package headfirst.designpatterns.observer.weather;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
    private float pressure;
    private float windSpeed;
    private float dewPoint;
    private float uvIndex;
    private WeatherData weatherData;
	
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure, float windSpeed, float dewPoint, float uvIndex) {
		this.temperature = temperature;
		this.humidity = humidity;
        this.pressure = pressure;
        this.windSpeed = windSpeed;
        this.dewPoint = dewPoint;
        this.uvIndex = uvIndex;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: ");
        System.out.println("Temperature: " + temperature + "°C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Pressure: " + pressure + " hPa");
        System.out.println("Wind Speed: " + windSpeed + " km/h");
        System.out.println("Dew Point: " + dewPoint + "°C");
        System.out.println("UV Index: " + uvIndex);

    }
}
