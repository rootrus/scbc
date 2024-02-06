package p040o;

import android.view.View;
import com.scb.phone.view.adapter.donations.DonationsItemListAdapter;

/* renamed from: o.getAutoInquiryAmount */
public final /* synthetic */ class getAutoInquiryAmount implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ DonationsItemListAdapter write;

    public /* synthetic */ getAutoInquiryAmount(DonationsItemListAdapter donationsItemListAdapter, int i) {
        this.write = donationsItemListAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        DonationsItemListAdapter donationsItemListAdapter = this.write;
        int i = this.MediaBrowserCompat$ItemReceiver;
        FragmentBuilder_BindBillPaymentBillerSelectedFragment fragmentBuilder_BindBillPaymentBillerSelectedFragment = donationsItemListAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindBillPaymentBillerSelectedFragment != null) {
            fragmentBuilder_BindBillPaymentBillerSelectedFragment.MediaBrowserCompat$CustomActionResultReceiver(donationsItemListAdapter.read.get(i));
        }
    }
}
