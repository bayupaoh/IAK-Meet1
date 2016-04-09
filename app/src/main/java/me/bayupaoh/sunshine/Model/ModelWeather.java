package me.bayupaoh.sunshine.Model;

/**
 * Created by CodeLabs on 09/04/2016.
 */
public class ModelWeather {
    private int icon;
    private String day;
    private String weather;
    private int temperature;
    private int temperatureForecast;

    public ModelWeather(int icon, String day, String weather, int temperature, int temperatureForecast) {
        this.icon = icon;
        this.day = day;
        this.weather = weather;
        this.temperature = temperature;
        this.temperatureForecast = temperatureForecast;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperatureForecast() {
        return temperatureForecast;
    }

    public void setTemperatureForecast(int temperatureForecast) {
        this.temperatureForecast = temperatureForecast;
    }
}
