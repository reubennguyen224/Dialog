package com.rikkei.training.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.util.ArrayList;

public class DialogAlert extends DialogFragment {


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        final TextView tv = new TextView(getActivity());
        tv.setText("You will lose all data!");
        tv.setPadding(100, 20, 20 , 20);
        tv.setTextSize(25);
        alert.setView(tv);
        alert.setTitle("Erase storage");
        alert.setPositiveButton("OK", (dialogInterface, i) -> dismiss());
        alert.setNegativeButton("Cancel", (dialogInterface, i) -> dismiss());

        return  alert.create();
    }
}
