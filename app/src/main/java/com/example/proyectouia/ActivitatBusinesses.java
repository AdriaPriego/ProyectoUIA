package com.example.proyectouia;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import java.util.ArrayList;

public class ActivitatBusinesses extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner spinnerBusinesses;
    private final ArrayList<String> lista = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitat_businesses);
        spinnerBusinesses=findViewById(R.id.spinnerBusinesses);
        agregarValors();
        click();
    }
    private void agregarValors()
    {
        lista.add("Selecciona una opció");
        lista.add("Perruqueries");
        lista.add("Farmàcies");
        lista.add("Forns de pa");
        lista.add("Associacions");
    }
    private void click()
    {
        spinnerBusinesses.setOnItemSelectedListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, lista);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerBusinesses.setAdapter(adapter);
    }
    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String valor;
        valor = (String) adapterView.getSelectedItem();
        FragmentManager fm = getSupportFragmentManager();
        FragmentBusiness1 fragment1 = new FragmentBusiness1();

        FragmentManager fm2 = getSupportFragmentManager();
        FragmentBusiness2 fragment2 = new FragmentBusiness2();

        FragmentManager fm3 = getSupportFragmentManager();
        FragmentBusiness3 fragment3 = new FragmentBusiness3();
        switch (valor)
        {
            case "Perruqueries":
                if (fm.findFragmentById(R.id.contenidorBusinesses) == null) {
                    fm.beginTransaction().add(R.id.contenidorBusinesses,fragment1).commit();
                }
                break;
            case "2":
                if (fm2.findFragmentById(R.id.contenidorHotels) == null) {
                    fm2.beginTransaction().add(R.id.contenidorBusinesses,fragment2).commit();
                }
                break;
            case "3":
                if (fm3.findFragmentById(R.id.contenidorHotels) == null) {
                    fm3.beginTransaction().add(R.id.contenidorBusinesses,fragment3).commit();
                }
                break;
            default:
                break;
        }
    }
    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}