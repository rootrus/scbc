package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.mwpartner.MwLandingActivity;

/* renamed from: o.copyToMonthOnly */
public final /* synthetic */ class copyToMonthOnly implements DialogInterface.OnClickListener {
    private final /* synthetic */ MwLandingActivity write;

    public /* synthetic */ copyToMonthOnly(MwLandingActivity mwLandingActivity) {
        this.write = mwLandingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MwLandingActivity mwLandingActivity = this.write;
        dialogInterface.dismiss();
        mwLandingActivity.MediaBrowserCompat$SearchResultReceiver.write();
    }
}
