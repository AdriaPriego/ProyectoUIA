package com.example.proyectouia;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BlankFragment2Hotels#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BlankFragment2Hotels extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public BlankFragment2Hotels() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BlankFragment2Hotels.
     */
    // TODO: Rename and change types and number of parameters
    public static BlankFragment2Hotels newInstance(String param1, String param2) {
        BlankFragment2Hotels fragment = new BlankFragment2Hotels();
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
        View view= inflater.inflate(R.layout.fragment_blank_fragment2_hotels, container, false);
        Button b1= (Button) view.findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTel= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:923202202"));
                startActivity(intentTel);
            }
        });
        Button b2=(Button) view.findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTel= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:900112112"));
                startActivity(intentTel);
            }
        });
        Button b3=(Button) view.findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentTel= new Intent(Intent.ACTION_VIEW, Uri.parse("tel:998304304"));
                startActivity(intentTel);
            }
        });
        return view;
    }
}