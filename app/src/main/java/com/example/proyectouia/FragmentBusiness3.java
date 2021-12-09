package com.example.proyectouia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;


public class FragmentBusiness3 extends Fragment {

    public FragmentBusiness3() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_business3, container, false);
        ImageButton b1 = view.findViewById(R.id.b1);
        b1.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("https://goo.gl/maps/N5wbJTGqcEvV2n8i7");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });
        ImageButton b2 = view.findViewById(R.id.b2);
        b2.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("https://goo.gl/maps/qN3Qcm1kaAmWMcGU8");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });
        ImageButton b3 = view.findViewById(R.id.b3);
        b3.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("https://goo.gl/maps/nparNfBTk7UCAvUo9");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });
        return view;
    }
}
