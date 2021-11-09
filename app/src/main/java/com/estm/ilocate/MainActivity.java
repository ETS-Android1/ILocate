package com.estm.ilocate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonilocate;
    private Button buttonifind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Salam this is the first comment.
        // In this project Inchalah we will be working on android
        // Studio as an IDE for creating our iLocate application

        //setting buttons
        buttonilocate = (Button) findViewById(R.id.buttonilocate);
        buttonifind = (Button) findViewById(R.id.buttonifind);

        //setting onclicklistener for ilocate button
        buttonilocate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this.getBaseContext(), iLocateActivity.class);
                startActivity(intent);
            }
        });

        //setting onclicklistener for ifind button
        buttonifind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this.getBaseContext(), iFindActivity.class);
                startActivity(intent);
            }
        });

    }
}