package p040o;

import android.view.View;
import com.scb.phone.view.adapter.donations.DonationsImageSliderPagerAdapter;

/* renamed from: o.getBillPaymentEDonationConfirmation */
public final /* synthetic */ class getBillPaymentEDonationConfirmation implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DonationsImageSliderPagerAdapter read;

    public /* synthetic */ getBillPaymentEDonationConfirmation(DonationsImageSliderPagerAdapter donationsImageSliderPagerAdapter, int i) {
        this.read = donationsImageSliderPagerAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        DonationsImageSliderPagerAdapter donationsImageSliderPagerAdapter = this.read;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindCardActivationFragment fragmentBuilder_BindCardActivationFragment = donationsImageSliderPagerAdapter.read;
        if (fragmentBuilder_BindCardActivationFragment != null) {
            fragmentBuilder_BindCardActivationFragment.MediaBrowserCompat$ItemReceiver(donationsImageSliderPagerAdapter.MediaBrowserCompat$CustomActionResultReceiver.get(i));
        }
    }
}
