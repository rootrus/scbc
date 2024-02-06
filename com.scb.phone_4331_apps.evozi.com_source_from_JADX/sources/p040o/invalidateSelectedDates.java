package p040o;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.mwpartner.MwTermsAndConditionsActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.invalidateSelectedDates */
public final /* synthetic */ class invalidateSelectedDates implements DialogInterface.OnClickListener {
    private final /* synthetic */ MwTermsAndConditionsActivity IconCompatParcelizer;

    public /* synthetic */ invalidateSelectedDates(MwTermsAndConditionsActivity mwTermsAndConditionsActivity) {
        this.IconCompatParcelizer = mwTermsAndConditionsActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        MwTermsAndConditionsActivity mwTermsAndConditionsActivity = this.IconCompatParcelizer;
        Intent IconCompatParcelizer2 = HomeActivity.IconCompatParcelizer((Context) mwTermsAndConditionsActivity);
        IntentTidInjectionContextAspect.aspectOf();
        MwTermsAndConditionsActivity.read(mwTermsAndConditionsActivity, IconCompatParcelizer2);
    }
}
