package com.estm.ilocate;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.google.android.gms.maps.MapView;

public class iFindActivity extends Activity {

    private Button button1;
    private Button button2;
    private Button button3;
    private MapView mapView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_ifind);

        mapView = (MapView) findViewById(R.id.mapView2);
        //setting buttons
        button1 = (Button) findViewById(R.id.button4);
        button2 = (Button) findViewById(R.id.button5);
        button3 = (Button) findViewById(R.id.button6);
    }
}
