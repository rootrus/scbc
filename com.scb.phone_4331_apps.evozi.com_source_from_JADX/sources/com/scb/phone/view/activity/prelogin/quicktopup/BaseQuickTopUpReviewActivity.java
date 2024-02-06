package com.scb.phone.view.activity.prelogin.quicktopup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.prelogin.PreLoginActivity;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.AppMeasurement;
import p040o.C4458gP;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getDocumentSkew$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.orderKeysBy;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public abstract class BaseQuickTopUpReviewActivity extends ReviewActivity implements getDocumentSkew$MediaBrowserCompat$CustomActionResultReceiver {
    @HmlPinActivity
    public C4458gP reviewQuickTopUpPresenter;

    public abstract String MediaSessionCompat$QueueItem();

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.reviewQuickTopUpPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public void onDestroy() {
        this.reviewQuickTopUpPresenter.onDestroy();
        super.onDestroy();
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        C4458gP gPVar = this.reviewQuickTopUpPresenter;
        String str = setuuidfromutf8bytes.setExpandedFormat;
        String str2 = setuuidfromutf8bytes.setBackgroundResource;
        if (gPVar.RatingCompat != null) {
            gPVar.RatingCompat.AlertController$RecycleListView();
        }
        AppMeasurement.UserProperty userProperty = gPVar.write;
        orderKeysBy.write read = orderKeysBy.read();
        read.IconCompatParcelizer = str2;
        userProperty.write(new orderKeysBy(read, (byte) 0), str);
        gPVar.write.IconCompatParcelizer(new C4458gP.read(gPVar, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent intent = new Intent(this, PreLoginActivity.class);
        intent.addFlags(603979776);
        intent.putExtra("com.scb.phone.EXTRA_IS_SUCCESS", true);
        intent.putExtra("com.scb.phone.EXTRA_SHOW_SNACK_BAR", true);
        intent.putExtra("com.scb.phone.EXTRA_MESSAGE", getString(R.string.quick_top_up_setup_completed));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        aj_();
    }
}
