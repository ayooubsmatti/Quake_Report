package com.example.quakereport;

public class Earthquake {
    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private String mMagnitude;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mLocation;

    private String mDate;

    /*
     * Create a new Earthquake object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
    public Earthquake(String Magnitude, String Location,String Date)
    {
        mMagnitude = Magnitude;
        mLocation = Location;
        mDate = Date;
    }

    /**
     * Get the Magnitude
     */
    public String getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the Location
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the Date resource ID
     */
    public String getDate() {
        return mDate;
    }
}

