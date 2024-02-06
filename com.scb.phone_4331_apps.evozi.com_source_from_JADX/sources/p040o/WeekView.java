package p040o;

import android.view.View;
import com.google.gson.annotations.SerializedName;
import com.scb.phone.view.activity.sme.gifting.GiftPreviewActivity;
import p040o.showRect;

/* renamed from: o.WeekView */
public final /* synthetic */ class WeekView implements View.OnClickListener {
    private final /* synthetic */ GiftPreviewActivity MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ AutoValue_CrashlyticsReport_Session_User write;

    public /* synthetic */ WeekView(GiftPreviewActivity giftPreviewActivity, AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        this.MediaBrowserCompat$ItemReceiver = giftPreviewActivity;
        this.write = autoValue_CrashlyticsReport_Session_User;
    }

    public final void onClick(View view) {
        GiftPreviewActivity giftPreviewActivity = this.MediaBrowserCompat$ItemReceiver;
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User = this.write;
        showRect showrect = giftPreviewActivity.presenter;
        if (showrect.RatingCompat != null) {
            showrect.RatingCompat.AlertController$RecycleListView();
        }
        showrect.write.MediaBrowserCompat$ItemReceiver(new Object(autoValue_CrashlyticsReport_Session_User.setHasDecor) {
            @SerializedName("giftTranId")
            private String MediaBrowserCompat$CustomActionResultReceiver;

            {
                this.MediaBrowserCompat$CustomActionResultReceiver = r1;
            }
        });
        showrect.write.IconCompatParcelizer(new showRect.write(autoValue_CrashlyticsReport_Session_User));
    }
}
