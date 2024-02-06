package p040o;

import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.custom.easycash.CustomEmail;

/* renamed from: o.getMigrationFLag */
public final /* synthetic */ class getMigrationFLag implements CustomEditText.IconCompatParcelizer {
    private final /* synthetic */ CustomEmail MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getMigrationFLag(CustomEmail customEmail) {
        this.MediaBrowserCompat$ItemReceiver = customEmail;
    }

    public final boolean IconCompatParcelizer(CustomEditText customEditText, String str) {
        this.MediaBrowserCompat$ItemReceiver.emailEditText.setText(str);
        return true;
    }
}
