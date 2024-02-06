package p040o;

import android.content.Intent;
import android.view.View;
import com.scb.phone.view.activity.sme.gifting.GiftOpenSharingMomentActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingOpenedActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;

/* renamed from: o.DateFormatDayFormatter */
public final /* synthetic */ class DateFormatDayFormatter implements View.OnClickListener {
    private final /* synthetic */ AutoValue_CrashlyticsReport_Session_User IconCompatParcelizer;
    private final /* synthetic */ GiftingOpenedActivity read;

    public /* synthetic */ DateFormatDayFormatter(GiftingOpenedActivity giftingOpenedActivity, AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        this.read = giftingOpenedActivity;
        this.IconCompatParcelizer = autoValue_CrashlyticsReport_Session_User;
    }

    public final void onClick(View view) {
        GiftingOpenedActivity giftingOpenedActivity = this.read;
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User = this.IconCompatParcelizer;
        Intent intent = new Intent(giftingOpenedActivity, GiftOpenSharingMomentActivity.class);
        intent.putExtra("EXTRA_GIFT_STATUS_SELECTED", autoValue_CrashlyticsReport_Session_User);
        IntentTidInjectionContextAspect.aspectOf();
        GiftingOpenedActivity.MediaBrowserCompat$ItemReceiver(giftingOpenedActivity, intent);
    }
}
