package p040o;

import android.view.View;
import com.scb.phone.view.adapter.accountsummary.C5726xd4cdc3cd;
import com.scb.phone.view.adapter.accountsummary.PrepaidViewPagerAdapter;

/* renamed from: o.EasycashMHMCDetailRepositoryModule */
public final /* synthetic */ class EasycashMHMCDetailRepositoryModule implements View.OnClickListener {
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ PrepaidViewPagerAdapter read;

    public /* synthetic */ EasycashMHMCDetailRepositoryModule(PrepaidViewPagerAdapter prepaidViewPagerAdapter, int i) {
        this.read = prepaidViewPagerAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        PrepaidViewPagerAdapter prepaidViewPagerAdapter = this.read;
        int i = this.MediaBrowserCompat$ItemReceiver;
        C5726xd4cdc3cd prepaidViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver = prepaidViewPagerAdapter.IconCompatParcelizer;
        if (prepaidViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver != null) {
            prepaidViewPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.write(i);
        }
    }
}
