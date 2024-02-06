package p040o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.getLatestModelDataBuildInfo */
public final /* synthetic */ class getLatestModelDataBuildInfo implements DialogInterface.OnClickListener {
    private final /* synthetic */ HomeActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getLatestModelDataBuildInfo(HomeActivity homeActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = homeActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        HomeActivity homeActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (homeActivity.iDeviceCompatibilityHelper.read()) {
            new forEachAdd().MediaBrowserCompat$ItemReceiver(homeActivity.scbAnalytics, "fastpay_cancel");
            Intent intent = new Intent(homeActivity, ScanPaymentActivity.class);
            IntentTidInjectionContextAspect.aspectOf();
            HomeActivity.write((Context) homeActivity, intent);
        }
        dialogInterface.dismiss();
    }
}
