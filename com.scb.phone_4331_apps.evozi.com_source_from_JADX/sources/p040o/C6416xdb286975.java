package p040o;

import android.view.View;
import com.scb.phone.view.fragment.ebillsubscription.EbillSubscriptionInputFragment;

/* renamed from: o.DeepLinkModule_ContributeHmlBusinessOwnerSuccessfulDeepLinkActivity */
public final /* synthetic */ class C6416xdb286975 implements View.OnFocusChangeListener {
    private final /* synthetic */ EbillSubscriptionInputFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ C6416xdb286975(EbillSubscriptionInputFragment ebillSubscriptionInputFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = ebillSubscriptionInputFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        EbillSubscriptionInputFragment ebillSubscriptionInputFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        EbillSubscriptionInputFragment.MediaBrowserCompat$CustomActionResultReceiver(ebillSubscriptionInputFragment.ref2EditText, ebillSubscriptionInputFragment.tvErrorRef2, z);
    }
}
