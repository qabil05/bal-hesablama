package com.qm.balhesablama;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class blokIII extends Fragment {

    public blokIII() {
        // Required empty public constructor
    }


    private EditText editT1;
    private EditText editT2;
    private EditText editT3;
    private EditText editT4;
    private EditText editT5;
    private EditText editT6;
    private EditText editT7;
    private EditText editT8;
    private EditText editT9;
    private EditText editT10;
    private EditText editT11;
    private EditText editT12;
    private TextView textV1;
    private TextView textV2;
    private TextView textV3;
    private TextView textV4;
    private Button btnCalculate2;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_blok_i_i_i, container, false);
        editT1 = view.findViewById(R.id.editT1);
        editT2 = view.findViewById(R.id.editT2);
        editT3 = view.findViewById(R.id.editT3);
        editT4 = view.findViewById(R.id.editT4);
        editT5 = view.findViewById(R.id.editT5);
        editT6 = view.findViewById(R.id.editT6);
        editT7 = view.findViewById(R.id.editT7);
        editT8 = view.findViewById(R.id.editT8);
        editT9 = view.findViewById(R.id.editT9);
        editT10 = view.findViewById(R.id.editT10);
        editT11 = view.findViewById(R.id.editT11);
        editT12 = view.findViewById(R.id.editT12);


        textV1=view.findViewById(R.id.textV1);
        textV2=view.findViewById(R.id.textV2);
        textV3=view.findViewById(R.id.textV3);
        textV4=view.findViewById(R.id.textV4);

        btnCalculate2 = view.findViewById(R.id.btnCalculate2);
        btnCalculate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
        Button bg2=view.findViewById(R.id.bg1);
        bg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGeri7(view);
            }

        });


        return view;


    }
    public void goToGeri7(View view){

        NavDirections action=blokIIIDirections.actionBlokIIIToBloks();
        Navigation.findNavController(view).navigate(action);
    }

    private void showShortMessage(String message) {
        Snackbar.make(getActivity().findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show();
    }

    private void showLongMessageDialog(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Bildiriş!");
        builder.setMessage(message);
        builder.setPositiveButton("Oldu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
            }
        });
        builder.show();
    }
    private int parseEditTextValue(EditText editText) {
        String text = editText.getText().toString().trim();
        return text.isEmpty() ? 0 : Integer.parseInt(text);
    }

    private void calculateResult() {
        boolean hasError=false;
        try {
            int number1 = Integer.parseInt(editT1.getText().toString());
            int number2 = Integer.parseInt(editT2.getText().toString());
            if (number1>22 || number2>22|| (number1+number2)> 22) {
                showLongMessageDialog("Azərbaycan dili fənnindən qapalı suallar üzrə doğru və yanlış cavabların sayı maksimum 22-dir");
                hasError=true;
            }

            int number3 = Integer.parseInt(editT3.getText().toString());
            if (number3 > 5) {
                showLongMessageDialog("Azərbaycan dili fənnindən kodlaşdırılması tələb olunan açıq suallar üzrə doğru cavabların sayı maksimum 5-dir");
                hasError=true;
            }

            int number4 = Integer.parseInt(editT4.getText().toString());
            if (number4 > 6) {
                showLongMessageDialog("Azərbaycan dili fənnindən situasialar üzrə balların cəmi maksimum 6-dır");
                hasError=true;
            }

            int number5 = Integer.parseInt(editT5.getText().toString());
            int number6 = Integer.parseInt(editT6.getText().toString());
            if (number5>22|| number6>22|| (number5+number6) > 22) {
                showLongMessageDialog("Tarix fənnindən qapalı suallar üzrə doğru və yanlış cavabların sayı maksimum 22-dir");
                hasError=true;
            }

            int number7 = Integer.parseInt(editT7.getText().toString());
            if (number7 > 5) {
                showLongMessageDialog("Tarix fənnindən kodlaşdırılması tələb olunan açıq suallar üzrə doğru cavabların sayı maksimum 5-dir");
                hasError=true;
            }
            int number8 = Integer.parseInt(editT8.getText().toString());
            if (number8 > 6) {
                showLongMessageDialog("Tarix fənnindən situasialar üzrə balların cəmi maksimum 6-dır");
                hasError=true;
            }

            int number9 = Integer.parseInt(editT9.getText().toString());
            int number10 = Integer.parseInt(editT10.getText().toString());
            if (number9>22 || number10 >22 || (number9+number10) > 22) {
                showLongMessageDialog("Ədəbiyyat fənnindən qapalı suallar üzrə doğru və yanlış cavabların sayı maksimum 22-dir");
                hasError=true;
            }
            int number11 = Integer.parseInt(editT11.getText().toString());
            if (number11 > 5) {
                showLongMessageDialog("Ədəbiyyat fənnindən kodlaşdırılması tələb olunan açıq suallar üzrə doğru cavabların sayı maksimum 5-dir");
                hasError=true;
            }
            int number12 = Integer.parseInt(editT12.getText().toString());
            if (number12 > 6) {
                showLongMessageDialog("Ədəbiyyat fənnindən situasialar üzrə balların cəmi maksimum 6-dır");
                hasError=true;
            }



            if(!hasError){
                BigDecimal result = BigDecimal.valueOf(number1)
                        .subtract(BigDecimal.valueOf(number2).multiply(BigDecimal.valueOf(0.25)))
                        .multiply(BigDecimal.valueOf(100))
                        .divide(BigDecimal.valueOf(33), 2, RoundingMode.HALF_UP)
                        .add(BigDecimal.valueOf(number3).multiply(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(33), 2, RoundingMode.HALF_UP))
                        .add(BigDecimal.valueOf(number4).multiply(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(33), 2, RoundingMode.HALF_UP))
                        .multiply(BigDecimal.valueOf(1.5))
                        .setScale(2, RoundingMode.HALF_UP);
                if (result.compareTo(BigDecimal.ZERO) < 0) {
                    result = BigDecimal.ZERO;
                }
                textV1.setText(""+ result);
                BigDecimal result2 = BigDecimal.valueOf(number5)
                        .subtract(BigDecimal.valueOf(number6).multiply(BigDecimal.valueOf(0.25)))
                        .multiply(BigDecimal.valueOf(100))
                        .divide(BigDecimal.valueOf(33), 2, RoundingMode.HALF_UP)
                        .add(BigDecimal.valueOf(number7).multiply(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(33), 2, RoundingMode.HALF_UP))
                        .add(BigDecimal.valueOf(number8).multiply(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(33), 2, RoundingMode.HALF_UP))
                        .multiply(BigDecimal.valueOf(1.5))
                        .setScale(2, RoundingMode.HALF_UP);
                if (result2.compareTo(BigDecimal.ZERO) < 0) {
                    result2 = BigDecimal.ZERO;
                }
                textV2.setText(""+ result2);
                BigDecimal result3 =  BigDecimal.valueOf(number9)
                        .subtract(BigDecimal.valueOf(number10).multiply(BigDecimal.valueOf(0.25)))
                        .multiply(BigDecimal.valueOf(100))
                        .divide(BigDecimal.valueOf(33), 2, RoundingMode.HALF_UP)
                        .add(BigDecimal.valueOf(number11).multiply(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(33), 2, RoundingMode.HALF_UP))
                        .add(BigDecimal.valueOf(number12).multiply(BigDecimal.valueOf(100)).divide(BigDecimal.valueOf(33), 2, RoundingMode.HALF_UP))
                        .multiply(BigDecimal.valueOf(1))
                        .setScale(2, RoundingMode.HALF_UP);
                if (result3.compareTo(BigDecimal.ZERO) < 0) {
                    result3 = BigDecimal.ZERO;
                }
                textV3.setText(""+ result3);

                BigDecimal totalResult = result.add(result2).add(result3);
                textV4.setText(""+totalResult);
            }


        } catch (NumberFormatException e) {
            Toast.makeText(getActivity(), "Bütün xanaları doldurun.", Toast.LENGTH_SHORT).show();
        }

    }
}