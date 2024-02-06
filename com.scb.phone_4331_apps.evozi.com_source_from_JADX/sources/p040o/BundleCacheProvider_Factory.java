package p040o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.fastpay.ManageFastPayQrScanActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.BundleCacheProvider_Factory */
public final /* synthetic */ class BundleCacheProvider_Factory implements DialogInterface.OnClickListener {
    private final /* synthetic */ HomeActivity write;

    public /* synthetic */ BundleCacheProvider_Factory(HomeActivity homeActivity) {
        this.write = homeActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        HomeActivity homeActivity = this.write;
        homeActivity.MediaBrowserCompat$SearchResultReceiver = true;
        new forEachAdd().MediaBrowserCompat$ItemReceiver(homeActivity.scbAnalytics, "fastpay_setup");
        Intent intent = new Intent(homeActivity, ManageFastPayQrScanActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        HomeActivity.MediaBrowserCompat$ItemReceiver((Context) homeActivity, intent);
        dialogInterface.dismiss();
    }
}
