package com.qm.balhesablama;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class bloks extends Fragment {


    public bloks() {
        // Required empty public constructor
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button buttoni=view.findViewById(R.id.buttonı);
        buttoni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBlokI(view);
            }

        });
        Button buttonii=view.findViewById(R.id.buttonıı);
        buttonii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBlokII(view);
            }

        });
        Button buttoniii=view.findViewById(R.id.buttonııı);
        buttoniii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBlokIII(view);
            }

        });
        Button buttoniv=view.findViewById(R.id.buttonıv);
        buttoniv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToBlokIV(view);
            }

        });
        Button buttongeri=view.findViewById(R.id.geri);
        buttongeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGeri(view);
            }

        });
    }
    public void goToBlokI(View view){

        NavDirections action=bloksDirections.actionBloksToBlokI();
        Navigation.findNavController(view).navigate(action);
    }
    public void goToBlokII(View view){

        NavDirections action=bloksDirections.actionBloksToBlokII();
        Navigation.findNavController(view).navigate(action);
    }
    public void goToBlokIII(View view){

        NavDirections action=bloksDirections.actionBloksToBlokIII();
        Navigation.findNavController(view).navigate(action);
    }
    public void goToBlokIV(View view){

        NavDirections action=bloksDirections.actionBloksToBlokIV();
        Navigation.findNavController(view).navigate(action);
    }
    public void goToGeri(View view){

        NavDirections action=bloksDirections.actionBloksToAnaekran();
        Navigation.findNavController(view).navigate(action);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bloks, container, false);
    }
}