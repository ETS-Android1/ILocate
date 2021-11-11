package com.estm.ilocate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.google.android.gms.maps.MapView;

public class iLocateActivity extends Activity {

    private Button button1;
    private Button button2;
    private Button button3;
    private MapView mapView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilocate);

        mapView = (MapView) findViewById(R.id.mapView);
        mapView.setActivated(true);
        //setting buttons for iLocate activity
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
    }
}
