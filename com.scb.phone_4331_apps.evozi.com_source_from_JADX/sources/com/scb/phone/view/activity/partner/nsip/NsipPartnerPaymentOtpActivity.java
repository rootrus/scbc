package com.scb.phone.view.activity.partner.nsip;

import android.content.Intent;
import android.os.Bundle;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.C10887sdkVersion;
import p040o.C4332eC;
import p040o.HashMultimap;
import p040o.HmlPinActivity;
import p040o.eC$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.setStartedAt;
import p040o.standardStartAndWait;

public final class NsipPartnerPaymentOtpActivity extends BaseOtpActivity implements C10887sdkVersion.write {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);
    @HmlPinActivity
    public C4332eC presenter;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C4332eC eCVar = this.presenter;
        if (eCVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eCVar.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        setStartedAt setstartedat = (setStartedAt) getIntent().getParcelableExtra("EXTRA_NSIP_VERIFICATION");
        C4332eC eCVar = this.presenter;
        if (eCVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) setstartedat, "verificationDisplay");
        onGetStartedClick.write((Object) setstartedat, "verificationDisplay");
        if (eCVar.RatingCompat != null) {
            eCVar.RatingCompat.AlertController$RecycleListView();
        }
        eCVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new C4332eC.IconCompatParcelizer(eCVar, setstartedat), new eC$MediaBrowserCompat$ItemReceiver(eCVar), new HashMultimap(setstartedat.PlaybackStateCompat$CustomAction), str2, str);
    }

    public final void write(standardStartAndWait standardstartandwait) {
        onGetStartedClick.write((Object) standardstartandwait, "successfulDisplay");
        Intent intent = new Intent();
        intent.putExtra("EXTRA_NSIP_SUCCESS", standardstartandwait);
        setResult(-1, intent);
        finish();
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        mo13730i_(str);
    }

    public final void write() {
        setResult(0);
        finish();
    }

    public final void onBackPressed() {
        setResult(1);
        super.onBackPressed();
    }

    public final void onDestroy() {
        super.onDestroy();
        C4332eC eCVar = this.presenter;
        if (eCVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        eCVar.onDestroy();
    }
}
