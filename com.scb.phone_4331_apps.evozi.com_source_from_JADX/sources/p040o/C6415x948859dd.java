package p040o;

import android.view.View;
import com.scb.phone.view.fragment.ebillsubscription.EbillSubscriptionInputFragment;

/* renamed from: o.DeepLinkModule_ContributeHmlBusinessOwnerCalculatorDeepLinkActivity */
public final /* synthetic */ class C6415x948859dd implements View.OnFocusChangeListener {
    private final /* synthetic */ EbillSubscriptionInputFragment IconCompatParcelizer;

    public /* synthetic */ C6415x948859dd(EbillSubscriptionInputFragment ebillSubscriptionInputFragment) {
        this.IconCompatParcelizer = ebillSubscriptionInputFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        EbillSubscriptionInputFragment ebillSubscriptionInputFragment = this.IconCompatParcelizer;
        EbillSubscriptionInputFragment.MediaBrowserCompat$CustomActionResultReceiver(ebillSubscriptionInputFragment.ref3EditText, ebillSubscriptionInputFragment.tvErrorRef3, z);
    }
}
