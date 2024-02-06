package p040o;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.scb.phone.view.custom.common.CustomDeltaInput;

/* renamed from: o.verifyFastPayBillPayment */
public final /* synthetic */ class verifyFastPayBillPayment implements TextView.OnEditorActionListener {
    private final /* synthetic */ CustomDeltaInput MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ verifyFastPayBillPayment(CustomDeltaInput customDeltaInput) {
        this.MediaBrowserCompat$ItemReceiver = customDeltaInput;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        CustomDeltaInput customDeltaInput = this.MediaBrowserCompat$ItemReceiver;
        boolean z = false;
        if (i == 6) {
            if (customDeltaInput != null) {
                ((InputMethodManager) customDeltaInput.getContext().getSystemService("input_method")).hideSoftInputFromWindow(customDeltaInput.getWindowToken(), 0);
            }
            z = true;
            customDeltaInput.limitMessage.setFocusable(true);
            customDeltaInput.limitMessage.setFocusableInTouchMode(true);
            customDeltaInput.limitMessage.requestFocus();
            CustomDeltaInput.IconCompatParcelizer iconCompatParcelizer = customDeltaInput.write;
            if (iconCompatParcelizer != null) {
                customDeltaInput.MediaBrowserCompat$CustomActionResultReceiver();
                iconCompatParcelizer.aB_();
            }
        }
        return z;
    }
}
