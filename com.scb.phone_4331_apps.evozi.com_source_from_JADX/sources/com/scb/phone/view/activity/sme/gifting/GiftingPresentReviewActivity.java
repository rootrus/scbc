package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getUuidUtf8Bytes;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.startZoomOutMessage;

public class GiftingPresentReviewActivity extends ReviewActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    private String MediaBrowserCompat$SearchResultReceiver;
    private String MediaDescriptionCompat;
    @HmlPinActivity
    public startZoomOutMessage presentReviewPresenter;

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, setUuidFromUtf8Bytes setuuidfromutf8bytes, String str, String str2) {
        Intent intent = new Intent(context, GiftingPresentReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("source", str);
        intent.putExtra("subtype", str2);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.MediaDescriptionCompat = read("source", "");
        this.MediaBrowserCompat$SearchResultReceiver = read("subtype", "");
        this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_START", "billpay_review"), new ZSYR2K("source", this.MediaDescriptionCompat), new ZSYR2K("subtype", this.MediaBrowserCompat$SearchResultReceiver));
        this.presentReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onDestroy() {
        this.presentReviewPresenter.onDestroy();
        super.onDestroy();
    }

    public final String MediaSessionCompat$QueueItem() {
        return getString(R.string.gifting_review_activity);
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.presentReviewPresenter.MediaBrowserCompat$ItemReceiver(setuuidfromutf8bytes);
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        this.scbAnalytics.write(read("com.scb.phone.analytics.KEY_EVENT_FINISH", "billpay_slip"), new ZSYR2K("source", this.MediaDescriptionCompat), new ZSYR2K("subtype", this.MediaBrowserCompat$SearchResultReceiver));
        super.IconCompatParcelizer(getuuidutf8bytes);
    }
}
