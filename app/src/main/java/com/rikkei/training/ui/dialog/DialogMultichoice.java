package com.rikkei.training.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DialogMultichoice extends DialogFragment {

    List<String> arrayList;


    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {

        AlertDialog.Builder alertdialog = new AlertDialog.Builder(getActivity());

        alertdialog.setTitle("Pick your topping!");

        final String[] food = new String[]{
                "Onion", "Pepper", "Ginger"
        };

        arrayList = Arrays.asList(food);

        final boolean[] check = new boolean[]{
                false, false, false
        };

        alertdialog.setMultiChoiceItems(food, check, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i, boolean b) {

            }
        });

        alertdialog.setPositiveButton("OK", (dialogInterface, i) -> dismiss());
        alertdialog.setNegativeButton("Cancel", (dialogInterface, i) -> dismiss());

        return alertdialog.create();
    }
}
