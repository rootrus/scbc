package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;
import com.scb.phone.view.adapter.accountsummary.ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.C4744hc;
import p040o.C4767hi;
import p040o.CrashlyticsReport;
import p040o.CrashlyticsReportJsonTransform$$Lambda$4;
import p040o.HmlPinActivity;
import p040o.LocalProjectProvider;
import p040o.LogFileManager;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getCustomAttributes;
import p040o.parseEventSignal;
import p040o.setTapText;

public class PrepaidInputActivity extends BaseActivity implements LocalProjectProvider.VersionTable {
    private String MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver;
    private String MediaMetadataCompat;
    @HmlPinActivity
    public C4767hi prepaidInputPresenter;

    public static Intent read(Context context, String str, String str2, String str3) {
        Intent intent = new Intent(context, PrepaidInputActivity.class);
        intent.putExtra("KEY_BILLER_ID", str);
        intent.putExtra("KEY_CARD_REF_NO", str2);
        intent.putExtra("KEY_CARD_MASK", str3);
        return intent;
    }

    public static Intent write(Context context, String str, String str2, String str3, getCustomAttributes getcustomattributes) {
        Intent intent = new Intent(context, PrepaidInputActivity.class);
        intent.putExtra("KEY_BILLER_ID", str);
        intent.putExtra("KEY_CARD_REF_NO", str2);
        intent.putExtra("KEY_CARD_MASK", str3);
        intent.putExtra("KEY_PREPAID_TRAVEL_WALLET_SUMMARY", getcustomattributes);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.prepaidInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = getIntent().getStringExtra("KEY_BILLER_ID");
        this.MediaBrowserCompat$MediaItem = getIntent().getStringExtra("KEY_CARD_REF_NO");
        this.MediaBrowserCompat$SearchResultReceiver = getIntent().getStringExtra("KEY_CARD_MASK");
        getCustomAttributes getcustomattributes = (getCustomAttributes) getIntent().getParcelableExtra("KEY_PREPAID_TRAVEL_WALLET_SUMMARY");
        C4767hi hiVar = this.prepaidInputPresenter;
        String str = this.MediaMetadataCompat;
        String str2 = this.MediaBrowserCompat$MediaItem;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (getcustomattributes == null) {
            hiVar.read(str, str2, str3);
            return;
        }
        C4744hc hcVar = new C4744hc(getcustomattributes);
        if (hiVar.RatingCompat != null) {
            hcVar.IconCompatParcelizer(hiVar.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(parseEventSignal parseeventsignal, LogFileManager.C35981 r12) {
        CrashlyticsReport.FilesPayload.File.write write = new CrashlyticsReport.FilesPayload.File.write(CrashlyticsReportJsonTransform$$Lambda$4.TOP_UP_FUNCTION);
        write.read = 5;
        write.MediaBrowserCompat$ItemReceiver = false;
        write.IconCompatParcelizer = true;
        write.MediaDescriptionCompat = true;
        write.RatingCompat = true;
        TopUpActivity.read(this, parseeventsignal, r12, "input", "prepaid_planet_scb", new CrashlyticsReport.FilesPayload.File(write, (byte) 0), ErrorPagerAdapter$MediaBrowserCompat$CustomActionResultReceiver.AUTO_RESIZE_MESSAGE_ERROR);
        finish();
    }

    public final void write(getCustomAttributes getcustomattributes) {
        Intent MediaBrowserCompat$ItemReceiver = PrepaidTravelTopupLandingActivity.MediaBrowserCompat$ItemReceiver(this, getcustomattributes);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1002 && i2 == -1) {
            this.prepaidInputPresenter.read(this.MediaMetadataCompat, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver);
        } else {
            finish();
        }
    }

    public void onDestroy() {
        this.prepaidInputPresenter.onDestroy();
        super.onDestroy();
    }
}
