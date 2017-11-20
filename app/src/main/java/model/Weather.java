package model;

/**
 * Created by Kwaw on 11/20/17.
 */

public class Weather {
    public Place place;
    public String iconDate;
    public CurrentCondition currentCondition = new CurrentCondition();
    public Temperature temperature = new Temperature();
    public Wind   wind = new Wind();
    public  Snow snow = new Snow();
    public Clouds clouds = new Clouds();



}
