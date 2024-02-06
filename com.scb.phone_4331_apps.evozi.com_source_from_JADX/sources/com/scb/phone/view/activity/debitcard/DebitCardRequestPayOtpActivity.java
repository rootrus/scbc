package com.scb.phone.view.activity.debitcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.nativeClassify;
import p040o.nativeClassify$MediaBrowserCompat$ItemReceiver;
import p040o.newValueReference;

public class DebitCardRequestPayOtpActivity extends BaseOtpActivity implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    @HmlPinActivity
    public nativeClassify presenter;

    public static Intent read(Activity activity, String str) {
        return new Intent(activity, DebitCardRequestPayOtpActivity.class).putExtra("EXTRA_OTP_POLICY_ID", (String) null).putExtra("transactionToken", str);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("atm_request_select_mobile_no_otp_screen");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.read = getIntent().getStringExtra("transactionToken");
    }

    public final void write(String str, String str2) {
        nativeClassify nativeclassify = this.presenter;
        if (!nativeclassify.write) {
            boolean z = true;
            nativeclassify.write = true;
            if (nativeclassify.RatingCompat == null) {
                z = false;
            }
            if (z) {
                nativeclassify.RatingCompat.AlertController$RecycleListView();
            }
            nativeclassify.IconCompatParcelizer.write(str2, str, new newValueReference(nativeclassify.read));
            nativeclassify.IconCompatParcelizer.IconCompatParcelizer(new nativeClassify$MediaBrowserCompat$ItemReceiver(nativeclassify, (byte) 0));
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        mo13676d_("atm_request_input_otp_screen");
        super.MediaBrowserCompat$CustomActionResultReceiver(str, str2, str3);
    }
}
