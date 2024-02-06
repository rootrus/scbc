package p040o;

import android.view.View;
import com.scb.phone.view.custom.easycash.CustomEmail;

/* renamed from: o.getActivateChequeConfirm */
public final /* synthetic */ class getActivateChequeConfirm implements View.OnFocusChangeListener {
    private final /* synthetic */ CustomEmail write;

    public /* synthetic */ getActivateChequeConfirm(CustomEmail customEmail) {
        this.write = customEmail;
    }

    public final void onFocusChange(View view, boolean z) {
        CustomEmail customEmail = this.write;
        if (z) {
            customEmail.MediaBrowserCompat$ItemReceiver(false);
        } else {
            customEmail.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }
}
