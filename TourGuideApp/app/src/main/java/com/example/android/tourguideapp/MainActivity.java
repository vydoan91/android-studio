package com.example.android.tourguideapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView attraction = findViewById(R.id.attraction);
        attraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),AttractionActivity.class);
                startActivity(i);
            }
        });

        TextView hotel = findViewById(R.id.hotel);
        attraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),HotelActivity.class);
                startActivity(i);
            }
        });

        TextView food = findViewById(R.id.food);
        attraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),FoodActivity.class);
                startActivity(i);
            }
        });
    }
}
