package com.example.quakereport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static final String LOG_TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("8.2","San Francisco","25 mars ,2020"));
        earthquakes.add(new Earthquake("6.5","London","25 mars ,2020"));
        earthquakes.add(new Earthquake("4.7","Tokyo","25 mars ,2020"));
        earthquakes.add(new Earthquake("4.5","France","25 mars ,2020"));
        earthquakes.add(new Earthquake("3.3","Mexico","25 mars ,2020"));
        earthquakes.add(new Earthquake("4.5","Rio de Janeiro","25 mars ,2020"));

        ListView earthquikelistView = (ListView) findViewById(R.id.list);
        EarthquakeAdapter adapter = new EarthquakeAdapter(this,earthquakes);
        earthquikelistView.setAdapter(adapter);


    }
}
