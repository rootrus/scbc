package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.common.ClearableEditText;

/* renamed from: o.submitConsent */
public final /* synthetic */ class submitConsent implements TextView.OnEditorActionListener {
    private final /* synthetic */ ClearableEditText write;

    public /* synthetic */ submitConsent(ClearableEditText clearableEditText) {
        this.write = clearableEditText;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        ClearableEditText clearableEditText = this.write;
        if (i != 6) {
            return false;
        }
        clearableEditText.inputEditText.clearFocus();
        ClearableEditText.read read = clearableEditText.write;
        if (read == null) {
            return false;
        }
        read.MediaBrowserCompat$ItemReceiver();
        return false;
    }
}
