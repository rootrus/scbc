package com.scb.phone.view.activity.bscanc;

import android.content.Intent;
import android.os.Bundle;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import p040o.ComputingConcurrentHashMap;
import p040o.CreditCardParameters;
import p040o.HeartBeatInfoStorage;
import p040o.HeartBeatInfoStorage$MediaBrowserCompat$ItemReceiver;
import p040o.HmlPinActivity;
import p040o.getKeepAlive;
import p040o.getOversizeImage;
import p040o.isShutdown;
import p040o.onGetStartedClick;

public final class QrToPayOtpActivity extends BaseOtpActivity implements CreditCardParameters.CardStyle {
    public static final QrToPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$SearchResultReceiver = new QrToPayOtpActivity$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
    @HmlPinActivity
    public HeartBeatInfoStorage presenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HeartBeatInfoStorage heartBeatInfoStorage = this.presenter;
        if (heartBeatInfoStorage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        heartBeatInfoStorage.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        ComputingConcurrentHashMap.ComputationExceptionReference computationExceptionReference = new ComputingConcurrentHashMap.ComputationExceptionReference(getIntent().getStringExtra("ACCOUNT_NUMBER"), getIntent().getStringExtra("QR_LIMIT"), getIntent().getStringExtra("FUNCTION"));
        HeartBeatInfoStorage heartBeatInfoStorage = this.presenter;
        if (heartBeatInfoStorage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        onGetStartedClick.write((Object) computationExceptionReference, "request");
        if (heartBeatInfoStorage.RatingCompat != null) {
            heartBeatInfoStorage.RatingCompat.AlertController$RecycleListView();
        }
        getKeepAlive getkeepalive = heartBeatInfoStorage.IconCompatParcelizer;
        onGetStartedClick.write((Object) computationExceptionReference, "request");
        getkeepalive.read(getkeepalive.IconCompatParcelizer.write(str2, str, computationExceptionReference), new HeartBeatInfoStorage$MediaBrowserCompat$ItemReceiver(heartBeatInfoStorage), new HeartBeatInfoStorage.read(heartBeatInfoStorage));
    }

    public final void read(isShutdown isshutdown, String str) {
        onGetStartedClick.write((Object) isshutdown, "qrBScanCDisplay");
        onGetStartedClick.write((Object) str, "responseCode");
        Intent intent = new Intent();
        intent.putExtra("QR_BSCANC", isshutdown);
        intent.putExtra("KEY_RESPONSE_CODE", str);
        setResult(-1, intent);
        finish();
    }

    public final void IconCompatParcelizer() {
        finish();
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }
}
