package com.example.daaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView ds = (TextView)findViewById(R.id.ds);

        ds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dsIntent = new Intent(MainActivity.this, DsActivity.class);
                startActivity(dsIntent);
            }
        });

        TextView algorithms = (TextView)findViewById(R.id.algorithm);

        algorithms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent algoIntent = new Intent(MainActivity.this, AlgorithmActivity.class);
                startActivity(algoIntent);
            }
        });
    }
}
