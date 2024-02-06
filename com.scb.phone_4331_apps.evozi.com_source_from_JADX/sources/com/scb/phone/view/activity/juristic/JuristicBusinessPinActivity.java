package com.scb.phone.view.activity.juristic;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.C7136hq;
import p040o.DocumentBaseOverlayView_Factory;
import p040o.HmlPinActivity;
import p040o.MerchantService;
import p040o.onGetStartedClick;
import p040o.setSteadyMessage;

public final class JuristicBusinessPinActivity extends BaseJuristicPinActivity implements MerchantService, C7136hq {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);
    @HmlPinActivity
    public setSteadyMessage presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final DocumentBaseOverlayView_Factory<?> mo34046x50fd9e4a() {
        setSteadyMessage setsteadymessage = this.presenter;
        if (setsteadymessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return setsteadymessage;
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSteadyMessage setsteadymessage = this.presenter;
        if (setsteadymessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setsteadymessage.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = getIntent();
        if (intent != null) {
            setSteadyMessage setsteadymessage = this.presenter;
            if (setsteadymessage == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String stringExtra = intent.getStringExtra("EXTRA_DEVICE_STATE");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "it.getStringExtra(EXTRA_DEVICE_STATE)");
            String stringExtra2 = intent.getStringExtra("EXTRA_TOKEN_ID");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "it.getStringExtra(EXTRA_TOKEN_ID)");
            onGetStartedClick.write((Object) stringExtra, "deviceState");
            onGetStartedClick.write((Object) stringExtra2, "tokenId");
            setsteadymessage.write = stringExtra;
            setsteadymessage.IconCompatParcelizer = stringExtra2;
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        super.MediaSessionCompat$QueueItem();
        setTitle(R.string.juristic_enter_business_pin_title);
        TextView textView = this.textLabelTop;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textLabelTop");
        }
        textView.setText(getString(R.string.juristic_enter_business_pin_description));
    }

    public final void MediaBrowserCompat$ItemReceiver(String str, String str2) {
        onGetStartedClick.write((Object) str, "deviceState");
        onGetStartedClick.write((Object) str2, "preregistrationTokenId");
        JuristicOtpActivity.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(this, str, str2);
    }
}
