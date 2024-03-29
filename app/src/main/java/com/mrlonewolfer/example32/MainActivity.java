package com.mrlonewolfer.example32;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
Without define explicit listener to call the button event.
 */
public class MainActivity extends AppCompatActivity {

    Button btnClick;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick=findViewById(R.id.btnClick);
        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Thank You For Clicking", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
