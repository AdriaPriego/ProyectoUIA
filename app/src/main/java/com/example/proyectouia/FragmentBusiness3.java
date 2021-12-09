package com.example.proyectouia;

import android.content.DialogInterface;
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
 * Use the {@link FragmentBusiness1#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentBusiness3 extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentBusiness3() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment1Hotels.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentBusiness3 newInstance(String param1, String param2) {
        FragmentBusiness3 fragment = new FragmentBusiness3();
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
        View view =inflater.inflate(R.layout.fragment_business3, container, false);
        ImageButton b1= (ImageButton) view.findViewById(R.id.b1);
        b1.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("https://goo.gl/maps/N5wbJTGqcEvV2n8i7");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });
        ImageButton b2=(ImageButton) view.findViewById(R.id.b2);
        b2.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("https://goo.gl/maps/qN3Qcm1kaAmWMcGU8");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });
        ImageButton b3=(ImageButton) view.findViewById(R.id.b3);
        b3.setOnClickListener(v -> {
            Uri gmmIntentUri = Uri.parse("https://goo.gl/maps/nparNfBTk7UCAvUo9");
            Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
            mapIntent.setPackage("com.google.android.apps.maps");
            startActivity(mapIntent);
        });
        return view;
    }
}