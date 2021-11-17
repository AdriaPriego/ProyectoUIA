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
        businesses=findViewById(R.id.businesses);
        restaurants=findViewById(R.id.restaurants);
        movies=findViewById(R.id.movies);
        parkings=findViewById(R.id.parkings);
        hotels=findViewById(R.id.hotels);
        transports=findViewById(R.id.transports);
    }

    @Override
    public void onClick(View view) {
        ImageButton imageButton=(ImageButton)view;
        if(view.getId()==businesses.getId()) {
            Intent i1=new Intent(getApplicationContext(),ActivitatBusinesses.class);
            startActivityForResult(i1,1);
        }
        else if(view.getId()==restaurants.getId()){
            Intent i2=new Intent(getApplicationContext(),ActivitatRest.class);
            startActivityForResult(i2,2);
        }
        else if(view.getId()==movies.getId()){
            Intent i3=new Intent(getApplicationContext(),ActivitatMovies.class);
            startActivityForResult(i3,3);
        }
        else if(view.getId()==parkings.getId()){
            Intent i4=new Intent(getApplicationContext(),ActivitatParkings.class);
            startActivityForResult(i4,4);
        }
        else if(view.getId()==hotels.getId()){
            Intent i5=new Intent(getApplicationContext(),ActivitatHotels.class);
            startActivityForResult(i5,5);
        }
        else if(view.getId()==transports.getId()){
            Intent i6=new Intent(getApplicationContext(),ActivitatTransport.class);
            startActivityForResult(i6,6);
        }
    }
}