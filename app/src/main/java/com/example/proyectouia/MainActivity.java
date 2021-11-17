package com.example.proyectouia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageButton businesses,restaurants,movies,parkings,hotels,transports;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        businesses=findViewById(R.id.businesses);businesses.setOnClickListener(this);
        restaurants=findViewById(R.id.restaurants);restaurants.setOnClickListener(this);
        movies=findViewById(R.id.movies);movies.setOnClickListener(this);
        parkings=findViewById(R.id.parkings);parkings.setOnClickListener(this);
        hotels=findViewById(R.id.hotels);hotels.setOnClickListener(this);
        transports=findViewById(R.id.transports);transports.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ImageButton imageButton=(ImageButton)view;
        if(view.getId()==businesses.getId()) {
            Intent i1=new Intent(getApplicationContext(),ActivitatBusinesses.class);
            startActivity(i1);
        }
        else if(view.getId()==restaurants.getId()){
            Intent i2=new Intent(getApplicationContext(),ActivitatRest.class);
            startActivity(i2);
        }
        else if(view.getId()==movies.getId()){
            Intent i3=new Intent(getApplicationContext(),ActivitatMovies.class);
            startActivity(i3);
        }
        else if(view.getId()==parkings.getId()){
            Intent i4=new Intent(getApplicationContext(),ActivitatParkings.class);
            startActivity(i4);
        }
        else if(view.getId()==hotels.getId()){
            Intent i5=new Intent(getApplicationContext(),ActivitatHotels.class);
            startActivity(i5);
        }
        else if(view.getId()==transports.getId()){
            Intent i6=new Intent(getApplicationContext(),ActivitatTransport.class);
            startActivity(i6);
        }
    }
}