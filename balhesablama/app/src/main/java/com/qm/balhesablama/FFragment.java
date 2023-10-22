package com.qm.balhesablama;

import android.os.Bundle;

import androidx.activity.OnBackPressedCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FFragment extends Fragment {



    public FFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_f, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button=view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToFirst(view);
            }

        });
        Button button2=view.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSecond(view);
            }

        });
    Button buttongeri=view.findViewById(R.id.button5);
        buttongeri.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            goToGeri2(view);
        }

    });

}
    public void goToFirst(View view){

        NavDirections action=FFragmentDirections.actionFFragmentToFirstFragment();
        Navigation.findNavController(view).navigate(action);
    }
    public void goToSecond(View view){

        NavDirections action=FFragmentDirections.actionFFragmentToSecondFragment();
        Navigation.findNavController(view).navigate(action);
    }
    public void goToGeri2(View view){

        NavDirections action=FFragmentDirections.actionFFragmentToAnaekran();
        Navigation.findNavController(view).navigate(action);
    }
}

