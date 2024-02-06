package p040o;

import android.view.View;
import com.scb.phone.view.adapter.accountsummary.CardViewPagerAdapter;

/* renamed from: o.RepositoryModule */
public final /* synthetic */ class RepositoryModule implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CardViewPagerAdapter read;

    public /* synthetic */ RepositoryModule(CardViewPagerAdapter cardViewPagerAdapter, int i) {
        this.read = cardViewPagerAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        CardViewPagerAdapter cardViewPagerAdapter = this.read;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        FragmentBuilder_BindBillPaymentSuccessFragment fragmentBuilder_BindBillPaymentSuccessFragment = cardViewPagerAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindBillPaymentSuccessFragment != null) {
            fragmentBuilder_BindBillPaymentSuccessFragment.MediaBrowserCompat$ItemReceiver(i);
        }
    }
}
