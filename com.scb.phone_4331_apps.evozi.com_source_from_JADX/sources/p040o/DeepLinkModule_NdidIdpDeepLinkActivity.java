package p040o;

import com.scb.phone.view.custom.common.CustomEditText;
import com.scb.phone.view.fragment.hml.HmlBasePersonalInfoFragment;

/* renamed from: o.DeepLinkModule_NdidIdpDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_NdidIdpDeepLinkActivity implements CustomEditText.write {
    private final /* synthetic */ HmlBasePersonalInfoFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ DeepLinkModule_NdidIdpDeepLinkActivity(HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment) {
        this.MediaBrowserCompat$ItemReceiver = hmlBasePersonalInfoFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment = this.MediaBrowserCompat$ItemReceiver;
        hmlBasePersonalInfoFragment.root.setFocusable(true);
        hmlBasePersonalInfoFragment.root.setFocusableInTouchMode(true);
        hmlBasePersonalInfoFragment.root.requestFocus();
    }
}
