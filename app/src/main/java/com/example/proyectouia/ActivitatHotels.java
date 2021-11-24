package com.example.proyectouia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class ActivitatHotels extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerHotel;
    private ArrayList<String> lista = new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_hotels);
        spinnerHotel=findViewById(R.id.spinnerHoteles);
        agregandoValores();
        darClic();
    }
    private void agregandoValores()
    {
        lista.add("1");
        lista.add("2");
        lista.add("3");
    }
    private void darClic()
    {
        spinnerHotel.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerHotel.setAdapter(adapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String valor;
        valor = (String) adapterView.getSelectedItem();
        FragmentManager fm = getSupportFragmentManager();
        BlankFragment1Hotels fragment1 = new BlankFragment1Hotels();

        FragmentManager fm2 = getSupportFragmentManager();
        BlankFragment2Hotels fragment2 = new BlankFragment2Hotels();

        FragmentManager fm3 = getSupportFragmentManager();
        BlankFragment3Hotels fragment3 = new BlankFragment3Hotels();
        switch (valor)
        {
            case "1":
                if(getSupportFragmentManager().findFragmentById(R.id.container) != null){
                    getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels)).commit();
                }
                else{
                    fm.beginTransaction().add(R.id.contenidorHotels, fragment1).commit();
                }
                ///Llama al fragment de hoteles 1 estrella
                /*getSupportFragmentManager().beginTransaction().remove(fragment3).commit();
                getSupportFragmentManager().beginTransaction().remove(fragment2).commit();*/
                break;
            case "2":
                /// Llama al fragment de hoteles 2 estrellas
                if(getSupportFragmentManager().findFragmentById(R.id.container) != null){
                    getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels)).commit();
                }
                else{
                    fm2.beginTransaction().add(R.id.contenidorHotels, fragment2).commit();
                }
                /*getSupportFragmentManager().beginTransaction().remove(fragment1).commit();
                getSupportFragmentManager().beginTransaction().remove(fragment3).commit();*/
                break;
            case "3":
                /// Llamar al fragment de hoteles 3 estrellas
                if(getSupportFragmentManager().findFragmentById(R.id.container) != null){
                    getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels)).commit();
                }
                else{
                    fm3.beginTransaction().add(R.id.contenidorHotels, fragment3).commit();
                }
                /*getSupportFragmentManager().beginTransaction().remove(fragment1).commit();
                getSupportFragmentManager().beginTransaction().remove(fragment2).commit();*/
                break;
            default:
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}