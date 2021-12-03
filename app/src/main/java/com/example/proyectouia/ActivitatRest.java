package com.example.proyectouia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Objects;

public class ActivitatRest extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    Spinner spinnerRest;
    private final ArrayList<String> lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_rest);
        spinnerRest=findViewById(R.id.restaurants);
        agregandoValores();
        darClic();
    }

    private void darClic() {
        spinnerRest.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerRest.setAdapter(adapter);
    }

    private void agregandoValores() {
        lista.add("Vegetaria");
        lista.add("Italia");
        lista.add("Japones");
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String valor;
        valor = (String) adapterView.getSelectedItem();
        FragmentManager fm = getSupportFragmentManager();
        BlankFragment1Rest fragment1 = new BlankFragment1Rest();
        FragmentManager fm2 = getSupportFragmentManager();
        BlankFragment2Rest fragment2 = new BlankFragment2Rest();

        FragmentManager fm3 = getSupportFragmentManager();
        BlankFragment3Rest fragment3 = new BlankFragment3Rest();

        switch (valor) {
            case "Vegetaria":
                if (getSupportFragmentManager().findFragmentById(R.id.contenidorrestaurants) != null) {
                    getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels))).commit();
                }
                fm.beginTransaction().add(R.id.contenidorrestaurants, fragment1).commit();
                break;
            case "Italia":
                if (getSupportFragmentManager().findFragmentById(R.id.contenidorrestaurants) != null) {
                    getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.contenidorrestaurants))).commit();
                }
                fm2.beginTransaction().add(R.id.contenidorrestaurants, fragment2).commit();
                break;
            case "Japones":
                if (getSupportFragmentManager().findFragmentById(R.id.contenidorrestaurants) != null) {
                    getSupportFragmentManager().beginTransaction().remove(Objects.requireNonNull(getSupportFragmentManager().findFragmentById(R.id.contenidorHotels))).commit();
                }
                fm3.beginTransaction().add(R.id.contenidorrestaurants, fragment3).commit();
                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}