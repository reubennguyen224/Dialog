package com.rikkei.training.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogDatePicker extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder alertdialog = new AlertDialog.Builder(getActivity());
        alertdialog.setView(R.layout.date);
        alertdialog.setPositiveButton("OK", (dialogInterface, i) -> dismiss());
        alertdialog.setNegativeButton("Cancel", (dialogInterface, i) -> dismiss());
        return alertdialog.create();
    }
}
