package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.common.CustomProxyNumber;

/* renamed from: o.getRegistrations */
public final /* synthetic */ class getRegistrations implements TextView.OnEditorActionListener {
    private final /* synthetic */ CustomProxyNumber read;

    public /* synthetic */ getRegistrations(CustomProxyNumber customProxyNumber) {
        this.read = customProxyNumber;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        CustomProxyNumber customProxyNumber = this.read;
        if (i == 5) {
            customProxyNumber.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            customProxyNumber.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(customProxyNumber.proxyNumberField.getText().toString());
            return false;
        } else if (i != 6) {
            return false;
        } else {
            customProxyNumber.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer();
            return false;
        }
    }
}
