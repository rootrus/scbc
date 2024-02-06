package p040o;

import com.scb.phone.view.adapter.transferandpay.BillerAdapter;
import com.scb.phone.view.fragment.transferandpay.billpaymenttab.BillPaymentBillerListFragment;

/* renamed from: o.ActivityBuilder_ContributesStatementChannelCommonActivity */
public final /* synthetic */ class ActivityBuilder_ContributesStatementChannelCommonActivity implements BillerAdapter.IconCompatParcelizer {
    private final /* synthetic */ getStreetViewPanoramaCamera MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ BillPaymentBillerListFragment.read MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributesStatementChannelCommonActivity(BillPaymentBillerListFragment.read read, getStreetViewPanoramaCamera getstreetviewpanoramacamera) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.MediaBrowserCompat$CustomActionResultReceiver = getstreetviewpanoramacamera;
    }

    public final void IconCompatParcelizer() {
        BillPaymentBillerListFragment.read read = this.MediaBrowserCompat$ItemReceiver;
        BillPaymentBillerListFragment.this.billPaymentPresenter.MediaBrowserCompat$ItemReceiver(BillPaymentBillerListFragment.this.MediaBrowserCompat$SearchResultReceiver(), this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver, BillPaymentBillerListFragment.this.RatingCompat);
    }
}
