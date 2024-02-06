package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.EasycashProductAdapter;

/* renamed from: o.getPerformCinemaPayment */
public final /* synthetic */ class getPerformCinemaPayment implements View.OnClickListener {
    private final /* synthetic */ EasycashProductAdapter.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getLegacySharedPrefs read;

    public /* synthetic */ getPerformCinemaPayment(EasycashProductAdapter.IconCompatParcelizer iconCompatParcelizer, getLegacySharedPrefs getlegacysharedprefs) {
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer;
        this.read = getlegacysharedprefs;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver.read(this.read);
    }
}
