package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.custom.easycash.CustomEmail;

/* renamed from: o.LogoutService */
public final /* synthetic */ class LogoutService implements TextView.OnEditorActionListener {
    private final /* synthetic */ CustomEmail IconCompatParcelizer;

    public /* synthetic */ LogoutService(CustomEmail customEmail) {
        this.IconCompatParcelizer = customEmail;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        CustomEmail customEmail = this.IconCompatParcelizer;
        if (i != 6) {
            return false;
        }
        customEmail.MediaBrowserCompat$CustomActionResultReceiver();
        return false;
    }
}
