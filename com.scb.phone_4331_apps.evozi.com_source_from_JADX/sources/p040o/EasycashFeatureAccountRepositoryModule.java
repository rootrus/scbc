package p040o;

import android.view.View;
import com.scb.phone.view.adapter.accountsummary.InvestmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.EasycashFeatureAccountRepositoryModule */
public final /* synthetic */ class EasycashFeatureAccountRepositoryModule implements View.OnClickListener {
    private final /* synthetic */ sendReports MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ InvestmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver write;

    public /* synthetic */ EasycashFeatureAccountRepositoryModule(InvestmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver investmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver, sendReports sendreports) {
        this.write = investmentViewPagerAdapter$MediaBrowserCompat$ItemReceiver;
        this.MediaBrowserCompat$ItemReceiver = sendreports;
    }

    public final void onClick(View view) {
        this.write.read(this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper);
    }
}
