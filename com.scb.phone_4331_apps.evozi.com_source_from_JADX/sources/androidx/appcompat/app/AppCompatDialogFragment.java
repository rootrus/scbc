package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import p040o.setBackgroundResource;

public class AppCompatDialogFragment extends DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new setBackgroundResource(getContext(), getTheme());
    }

    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof setBackgroundResource) {
            setBackgroundResource setbackgroundresource = (setBackgroundResource) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            setbackgroundresource.write(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
