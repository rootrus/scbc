package com.scb.phone.view.activity.debitcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.DebitCardResetOtpActivity;
import p040o.GCoreWakefulBroadcastReceiver;
import p040o.HmlPinActivity;
import p040o.TagManagerServiceProviderImpl;
import p040o.WakeLock;
import p040o.acquire;
import p040o.getNumberOfColumns;
import p040o.getNumberOfColumns$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.previewIntent;

public class DebitCardOtpActivationActivity extends BaseOtpActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    @HmlPinActivity
    public getNumberOfColumns presenter;

    public static Intent MediaBrowserCompat$CustomActionResultReceiver(Activity activity) {
        return new Intent(activity, DebitCardOtpActivationActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("atm_activate_select_mobile_no_otp_screen");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        getNumberOfColumns getnumberofcolumns = this.presenter;
        if (!getnumberofcolumns.read) {
            boolean z = true;
            getnumberofcolumns.read = true;
            if (getnumberofcolumns.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getnumberofcolumns.RatingCompat.AlertController$RecycleListView();
            }
            previewIntent previewintent = getnumberofcolumns.IconCompatParcelizer;
            previewintent.write(DebitCardResetOtpActivity.zip(previewintent.MediaBrowserCompat$CustomActionResultReceiver.read(), previewintent.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(), acquire.MediaBrowserCompat$ItemReceiver).flatMap(new GCoreWakefulBroadcastReceiver(previewintent, str2, str)).doOnNext(new TagManagerServiceProviderImpl(previewintent.MediaBrowserCompat$CustomActionResultReceiver)).flatMap(WakeLock.IconCompatParcelizer), new getNumberOfColumns$MediaBrowserCompat$CustomActionResultReceiver(getnumberofcolumns, (byte) 0));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        mo13676d_("atm_activate_input_otp_screen");
        super.MediaBrowserCompat$CustomActionResultReceiver(str, str2, str3);
    }
}
