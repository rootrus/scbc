package p040o;

import android.view.View;
import com.scb.phone.view.adapter.accountsummary.DepositViewPagerAdapter;

/* renamed from: o.EasycashLoanFeatureInfoRepositoryModule */
public final /* synthetic */ class EasycashLoanFeatureInfoRepositoryModule implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DepositViewPagerAdapter read;

    public /* synthetic */ EasycashLoanFeatureInfoRepositoryModule(DepositViewPagerAdapter depositViewPagerAdapter, int i) {
        this.read = depositViewPagerAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
    }

    public final void onClick(View view) {
        DepositViewPagerAdapter depositViewPagerAdapter = this.read;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        getAboveMaxFrontImageSize getabovemaxfrontimagesize = depositViewPagerAdapter.IconCompatParcelizer;
        if (getabovemaxfrontimagesize != null) {
            getabovemaxfrontimagesize.read(i);
        }
    }
}
