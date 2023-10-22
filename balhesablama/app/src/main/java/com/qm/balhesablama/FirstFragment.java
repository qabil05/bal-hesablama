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


public class FirstFragment extends Fragment {

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;
    private TextView textView8;
    private TextView textView10;
    private TextView textView9;
    private TextView textView11;
    private Button btnCalculate;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        editText1 = view.findViewById(R.id.editTextNumber1);
        editText2 = view.findViewById(R.id.editTextNumber2);
        editText3 = view.findViewById(R.id.editTextNumber3);
        editText4 = view.findViewById(R.id.editTextNumber4);
        editText5 = view.findViewById(R.id.editTextNumber5);
        editText6 = view.findViewById(R.id.editTextNumber6);
        editText7 = view.findViewById(R.id.editTextNumber7);

        textView8=view.findViewById(R.id.textV1);
        textView10=view.findViewById(R.id.textV2);
        textView9=view.findViewById(R.id.textV3);
        textView11=view.findViewById(R.id.textView11);

        btnCalculate = view.findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
        Button button6=view.findViewById(R.id.button7);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToGeri3(view);
            }

        });


        return view;


    }
    public void goToGeri3(View view){

        NavDirections action=FirstFragmentDirections.actionFirstFragmentToFFragment();
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
            int number1 = Integer.parseInt(editText1.getText().toString());
            if (number1 > 6) {
                showLongMessageDialog("Riyaziyyat fənnindən cavabların kodlaşdırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 6-dır");
                hasError=true;
            }

            int number2 = Integer.parseInt(editText2.getText().toString());
            if (number2 > 26) {
                showLongMessageDialog("Tədris dili (Azərbaycan dili) fənnindən qapalı tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 26-dir");
                hasError=true;
            }

            int number3 = Integer.parseInt(editText3.getText().toString());
            if (number3 > 15) {
                showLongMessageDialog("Riyaziyyat fənnindən qapalı tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 15-dir");
                hasError=true;
            }

            int number4 = Integer.parseInt(editText4.getText().toString());
            if (number4 > 26) {
                showLongMessageDialog("Xarici dil (ingilis, alman, fransız, rus, ərəb və ya fars dili) fənnindən qapalı tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 26-dır");
                hasError=true;
            }

            int number5 = Integer.parseInt(editText5.getText().toString());
            if (number5 > 4) {
                showLongMessageDialog("Tədris dili (Azərbaycan dili) fənnindən yazılı şəkildə cavablandırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların maksimum sayı 4-dür");
                hasError=true;
            }
            int number6 = Integer.parseInt(editText6.getText().toString());
            if (number6 > 4) {
                showLongMessageDialog("Riyaziyyat fənnindən yazılı şəkildə cavablandırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların maksimum sayı 4-dür");
                hasError=true;
            }

            int number7 = Integer.parseInt(editText7.getText().toString());
            if (number7 > 4) {
                showLongMessageDialog("Xarici dil (ingilis, alman, fransız, rus, ərəb və ya fars dili) fənnindən yazılı şəkildə cavablandırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların maksimum sayı 4-dür");
                hasError=true;
            }
            if(!hasError){
            BigDecimal result = BigDecimal.valueOf(((2 * number5 + number2) * 100)).divide(BigDecimal.valueOf(34), 2, RoundingMode.HALF_UP);
            textView8.setText(""+ result);
            BigDecimal result2 = BigDecimal.valueOf(((2 * number6 + number3+number1) * 100)).divide(BigDecimal.valueOf(29), 2, RoundingMode.HALF_UP);
            textView10.setText(""+ result2);
            BigDecimal result3 = BigDecimal.valueOf(((2 * number7 + number4) * 100)).divide(BigDecimal.valueOf(34), 2, RoundingMode.HALF_UP);
            textView9.setText(""+ result3);

            BigDecimal totalResult = result.add(result2).add(result3);
            textView11.setText(""+totalResult);
            }


        } catch (NumberFormatException e) {
            Toast.makeText(getActivity(), "Bütün xanaları doldurun.", Toast.LENGTH_SHORT).show();
        }

    }
}


