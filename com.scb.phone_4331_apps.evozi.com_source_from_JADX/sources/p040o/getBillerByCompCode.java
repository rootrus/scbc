package p040o;

import android.view.View;
import com.scb.phone.view.adapter.easycash.EasycashLoanTrackingAdapter;

/* renamed from: o.getBillerByCompCode */
public final /* synthetic */ class getBillerByCompCode implements View.OnClickListener {
    private final /* synthetic */ EasycashLoanTrackingAdapter.read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getLegacySharedPrefs MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getBillerByCompCode(EasycashLoanTrackingAdapter.read read, getLegacySharedPrefs getlegacysharedprefs) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
        this.MediaBrowserCompat$ItemReceiver = getlegacysharedprefs;
    }

    public final void onClick(View view) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }
}
