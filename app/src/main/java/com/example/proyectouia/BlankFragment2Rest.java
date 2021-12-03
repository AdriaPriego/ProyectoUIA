package com.example.proyectouia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment2Rest#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment2Rest extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragment2Rest() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment2Rest.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment2Rest newInstance(String param1, String param2) {
        BlankFragment2Rest fragment = new BlankFragment2Rest();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view =inflater.inflate(R.layout.fragment_blank_fragment1_rest, container, false);
        Button b1= (Button) view.findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTel= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:931352136"));
                startActivity(intentTel);
            }
        });
        Button b2=(Button) view.findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTel= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938700547"));
                startActivity(intentTel);
            }
        });
        Button b3=(Button) view.findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTel= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:938704291"));
                startActivity(intentTel);
            }
        });
        ImageButton wb1=(ImageButton) view.findViewById(R.id.wb1);
        wb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://lacookessabio.com/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(webIntent);
            }
        });
        ImageButton wb2=(ImageButton) view.findViewById(R.id.wb2);
        wb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("http://elmirallet.cat/");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(webIntent);
            }
        });
        ImageButton wb3=(ImageButton) view.findViewById(R.id.wb3);
        wb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.tripadvisor.es/Restaurant_Review-g670666-d8779106-Reviews-L_Anima_De_Granollers-Granollers_Catalonia.html");
                Intent webIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(webIntent);
            }
        });
        ImageButton mb1=(ImageButton) view.findViewById(R.id.mb1);
        mb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/La+Cookessa+Bio+Granollers,+Carrer+de+Ponent,+25,+08401+Granollers,+Barcelona/@41.6104197,2.2859485,17z/data=!4m2!3m1!1s0x12a4c79a6208c3b9:0x4e0b3874183aa836");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(mapIntent);
            }
        });
        ImageButton mb2=(ImageButton) view.findViewById(R.id.mb2);
        mb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/El+Mirallet,+08402,+Pla%C3%A7a+de+la+Porxada,+39,+08401+Granollers,+Barcelona/@41.607881,2.286715,17z/data=!4m2!3m1!1s0x12a4c7c610a9215f:0x6fa142ebe7a12e45?hl=es&source=lmns");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(mapIntent);
            }
        });
        ImageButton mb3=(ImageButton) view.findViewById(R.id.mb3);
        mb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("https://www.google.com/maps/place/%C3%80nima+de+Granollers,+Carrer+de+Girona,+4,+08402+Granollers,+Barcelona/@41.608589,2.2907601,17z/data=!4m2!3m1!1s0x12a4c7cfb6b1a8ab:0x33520792786c7fba?hl=es&source=lmns");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                startActivity(mapIntent);
            }
        });
        return view;
    }
}