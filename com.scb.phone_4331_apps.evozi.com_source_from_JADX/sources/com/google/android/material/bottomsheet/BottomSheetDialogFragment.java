package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import p040o.nContextGetUserMessage;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new nContextGetUserMessage(getContext(), getTheme());
    }
}
