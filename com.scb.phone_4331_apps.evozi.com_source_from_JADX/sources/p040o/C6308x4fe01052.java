package p040o;

import com.scb.phone.view.fragment.landingpage.PartnerWebViewFragment;
import java.lang.ref.WeakReference;

/* renamed from: o.ActivityBuilder_ContributeECouponCommonActivity$MediaBrowserCompat$CustomActionResultReceiver */
final class C6308x4fe01052 implements HistoryAdapter$GroupFooterViewHolder_ViewBinding {
    private final WeakReference<PartnerWebViewFragment> MediaBrowserCompat$CustomActionResultReceiver;

    /* synthetic */ C6308x4fe01052(PartnerWebViewFragment partnerWebViewFragment, byte b) {
        this(partnerWebViewFragment);
    }

    private C6308x4fe01052(PartnerWebViewFragment partnerWebViewFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = new WeakReference<>(partnerWebViewFragment);
    }

    public final void write() {
        PartnerWebViewFragment partnerWebViewFragment = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (partnerWebViewFragment != null) {
            partnerWebViewFragment.requestPermissions(ActivityBuilder_ContributeECouponCommonActivity.IconCompatParcelizer, 42);
        }
    }

    public final void read() {
        PartnerWebViewFragment partnerWebViewFragment = this.MediaBrowserCompat$CustomActionResultReceiver.get();
        if (partnerWebViewFragment != null) {
            partnerWebViewFragment.getUserVisibleHint();
        }
    }
}
