package com.example.proyectouia;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;
import java.util.Objects;

public class ActivitatHotels extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerHotel;
    private final ArrayList<String> lista = new ArrayList<>();
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
        lista.add("0");
        lista.add("1");
        lista.add("2");
        lista.add("3");
    }
    private void darClic()
    {
        spinnerHotel.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
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
                if(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels) != null){
                    getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels))).commit();
                }
                fm.beginTransaction().add(R.id.contenidorHotels, fragment1).commit();
                break;
            case "2":
                if(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels) != null){
                    getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels))).commit();
                }
                fm2.beginTransaction().add(R.id.contenidorHotels, fragment2).commit();
                break;
            case "3":
                if(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels) != null){
                    getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels))).commit();
                }
                fm3.beginTransaction().add(R.id.contenidorHotels, fragment3).commit();
                break;
            default:
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}