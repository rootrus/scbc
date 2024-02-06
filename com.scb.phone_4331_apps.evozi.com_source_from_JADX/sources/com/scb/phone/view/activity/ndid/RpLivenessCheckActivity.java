package com.scb.phone.view.activity.ndid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import p040o.C4066bA;
import p040o.C4120bw;
import p040o.HmlPinActivity;
import p040o.generateCircleDrawable;

public class RpLivenessCheckActivity extends BaseLivenessCheckActivity {
    @HmlPinActivity
    public C4120bw livenessCheckPresenter;

    public static Intent MediaBrowserCompat$ItemReceiver(Context context) {
        return new Intent(context, RpLivenessCheckActivity.class);
    }

    /* access modifiers changed from: protected */
    public final C4066bA MediaSessionCompat$Token() {
        return this.livenessCheckPresenter;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.livenessCheckPresenter.MediaBrowserCompat$ItemReceiver("");
        generateCircleDrawable.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public void onDestroy() {
        super.onDestroy();
        this.livenessCheckPresenter.onDestroy();
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        super.MediaSessionCompat$ResultReceiverWrapper();
    }

    public final void MediaSessionCompat$QueueItem() {
        super.MediaSessionCompat$QueueItem();
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        super.AppCompatDelegateImpl$ListMenuDecorView();
    }
}
