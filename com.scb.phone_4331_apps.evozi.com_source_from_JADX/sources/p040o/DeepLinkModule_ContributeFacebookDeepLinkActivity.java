package p040o;

import android.view.View;
import com.scb.phone.view.fragment.ebillsubscription.EbillSubscriptionInputFragment;

/* renamed from: o.DeepLinkModule_ContributeFacebookDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_ContributeFacebookDeepLinkActivity implements View.OnFocusChangeListener {
    private final /* synthetic */ EbillSubscriptionInputFragment IconCompatParcelizer;

    public /* synthetic */ DeepLinkModule_ContributeFacebookDeepLinkActivity(EbillSubscriptionInputFragment ebillSubscriptionInputFragment) {
        this.IconCompatParcelizer = ebillSubscriptionInputFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        EbillSubscriptionInputFragment ebillSubscriptionInputFragment = this.IconCompatParcelizer;
        EbillSubscriptionInputFragment.MediaBrowserCompat$CustomActionResultReceiver(ebillSubscriptionInputFragment.ref1EditText, ebillSubscriptionInputFragment.tvErrorRef1, z);
    }
}
