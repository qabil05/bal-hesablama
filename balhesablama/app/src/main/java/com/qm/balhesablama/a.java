/*
 package com.qm.balhesablama;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class FirstFragment extends Fragment {

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;

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
        btnCalculate = view.findViewById(R.id.btnCalculate);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
        return view;
    }

    private void showShortMessage(String message) {
        // Kısa süreli mesaj için Snackbar kullanabilirsiniz
        Snackbar.make(getActivity().findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show();
    }

    private void showLongMessageDialog(String message) {
        // Uzun mesaj için diyalog kutusu kullanabilirsiniz
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Bildiriş!");
        builder.setMessage(message);
        builder.setPositiveButton("Oldu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Diyalog kapatıldığında yapılacak işlemler, eğer varsa
            }
        });
        builder.show();
    }

    private void calculateResult() {
        try {
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());
            int number3 = Integer.parseInt(editText3.getText().toString());
            int number4 = Integer.parseInt(editText4.getText().toString());
            int number5 = Integer.parseInt(editText5.getText().toString());
            int number6 = Integer.parseInt(editText6.getText().toString());
            int number7 = Integer.parseInt(editText7.getText().toString());
            if (number1 > 5) {
                showLongMessageDialog("Riyaziyyat fənnindən cavabların kodlaşdırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 5-dir");

            }


            if (number2 > 20) {
                showLongMessageDialog("Tədris dili (Azərbaycan dili) fənnindən qapalı tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 20-dir");
            }


            if (number3 > 13) {
                showLongMessageDialog("Riyaziyyat fənnindən qapalı tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 13-dür");
            }

            if (number4 > 23) {
                showLongMessageDialog("Xarici dil (ingilis, alman, fransız, rus, ərəb və ya fars dili) fənnindən qapalı tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 23-dür");
            }

            if (number5 > 10) {
                showLongMessageDialog("Tədris dili (Azərbaycan dili) fənnindən yazılı şəkildə cavablandırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların maksimum sayı 10-dur");
            }

            if (number6 > 7) {
                showLongMessageDialog("Riyaziyyat fənnindən yazılı şəkildə cavablandırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların maksimum sayı 7-dir");
            }


            if (number7 > 7) {
                showLongMessageDialog("Xarici dil (ingilis, alman, fransız, rus, ərəb və ya fars dili) fənnindən yazılı şəkildə cavablandırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların maksimum sayı 7-dir");
            }




        }
        catch(NumberFormatException e){
            showShortMessage("Düzgün bir rakam giriniz.");
        }
    }
}






package com.qm.balhesablama;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class FirstFragment extends Fragment {

    private EditText editText1;
    private EditText editText2;
    private EditText editText3;
    private EditText editText4;
    private EditText editText5;
    private EditText editText6;
    private EditText editText7;

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
        btnCalculate = view.findViewById(R.id.btnCalculate);


        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });
        return view;
    }

    private void showShortMessage(String message) {
        // Kısa süreli mesaj için Snackbar kullanabilirsiniz
        Snackbar.make(getActivity().findViewById(android.R.id.content), message, Snackbar.LENGTH_SHORT).show();
    }

    private void showLongMessageDialog(String message) {
        // Uzun mesaj için diyalog kutusu kullanabilirsiniz
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Bildiriş!");
        builder.setMessage(message);
        builder.setPositiveButton("Oldu", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                // Diyalog kapatıldığında yapılacak işlemler, eğer varsa
            }
        });
        builder.show();
    }

    private void calculateResult() {
        try {
            int number1 = Integer.parseInt(editText1.getText().toString());

            if (number1 > 5) {
                showLongMessageDialog("Riyaziyyat fənnindən cavabların kodlaşdırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 5-dir");
            } else {


            }
        } catch (NumberFormatException e) {
            showShortMessage("Düzgün bir rakam giriniz.");
        }


        try {
            int number2 = Integer.parseInt(editText2.getText().toString());

            if (number2 > 20) {
                showLongMessageDialog("Tədris dili (Azərbaycan dili) fənnindən qapalı tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 20-dir");
            } else {

            }
        } catch (NumberFormatException e) {
            showShortMessage("Düzgün bir rakam giriniz.");
        }

        try {
            int number3 = Integer.parseInt(editText3.getText().toString());

            if (number3 > 13) {
                showLongMessageDialog("Riyaziyyat fənnindən qapalı tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 13-dür");
            } else {

            }
        } catch (NumberFormatException e) {
            showShortMessage("Düzgün bir rakam giriniz.");
        }
        try {
            int number4 = Integer.parseInt(editText4.getText().toString());

            if (number4 > 23) {
                showLongMessageDialog("Xarici dil (ingilis, alman, fransız, rus, ərəb və ya fars dili) fənnindən qapalı tipli tapşırıqlar üzrə düzgün cavabların sayı maksimum 23-dür");
            } else {

            }
        } catch (NumberFormatException e) {
            showShortMessage("Düzgün bir rakam giriniz.");
        }
        try {
            int number5 = Integer.parseInt(editText5.getText().toString());

            if (number5 > 10) {
                showLongMessageDialog("Tədris dili (Azərbaycan dili) fənnindən yazılı şəkildə cavablandırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların maksimum sayı 10-dur");
            } else {

            }
        } catch (NumberFormatException e) {
            showShortMessage("Düzgün bir rakam giriniz.");
        }
        try {
            int number6 = Integer.parseInt(editText6.getText().toString());

            if (number6 > 7) {
                showLongMessageDialog("Riyaziyyat fənnindən yazılı şəkildə cavablandırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların maksimum sayı 7-dir");
            } else {

            }
        } catch (NumberFormatException e) {
            showShortMessage("Düzgün bir rakam giriniz.");
        }
        try {

            int number7 = Integer.parseInt(editText7.getText().toString());

            if (number7 > 7) {
                showLongMessageDialog("Xarici dil (ingilis, alman, fransız, rus, ərəb və ya fars dili) fənnindən yazılı şəkildə cavablandırılması tələb olunan açıq tipli tapşırıqlar üzrə düzgün cavabların maksimum sayı 7-dir");
            } else {

            }




        } catch (NumberFormatException e) {
            showShortMessage("Düzgün bir rakam giriniz.");
        }

    }
}



*/

