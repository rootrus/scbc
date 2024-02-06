package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.mwpartner.MwTermsAndConditionsActivity;
import p040o.getErrCause;

/* renamed from: o.setPagingEnabled */
public final /* synthetic */ class setPagingEnabled implements DialogInterface.OnClickListener {
    private final /* synthetic */ MwTermsAndConditionsActivity write;

    public /* synthetic */ setPagingEnabled(MwTermsAndConditionsActivity mwTermsAndConditionsActivity) {
        this.write = mwTermsAndConditionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        getErrCause geterrcause = this.write.merchantTermsAndConditionsPresenter;
        if (geterrcause.RatingCompat != null) {
            geterrcause.RatingCompat.AlertController$RecycleListView();
        }
        standardSetCount MediaBrowserCompat$ItemReceiver = standardSetCount.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.write = geterrcause.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().read;
        geterrcause.read.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver);
        geterrcause.read.IconCompatParcelizer(new getErrCause.write());
    }
}
