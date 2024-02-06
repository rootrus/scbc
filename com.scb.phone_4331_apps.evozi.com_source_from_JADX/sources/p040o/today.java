package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.mwpartner.MwLandingActivity;

/* renamed from: o.today */
public final /* synthetic */ class today implements DialogInterface.OnClickListener {
    private final /* synthetic */ MwLandingActivity read;

    public /* synthetic */ today(MwLandingActivity mwLandingActivity) {
        this.read = mwLandingActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MwLandingActivity mwLandingActivity = this.read;
        dialogInterface.dismiss();
        mwLandingActivity.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
