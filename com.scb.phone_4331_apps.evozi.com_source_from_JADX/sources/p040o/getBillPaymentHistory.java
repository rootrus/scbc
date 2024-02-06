package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.EasycashHeaderAdapter;

/* renamed from: o.getBillPaymentHistory */
public final /* synthetic */ class getBillPaymentHistory implements View.OnClickListener {
    private final /* synthetic */ EasycashHeaderAdapter.write IconCompatParcelizer;
    private final /* synthetic */ getLegacySharedPrefs read;

    public /* synthetic */ getBillPaymentHistory(EasycashHeaderAdapter.write write, getLegacySharedPrefs getlegacysharedprefs) {
        this.IconCompatParcelizer = write;
        this.read = getlegacysharedprefs;
    }

    public final void onClick(View view) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
