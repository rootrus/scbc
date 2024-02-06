package p040o;

import android.view.View;
import com.scb.phone.view.fragment.etb.EtbSetDetailFragment;

/* renamed from: o.DeepLinkModule_ContributeMutualFundsDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeMutualFundsDeepLinkActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ EtbSetDetailFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DeepLinkModule_ContributeMutualFundsDeepLinkActivity(EtbSetDetailFragment etbSetDetailFragment, String str) {
        this.MediaBrowserCompat$ItemReceiver = etbSetDetailFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final void onFocusChange(View view, boolean z) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, z);
    }
}
