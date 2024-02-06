package p040o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.mwpartner.MwTermsAndConditionsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.isPagingEnabled */
public final /* synthetic */ class isPagingEnabled implements DialogInterface.OnClickListener {
    private final /* synthetic */ MwTermsAndConditionsActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ isPagingEnabled(MwTermsAndConditionsActivity mwTermsAndConditionsActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = mwTermsAndConditionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MwTermsAndConditionsActivity mwTermsAndConditionsActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent IconCompatParcelizer = HomeActivity.IconCompatParcelizer((Context) mwTermsAndConditionsActivity);
        IntentTidInjectionContextAspect.aspectOf();
        MwTermsAndConditionsActivity.MediaBrowserCompat$ItemReceiver(mwTermsAndConditionsActivity, IconCompatParcelizer);
    }
}
