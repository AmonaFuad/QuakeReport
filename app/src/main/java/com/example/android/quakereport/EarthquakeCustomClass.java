package com.example.android.quakereport;

public class EarthquakeCustomClass {
private  String magnitude ;
private  String city ;
private String date;
public EarthquakeCustomClass (String mmagnitud,String mcity , String mdata){
    magnitude=mmagnitud;
    city=mcity;
    date=mdata;
}

    public String getMagnitude() {
        return magnitude;
    }
    public String getCity() {return city;}
    public String getDate(){return date;}
}
