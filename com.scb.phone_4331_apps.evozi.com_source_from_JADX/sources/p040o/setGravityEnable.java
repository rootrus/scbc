package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;

/* renamed from: o.setGravityEnable */
public final /* synthetic */ class setGravityEnable implements DialogInterface.OnClickListener {
    private final /* synthetic */ MwBusinessDetailsActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setGravityEnable(MwBusinessDetailsActivity mwBusinessDetailsActivity) {
        this.MediaBrowserCompat$ItemReceiver = mwBusinessDetailsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$ItemReceiver.finish();
    }
}
