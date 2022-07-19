package com.rikkei.training.ui.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.NumberPicker;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogPickNum extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(getActivity());

        alertDialog.setTitle("Text Message limit");
        View view = LayoutInflater.from(getActivity()).inflate(R.layout.scroll, null);

        NumberPicker np = view.findViewById(R.id.numberPicker);
        np.setMaxValue(999);
        np.setMinValue(0);
        np.setWrapSelectorWheel(true);

        alertDialog.setView(view);

        alertDialog.setPositiveButton("OK", (dialogInterface, i) -> dismiss());

        alertDialog.setNegativeButton("Cancel", (dialogInterface, i) -> dismiss());

        return alertDialog.create();
    }
}
